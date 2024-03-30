package io.github.testmod.events;

import io.github.testmod.TestMod;
import io.github.testmod.entity.ModEntities;
import io.github.testmod.entity.custom.GlobEntity;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TestMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GLOB.get(), GlobEntity.createMobAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(ModEntities.GLOB.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, GlobEntity::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.OR);
    }
}
