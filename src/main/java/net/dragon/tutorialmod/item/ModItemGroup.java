package net.dragon.tutorialmod.item;

import net.dragon.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup TANZANITE;

    public static void registerItemGroup() {
        TANZANITE = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID, "tanzanite"))
                .displayName(Text.translatable("itemgroup.tranzanite"))
                .icon(() -> new ItemStack(ModItems.TANZANITE)).build();
    }


}
