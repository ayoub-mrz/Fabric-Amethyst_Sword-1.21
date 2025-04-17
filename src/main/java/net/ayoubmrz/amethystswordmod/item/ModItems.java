package net.ayoubmrz.amethystswordmod.item;

import net.ayoubmrz.amethystswordmod.AmethystSwordMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {

    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword",
            new SwordItem(ModToolMaterials.AMETHYST_SHARD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AMETHYST_SHARD, 3, -2.4f))) {
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.amethystswordmod.amethyst_sword.tooltip1"));
                    tooltip.add(Text.translatable("tooltip.amethystswordmod.amethyst_sword.tooltip2"));
                    tooltip.add(Text.translatable("tooltip.amethystswordmod.amethyst_sword.tooltip3"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AmethystSwordMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AmethystSwordMod.LOGGER.info("Registering Mod Items for " + AmethystSwordMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(AMETHYST_SWORD);
        });
    }
}
