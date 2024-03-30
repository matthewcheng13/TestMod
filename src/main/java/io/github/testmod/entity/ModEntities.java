package io.github.testmod.entity;

import io.github.testmod.TestMod;
import io.github.testmod.entity.custom.GlobEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TestMod.MODID);

    public static final RegistryObject<EntityType<GlobEntity>> GLOB = ENTITY_TYPE.register("glob",
            () -> EntityType.Builder.of(GlobEntity::new, MobCategory.MONSTER)
                    .sized(2.04F, 2.04F)
                    .build("glob")) ;

    public static void register(IEventBus bus) {
        ENTITY_TYPE.register(bus);
    }

}
