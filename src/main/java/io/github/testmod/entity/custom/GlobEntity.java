package io.github.testmod.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.level.Level;

public class GlobEntity
extends Slime {
    public GlobEntity(EntityType<? extends Slime> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected float getJumpPower() {
        return super.getJumpPower()*2;
    }
}
