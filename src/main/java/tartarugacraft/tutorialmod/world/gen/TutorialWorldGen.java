package tartarugacraft.tutorialmod.world.gen;

import java.util.Random;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import tartarugacraft.tutorialmod.init.ModBlocks;

public class TutorialWorldGen implements IWorldGenerator{

	private final WorldGenMinable tutorialOverworldGen;
	
	public TutorialWorldGen() {
		tutorialOverworldGen = new WorldGenMinable(ModBlocks.BLACK_BLOCK_INGOT.getDefaultState(), 15, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionType()) {
		case NETHER:			
			break;
		case OVERWORLD:
			genStandard(tutorialOverworldGen, world, random, chunkX, chunkZ, 10, 0, 25);
			break;
		case THE_END:
			break;
		}
		
	}
	
	public void genStandard(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int spawnTries, int minHeight, int maxHeight) {
		if(minHeight < 0) minHeight = 0;
		if(maxHeight > 255) maxHeight = 255;
		
		if(maxHeight < minHeight) {
			int i = minHeight;
			minHeight = maxHeight;
			maxHeight = i;
		}else if(maxHeight == minHeight) {
			maxHeight++;
		}else {
			minHeight--;
		}
		
		BlockPos chunkPosAsBlockPos = new BlockPos(chunkX << 4, 0, chunkZ <<4);
		int heightDiff = maxHeight - minHeight;
		
		for (int i = 0; i < spawnTries; i++) {
			generator.generate(world, random, chunkPosAsBlockPos.add(random.nextInt(16), minHeight+random.nextInt(heightDiff), random.nextInt(16)));
		}
	}

}
