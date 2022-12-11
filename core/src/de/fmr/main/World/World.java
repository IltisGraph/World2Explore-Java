package de.fmr.main.World;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import de.fmr.main.Constants;

public class World {

    public int[][] tiles;

    public World(int[][] Tiles){
        this.tiles = Tiles;
    }

    public void renderTiles(SpriteBatch batch, OrthographicCamera cam){
        cam.update();

        batch.setProjectionMatrix(cam.combined);
        batch.begin();

        for(int x = 0; x < this.tiles.length; x++){
            for(int y = 0; y < this.tiles[x].length; y++){
                batch.draw(Constants.GroundTextures[this.tiles[x][y]], x*Constants.tileLength, y*Constants.tileLength, Constants.tileLength, Constants.tileLength);
            }
        }

        batch.end();


    }

}
