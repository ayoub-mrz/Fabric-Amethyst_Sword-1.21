package net.ayoubmrz.amethystswordmod;

import net.ayoubmrz.amethystswordmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.ActionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmethystSwordMod implements ModInitializer {
	public static final String MOD_ID = "amethystswordmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> { // TYPE THE FIRST P TO GET THE REST FROM INTELLiIJ
			if(entity instanceof LivingEntity livingEntity && !world.isClient() ) {
				if(player.getMainHandStack().getItem() == ModItems.AMETHYST_SWORD) {
					livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 1));
				}

				return ActionResult.PASS;
			}

			return ActionResult.PASS;
		});

	}
}