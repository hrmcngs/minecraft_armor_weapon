package minecraftarmorweapon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import minecraftarmorweapon.init.MinecraftArmorWeaponModMobEffects;
import minecraftarmorweapon.init.MinecraftArmorWeaponModItems;
import minecraftarmorweapon.init.MinecraftArmorWeaponModEnchantments;

import minecraftarmorweapon.entity.SkeltonMobEntity;
import minecraftarmorweapon.entity.OtiruyoEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class KaitenehuekutogaYouXiaoShinoteitukuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double zRadius3 = 0;
		double zRadius2 = 0;
		double yknockback = 0;
		double zRadius = 0;
		double xRadius2 = 0;
		double xRadius3 = 0;
		double xRadius4 = 0;
		double zRadius4 = 0;
		double dis = 0;
		double loop = 0;
		double X = 0;
		double Z2 = 0;
		double Y = 0;
		double Z3 = 0;
		double Z4 = 0;
		double Z = 0;
		double X2 = 0;
		double X3 = 0;
		double X4 = 0;
		double xknockback = 0;
		double loop2 = 0;
		double loop3 = 0;
		double zknockback = 0;
		double xRadius = 0;
		double loop4 = 0;
		double Y2 = 0;
		double Y3 = 0;
		double Y4 = 0;
		loop4 = Math.toRadians(entity.getYRot());
		xRadius4 = 3;
		zRadius4 = 3;
		for (int index0 = 0; index0 < 10; index0++) {
			loop4 = Math.toRadians(entity.getYRot());
			xRadius4 = xRadius4 + 0.1;
			zRadius4 = zRadius4 + 0.1;
			for (int index1 = 0; index1 < 72; index1++) {
				X4 = x + Math.cos(loop4) * xRadius4;
				Y4 = y + 1;
				Z4 = z + Math.sin(loop4) * zRadius4;
				if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MinecraftArmorWeaponModMobEffects.WIND_STEP_EFFECT.get()) : false) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(X4, Y4, Z4), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/particle dust 0.129 0.780 0.000 1 ~ ~ ~ 0.1 0.1 0.1 1 25");
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(X4, Y4, Z4), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 1 1 1 1 ~ ~ ~ 0.1 0.1 0.1 0 5");
				{
					final Vec3 _center = new Vec3(X4, Y4, Z4);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							if (!(entityiterator instanceof OtiruyoEntity)) {
								if (!(entityiterator instanceof SkeltonMobEntity)) {
									if (entityiterator instanceof Mob) {
										if (EnchantmentHelper.getItemEnchantmentLevel(MinecraftArmorWeaponModEnchantments.KILL.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
											if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MinecraftArmorWeaponModMobEffects.TUNDERBOLTEFFRCT.get()) : false) {
												if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
													_entity.addEffect(new MobEffectInstance(MinecraftArmorWeaponModMobEffects.THUNDER_HIT.get(), 100, 2, true, false));
											}
											if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MinecraftArmorWeaponModItems.WATER_KATANA.get()
													|| (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MinecraftArmorWeaponModMobEffects.BUBBLESHOT_EFFECT.get()) : false)) {
												if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
													_entity.addEffect(new MobEffectInstance(MinecraftArmorWeaponModMobEffects.TISSOKU.get(), 100, 2, true, false));
											}
											{
												Entity _ent = entityiterator;
												if (!_ent.level.isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "/kill @s");
												}
											}
											{
												Entity _ent = entityiterator;
												if (!_ent.level.isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "/deta merge entity @s (Health:0)");
												}
											}
										} else {
											if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MinecraftArmorWeaponModItems.WATER_KATANA.get()
													|| (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MinecraftArmorWeaponModMobEffects.BUBBLESHOT_EFFECT.get()) : false)) {
												if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
													_entity.addEffect(new MobEffectInstance(MinecraftArmorWeaponModMobEffects.TISSOKU.get(), 100, 2, true, false));
											}
											if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MinecraftArmorWeaponModMobEffects.TUNDERBOLTEFFRCT.get()) : false) {
												if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
													_entity.addEffect(new MobEffectInstance(MinecraftArmorWeaponModMobEffects.THUNDER_HIT.get(), 100, 2, true, false));
											}
											if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MinecraftArmorWeaponModItems.KURIKARAKEN.get()
													&& (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false)) {
												entityiterator.hurt(DamageSource.GENERIC, 10);
											}
											entityiterator.hurt(DamageSource.GENERIC, 10);
										}
										dis = Math.abs(xknockback) + Math.abs(yknockback) + Math.abs(zknockback);
									}
								}
							}
						}
					}
				}
				loop4 = loop4 + Math.toRadians(5);
			}
		}
	}
}
