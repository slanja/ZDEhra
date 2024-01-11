package com.mygdx.game.mobs;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Rat extends BaseMob {
    public SpriteBatch batch;
    public Texture img;
    public Rat()
    {
        super(50,10,10);
        this.batch = new SpriteBatch();
        this.img = new Texture("badlogic.jpg");
    }


}
