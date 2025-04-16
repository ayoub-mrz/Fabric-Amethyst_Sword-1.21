package net.ayoubmrz.amethystswordmod.util;

import net.ayoubmrz.amethystswordmod.AmethystSwordMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
    public static final TagKey<Block> INCORRECT_FOR_AMETHYST_TOOL = createTag("incorrect_for_amethyst_tool");

    private static TagKey<Block> createTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(AmethystSwordMod.MOD_ID, name));
    }
}

public static class Items {

    private static TagKey<Item> createTag(String name) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(AmethystSwordMod.MOD_ID, name));
    }
}
}
