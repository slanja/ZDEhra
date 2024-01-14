package com.mygdx.game.UI;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import org.w3c.dom.Text;

public class BaseAttackButton extends Actor {

    private String stringTexture;
    private Texture buttonTexture;
    private int buttonWidth;
    private int buttonHeight;

    private ImageButton button;



    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(buttonTexture, 100, 100, buttonWidth, buttonHeight);
    }

    public BaseAttackButton(int width, int height, Texture texture)
    {
        this.buttonWidth = width;
        this.buttonHeight = height;
        this.buttonTexture = texture;
    }

    public String getStringTexture() {
        return stringTexture;
    }

    public Texture getButtonTexture() {
        return buttonTexture;
    }

    public int getButtonWidth() {
        return buttonWidth;
    }

    public int getButtonHeight() {
        return buttonHeight;
    }

    public ImageButton getButton() {
        return button;
    }

    public void setStringTexture(String stringTexture) {
        this.stringTexture = stringTexture;
    }

    public void setButtonTexture(Texture buttonTexture) {
        this.buttonTexture = buttonTexture;
    }

    public void setButtonWidth(int buttonWidth) {
        this.buttonWidth = buttonWidth;
    }

    public void setButtonHeight(int buttonHeight) {
        this.buttonHeight = buttonHeight;
    }

    public void setButton(ImageButton button) {
        this.button = button;
    }
}
