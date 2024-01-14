package com.mygdx.game.UI;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import org.w3c.dom.Text;

public class BaseAttackButton extends Actor {

    public String stringTexture;
    public Texture buttonTexture;
    public int buttonWidth;
    public int buttonHeight;

    public ImageButton button;



    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(buttonTexture, 100, 100, buttonWidth, buttonHeight);
    }

    public BaseAttackButton(int width, int height)
    {
        this.buttonWidth = width;
        this.buttonHeight = height;
    }

}
