package io.github.testmod.block;

import io.github.testmod.TestMod;
import io.github.testmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of().
                    strength(6f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().
                    strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)));

    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().
                    strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)));

    public static final RegistryObject<Block> NETHERRACK_RUBY_ORE = registerBlock("netherrack_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().
                    strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)));

    public static final RegistryObject<Block> ENDSTONE_RUBY_ORE = registerBlock("endstone_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().
                    strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
