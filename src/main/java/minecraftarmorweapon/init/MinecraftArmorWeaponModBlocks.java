
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package minecraftarmorweapon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import minecraftarmorweapon.block.StoneKatanaBlockBlock;
import minecraftarmorweapon.block.RoseBlock;
import minecraftarmorweapon.block.NetheriteKatanaBlockBlock;

import minecraftarmorweapon.MinecraftArmorWeaponMod;

public class MinecraftArmorWeaponModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftArmorWeaponMod.MODID);
	public static final RegistryObject<Block> ROSE = REGISTRY.register("rose", () -> new RoseBlock());
	public static final RegistryObject<Block> NETHERITE_KATANA_BLOCK = REGISTRY.register("netherite_katana_block", () -> new NetheriteKatanaBlockBlock());
	public static final RegistryObject<Block> STONE_KATANA_BLOCK = REGISTRY.register("stone_katana_block", () -> new StoneKatanaBlockBlock());
}
