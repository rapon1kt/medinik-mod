package me.raponikt.medinik.block;

import me.raponikt.medinik.Medinik;
import me.raponikt.medinik.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Medinik.MOD_ID);

    public static final RegistryObject<Block> MEDRIOD_BLOCK = registerBlock("medriod_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> RAW_MEDRIOD_BLOCK = registerBlock("raw_medriod_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> MEDRIOD_ORE = registerBlock("medriod_ore",
            () -> new DropExperienceBlock(UniformInt.of(2,4), BlockBehaviour.Properties.of().strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_MEDRIOD_ORE = registerBlock("deepslate_medriod_ore",
            () -> new DropExperienceBlock(UniformInt.of(2,4), BlockBehaviour.Properties.of().strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }

}
