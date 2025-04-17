package net.ayoubmrz.amethystswordmod.mixin;

import net.ayoubmrz.amethystswordmod.item.ModItems;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {
    @Inject(
            method = "tick",
            at = @At("HEAD")
    )
    private void onTick(CallbackInfo ci) {
        PlayerEntity player = (PlayerEntity)(Object)this;

        if (!player.getWorld().isClient() && player.age % 20 == 0) {
            ItemStack mainHand = player.getMainHandStack();
            if (mainHand.getItem() == ModItems.AMETHYST_SWORD) {
                player.addStatusEffect(new StatusEffectInstance(
                        StatusEffects.STRENGTH,
                        25,
                        1,
                        false, false, true
                ));
            }
        }
    }
}
