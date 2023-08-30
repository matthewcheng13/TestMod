package io.github.testmod.item;

import io.github.testmod.TestMod;
import io.github.testmod.item.custom.ModArmorItem;
import io.github.testmod.item.custom.RubyStaffItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GARNET = ITEMS.register("garnet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GLOB_CRYSTAL = ITEMS.register("glob_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY_STAFF = ITEMS.register("ruby_staff",
            () -> new RubyStaffItem(new Item.Properties().durability(600)));

    public static final RegistryObject<Item> GARNET_SWORD = ITEMS.register("garnet_sword",
            () -> new SwordItem(ModToolTiers.GARNET, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> GARNET_PICKAXE = ITEMS.register("garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GARNET, 1, 3, new Item.Properties()));
    public static final RegistryObject<Item> GARNET_AXE = ITEMS.register("garnet_axe",
            () -> new AxeItem(ModToolTiers.GARNET, 6, 0, new Item.Properties()));
    public static final RegistryObject<Item> GARNET_SHOVEL = ITEMS.register("garnet_shovel",
            () -> new ShovelItem(ModToolTiers.GARNET, 0, 4, new Item.Properties()));
    public static final RegistryObject<Item> GARNET_HOE = ITEMS.register("garnet_hoe",
            () -> new HoeItem(ModToolTiers.GARNET, 0, 4, new Item.Properties()));

    public static final RegistryObject<Item> GARNET_HELMET = ITEMS.register("garnet_helmet",
            () -> new ModArmorItem(ModArmorMaterials.GARNET, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GARNET_CHESTPLATE = ITEMS.register("garnet_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.GARNET, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> GARNET_LEGGINGS = ITEMS.register("garnet_leggings",
            () -> new ModArmorItem(ModArmorMaterials.GARNET, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> GARNET_BOOTS = ITEMS.register("garnet_boots",
            () -> new ModArmorItem(ModArmorMaterials.GARNET, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().food(ModFoods.ORANGE)));
    public static final RegistryObject<Item> CHERRY = ITEMS.register("cherry",
            () -> new Item(new Item.Properties().food(ModFoods.CHERRY)));
    public static final RegistryObject<Item> CHOCOLATE_MILK = ITEMS.register("chocolate_milk",
            () -> new MilkBucketItem(new Item.Properties().food(ModFoods.CHOCOLATE_MILK).stacksTo(1)));
    public static final RegistryObject<Item> FRUIT_PUNCH = ITEMS.register("fruit_punch",
            () -> new MilkBucketItem(new Item.Properties().food(ModFoods.FRUIT_PUNCH).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
