package io.github.testmod.item;

import io.github.testmod.TestMod;
import io.github.testmod.item.custom.ModArmorItem;
import io.github.testmod.item.custom.RubyStaffItem;
import io.github.testmod.item.custom.SapphireStaffItem;
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

    public static final RegistryObject<Item> GLOB_SHARD = ITEMS.register("glob_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLOB_CRYSTAL = ITEMS.register("glob_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PRISMASTEEL = ITEMS.register("prismasteel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PRISMIUM = ITEMS.register("prismium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY_STAFF = ITEMS.register("ruby_staff",
            () -> new RubyStaffItem(new Item.Properties().durability(600)));
    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff",
            () -> new SapphireStaffItem(new Item.Properties().durability(600)));

    public static final RegistryObject<Item> GARNET_SWORD = ITEMS.register("garnet_sword",
            () -> new SwordItem(ModToolTiers.GARNET, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> GARNET_PICKAXE = ITEMS.register("garnet_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GARNET, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> GARNET_AXE = ITEMS.register("garnet_axe",
            () -> new AxeItem(ModToolTiers.GARNET, 5, -3f, new Item.Properties()));
    public static final RegistryObject<Item> GARNET_SHOVEL = ITEMS.register("garnet_shovel",
            () -> new ShovelItem(ModToolTiers.GARNET, 1.5f, -3f, new Item.Properties()));
    public static final RegistryObject<Item> GARNET_HOE = ITEMS.register("garnet_hoe",
            () -> new HoeItem(ModToolTiers.GARNET, -5, 0, new Item.Properties()));

    public static final RegistryObject<Item> GARNET_HELMET = ITEMS.register("garnet_helmet",
            () -> new ModArmorItem(ModArmorMaterials.GARNET, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GARNET_CHESTPLATE = ITEMS.register("garnet_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.GARNET, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> GARNET_LEGGINGS = ITEMS.register("garnet_leggings",
            () -> new ModArmorItem(ModArmorMaterials.GARNET, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> GARNET_BOOTS = ITEMS.register("garnet_boots",
            () -> new ModArmorItem(ModArmorMaterials.GARNET, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> PRISMIUM_SWORD = ITEMS.register("prismium_sword",
            () -> new SwordItem(ModToolTiers.PRISMIUM, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> PRISMIUM_PICKAXE = ITEMS.register("prismium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PRISMIUM, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> PRISMIUM_AXE = ITEMS.register("prismium_axe",
            () -> new AxeItem(ModToolTiers.PRISMIUM, 5, -3f, new Item.Properties()));
    public static final RegistryObject<Item> PRISMIUM_SHOVEL = ITEMS.register("prismium_shovel",
            () -> new ShovelItem(ModToolTiers.PRISMIUM, 1.5f, -3f, new Item.Properties()));
    public static final RegistryObject<Item> PRISMIUM_HOE = ITEMS.register("prismium_hoe",
            () -> new HoeItem(ModToolTiers.PRISMIUM, -5, 0, new Item.Properties()));

    public static final RegistryObject<Item> PRISMIUM_HELMET = ITEMS.register("prismium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.PRISMIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PRISMIUM_CHESTPLATE = ITEMS.register("prismium_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.PRISMIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PRISMIUM_LEGGINGS = ITEMS.register("prismium_leggings",
            () -> new ModArmorItem(ModArmorMaterials.PRISMIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PRISMIUM_BOOTS = ITEMS.register("prismium_boots",
            () -> new ModArmorItem(ModArmorMaterials.PRISMIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

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
