package de.fmr.main;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.*;


public class Core extends ApplicationAdapter {


	Viewport viewport;
	SpriteBatch batch;
	OrthographicCamera cam;
	BitmapFont font;



	@Override
	public void create () {
		cam = new OrthographicCamera();
		cam.update();
		viewport = new StretchViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), cam);
		viewport.update(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());


		batch = new SpriteBatch();

		font = new BitmapFont();






		Game.startGame(100, 100);
	}

	@Override
	public void resize(int width, int height){
		viewport.update(width, height);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 1, 0, 1);
		Game.play(batch, cam);

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		font.dispose();
		Constants.GroundTextures[0].dispose();
		Constants.GroundTextures[1].dispose();
		Constants.GroundTextures[2].dispose();

	}
}
