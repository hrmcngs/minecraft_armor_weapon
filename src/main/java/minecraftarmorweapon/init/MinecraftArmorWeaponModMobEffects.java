
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package minecraftarmorweapon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import minecraftarmorweapon.potion.TunderbolteffrctMobEffect;
import minecraftarmorweapon.potion.TamewazaMobEffect;
import minecraftarmorweapon.potion.OtiruyooMobEffect;
import minecraftarmorweapon.potion.KaitennMobEffect;
import minecraftarmorweapon.potion.FireballeffectMobEffect;
import minecraftarmorweapon.potion.BowAttackMobEffect;
import minecraftarmorweapon.potion.AttackBubbleshotMobEffect;
import minecraftarmorweapon.potion.AttackBowMobEffect;
import minecraftarmorweapon.potion.AtarutoMobEffect;
import minecraftarmorweapon.potion.Arrow1MobEffect;

import minecraftarmorweapon.MinecraftArmorWeaponMod;

public class MinecraftArmorWeaponModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MinecraftArmorWeaponMod.MODID);
	public static final RegistryObject<MobEffect> FIREBALLEFFECT = REGISTRY.register("fireballeffect", () -> new FireballeffectMobEffect());
	public static final RegistryObject<MobEffect> ARROW_1 = REGISTRY.register("arrow_1", () -> new Arrow1MobEffect());
	public static final RegistryObject<MobEffect> TUNDERBOLTEFFRCT = REGISTRY.register("tunderbolteffrct", () -> new TunderbolteffrctMobEffect());
	public static final RegistryObject<MobEffect> ATARUTO = REGISTRY.register("ataruto", () -> new AtarutoMobEffect());
	public static final RegistryObject<MobEffect> BOW_ATTACK = REGISTRY.register("bow_attack", () -> new BowAttackMobEffect());
	public static final RegistryObject<MobEffect> ATTACK_BOW = REGISTRY.register("attack_bow", () -> new AttackBowMobEffect());
	public static final RegistryObject<MobEffect> ATTACK_BUBBLESHOT = REGISTRY.register("attack_bubbleshot", () -> new AttackBubbleshotMobEffect());
	public static final RegistryObject<MobEffect> KAITENN = REGISTRY.register("kaitenn", () -> new KaitennMobEffect());
	public static final RegistryObject<MobEffect> TAMEWAZA = REGISTRY.register("tamewaza", () -> new TamewazaMobEffect());
	public static final RegistryObject<MobEffect> OTIRUYOO = REGISTRY.register("otiruyoo", () -> new OtiruyooMobEffect());
}
