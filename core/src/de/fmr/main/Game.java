package de.fmr.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import de.fmr.main.World.*;

public class Game {

    public static World curWorld;


    public static void startGame(int WorldTilesWidth, int WorldTilesHeight){
        curWorld = WorldGenerator.generateWorld(WorldTilesWidth, WorldTilesHeight);

    }

    public static void play(SpriteBatch batch, OrthographicCamera cam){

        curWorld.renderTiles(batch, cam);

        if(Gdx.input.isKeyPressed(Input.Keys.W)) cam.position.y += Constants.pxspeed;
        if(Gdx.input.isKeyPressed(Input.Keys.A)) cam.position.x -= Constants.pxspeed;
        if(Gdx.input.isKeyPressed(Input.Keys.S)) cam.position.y -= Constants.pxspeed;
        if(Gdx.input.isKeyPressed(Input.Keys.D)) cam.position.x += Constants.pxspeed;
    }




}
