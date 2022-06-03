package me.melontini.pantriesdelight;

import com.nhoryzon.mc.farmersdelight.block.PantryBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PantriesDelight implements ModInitializer {
    public static final Block BM_BLIGHTED_BALSA_PANTRY = new PantryBlock(FabricBlockSettings.copyOf(Blocks.BARREL));
    public static final Block BM_WILLOW_PANTRY = new PantryBlock(FabricBlockSettings.copyOf(Blocks.BARREL));
    public static final Block BM_CYPRESS_PANTRY = new PantryBlock(FabricBlockSettings.copyOf(Blocks.BARREL));
    public static final Block BM_ANCIENT_OAK_PANTRY = new PantryBlock(FabricBlockSettings.copyOf(Blocks.BARREL));
    public static final Block CD_SCORCHED_PANTRY = new PantryBlock(FabricBlockSettings.copyOf(Blocks.BARREL));
    public static final Block CD_UMBRAL_PANTRY = new PantryBlock(FabricBlockSettings.copyOf(Blocks.BARREL));
    public static final Block TRA_FIR_PANTRY = new PantryBlock(FabricBlockSettings.copyOf(Blocks.BARREL));
    public static final Block BLOCKUS_BAMBOO_PANTRY = new PantryBlock(FabricBlockSettings.copyOf(Blocks.BARREL));
    public static final Block BLOCKUS_WHITE_OAK_PANTRY = new PantryBlock(FabricBlockSettings.copyOf(Blocks.BARREL));
    @Override
    public void onInitialize() {
        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
            //blocks
            Registry.register(Registry.BLOCK, new Identifier("pantriesdelight", "bm_blighted_balsa_pantry"), BM_BLIGHTED_BALSA_PANTRY);
            Registry.register(Registry.BLOCK, new Identifier("pantriesdelight", "bm_willow_pantry"), BM_WILLOW_PANTRY);
            Registry.register(Registry.BLOCK, new Identifier("pantriesdelight", "bm_cypress_pantry"), BM_CYPRESS_PANTRY);
            Registry.register(Registry.BLOCK, new Identifier("pantriesdelight", "bm_ancient_oak_pantry"), BM_ANCIENT_OAK_PANTRY);
            //blockItems
            Registry.register(Registry.ITEM, new Identifier("pantriesdelight", "bm_blighted_balsa_pantry"), new BlockItem(BM_BLIGHTED_BALSA_PANTRY, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
            Registry.register(Registry.ITEM, new Identifier("pantriesdelight", "bm_willow_pantry"), new BlockItem(BM_WILLOW_PANTRY, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
            Registry.register(Registry.ITEM, new Identifier("pantriesdelight", "bm_cypress_pantry"), new BlockItem(BM_CYPRESS_PANTRY, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
            Registry.register(Registry.ITEM, new Identifier("pantriesdelight", "bm_ancient_oak_pantry"), new BlockItem(BM_ANCIENT_OAK_PANTRY, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        }
        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
            //blocks
            Registry.register(Registry.BLOCK, new Identifier("pantriesdelight", "cd_scorched_pantry"), CD_SCORCHED_PANTRY);
            Registry.register(Registry.BLOCK, new Identifier("pantriesdelight", "cd_umbral_pantry"), CD_UMBRAL_PANTRY);
            //items
            Registry.register(Registry.ITEM, new Identifier("pantriesdelight", "cd_scorched_pantry"), new BlockItem(CD_SCORCHED_PANTRY, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
            Registry.register(Registry.ITEM, new Identifier("pantriesdelight", "cd_umbral_pantry"), new BlockItem(CD_UMBRAL_PANTRY, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        }
        if (FabricLoader.getInstance().isModLoaded("traverse")) {
            Registry.register(Registry.BLOCK, new Identifier("pantriesdelight", "tra_fir_pantry"), TRA_FIR_PANTRY);
            Registry.register(Registry.ITEM, new Identifier("pantriesdelight", "tra_fir_pantry"), new BlockItem(TRA_FIR_PANTRY, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        }
        if (FabricLoader.getInstance().isModLoaded("blockus")) {
            Registry.register(Registry.BLOCK, new Identifier("pantriesdelight", "blockus_bamboo_pantry"), BLOCKUS_BAMBOO_PANTRY);
            Registry.register(Registry.BLOCK, new Identifier("pantriesdelight", "blockus_white_oak_pantry"), BLOCKUS_WHITE_OAK_PANTRY);
            //items
            Registry.register(Registry.ITEM, new Identifier("pantriesdelight", "blockus_bamboo_pantry"), new BlockItem(BLOCKUS_BAMBOO_PANTRY, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
            Registry.register(Registry.ITEM, new Identifier("pantriesdelight", "blockus_white_oak_pantry"), new BlockItem(BLOCKUS_WHITE_OAK_PANTRY, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        }
    }
}
