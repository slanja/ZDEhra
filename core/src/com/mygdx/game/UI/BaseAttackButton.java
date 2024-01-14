package com.mygdx.game.UI;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class BaseAttackButton {

    private Texture texture;
    private int width;
    private int height;

    public BaseAttackButton(Texture texture, int width, int height)
    {
        this.texture = texture;
        this.width = width;
        this.height = height;

    }

}
