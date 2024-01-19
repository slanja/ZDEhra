package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.UI.AttackButton1;
import com.mygdx.game.UI.BaseAttackButton;
import com.mygdx.game.characters.Warrior;
import com.mygdx.game.mobs.Rat;

public class MyGdxGame extends ApplicationAdapter {
	double widthScreen;
	double heightScreen;
	Stage stage;

	public  MyGdxGame(double width, double height) {
		super();
		this.widthScreen = width;
		this.heightScreen = height;
	}

	@Override
	public void create() {	//ještě před renderem bychom měli některý věci vytvořit, aby se nevytvářeli během renderu říkal někdo
		stage = new Stage(new ScreenViewport());	//použivám stage, stage je jakoby část hry kterou jen měníš ale v základu je stejná, naše hlavní stage teda je hra ale bude i vedlejší stage třeba jako loading screen (jestli to nejde pochopit vysvětlím
													//screen viewport by mělo automaticky brát rozlišení obrazovky a na základě toho vytvořit stage v tom rozlišení
				//render něčeho nemůže pobírat inputy jako klikání myší etc. ale stage to umí takže předávám Gdx prvkům input který snímá stage
		Rat krysa = new Rat();			//vytvoří actora
		Warrior helda = new Warrior();
		AttackButton1 attackButton1 = new AttackButton1(helda,krysa);
		Gdx.input.setInputProcessor(attackButton1); //input is set to attackButton1, because InputProcessor is in attackButton1 class
		stage.addActor(krysa);			//přídá actora krysa do stage
		stage.addActor(attackButton1);
		stage.addActor(helda);
	}

	@Override
	public void render () {	//POZOR RENDER DÁ NAVRH TO CO JE NÍŽ TAKŽE STAGE DÁM AŽ ZA POZADÍ
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);	//idk co to je prý to má existovat na začátku renderu
		ScreenUtils.clear(0.5F, 0.5F, 0, 1);	//pozadí

		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();			//vyrenderuje stage a neměl bych muset renderovat každý objekt zvlášť protože objekty jsou actoři ve stage

		/*batch = new SpriteBatch();
		batch.begin();
		batch.draw(krysa.img, (float) (widthScreen/2), (float) (heightScreen/2), 200, 200);
		batch.draw(krysa.img, 100, 100,200,200);
		batch.end(); */


	//	BaseAttackButton attackButton = new BaseAttackButton(new Texture(Gdx.files.internal("rat.png")),600,500);
	//	Gdx.gl.glClearColor(1,1,1,1);
	//	Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
	
	@Override
	public void dispose () {
		stage.dispose();
	}
}