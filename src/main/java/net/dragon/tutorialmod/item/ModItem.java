package net.dragon.tutorialmod.item;

import net.dragon.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem {
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings()));
    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, TANZANITE);
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_TANZANITE);

    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}