package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.mobs.Rat;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;

	double widthScreen;
	double heightScreen;

	public  MyGdxGame(double width, double height) {
		super();
		this.widthScreen = width;
		this.heightScreen = height;
	}

	@Override
	public void render () {
		batch = new SpriteBatch();
		Rat krysa = new Rat();
		ScreenUtils.clear(0.5F, 0.5F, 0, 1);
		batch.begin();
		batch.draw(krysa.img, (float) (widthScreen/2), (float) (heightScreen/2), 200, 200);
		batch.draw(krysa.img, 100, 100,200,200);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}