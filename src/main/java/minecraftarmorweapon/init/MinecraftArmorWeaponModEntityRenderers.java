
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package minecraftarmorweapon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import minecraftarmorweapon.client.renderer.SkeltonMobRenderer;
import minecraftarmorweapon.client.renderer.BlackSpectralArrowRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinecraftArmorWeaponModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MinecraftArmorWeaponModEntities.MAHOUTANE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftArmorWeaponModEntities.BLACK_SPECTRAL_ARROW.get(), BlackSpectralArrowRenderer::new);
		event.registerEntityRenderer(MinecraftArmorWeaponModEntities.SKELTON_MOB.get(), SkeltonMobRenderer::new);
	}
}
