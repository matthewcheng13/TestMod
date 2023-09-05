package io.github.testmod.item.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SapphireStaffItem extends Item {
    public static final int MAX_DRAW_DURATION = 20;
    private int explosionPower = 1;

    public SapphireStaffItem(Properties properties) {
        super(properties);
    }

//    public void releaseUsing(ItemStack itemStack, Level level, LivingEntity livingEntity, int num) {
//
//    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemstack = player.getUseItem();
        level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.FIRECHARGE_USE, SoundSource.NEUTRAL, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
        if (!level.isClientSide) {
            LargeFireball fireball = new LargeFireball(level, player, 0, 0, 0, 0);
            // SmallFireball fireball = new SmallFireball(EntityType.SMALL_FIREBALL, level);
            // SmallFireball fireball = new SmallFireball(level, player, 0, 0, 0);
            // fireball.setItem(itemstack);
            fireball.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
            level.addFreshEntity(fireball);
        }

        player.awardStat(Stats.ITEM_USED.get(this));
//        if (!player.getAbilities().instabuild) {
//            itemstack.shrink(1);
//        }

        return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
    }

    private int getExplosionPower() {
        return this.explosionPower;
}

}
