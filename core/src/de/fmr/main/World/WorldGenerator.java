package de.fmr.main.World;

import java.util.Random;

public class WorldGenerator {

    private static Random random = new Random();

    public static World generateWorld(int tilesWidth, int tilesHeight){

        int[][] out = new int[tilesWidth][tilesHeight];

        for(int x = 0; x < tilesWidth; x++){
            for(int y = 0; y < tilesHeight; y++){
                out[x][y] = random.nextInt(3);
            }
        }

        return new World(out);

    }

}
