package com.mygdx.game.UI;
import android.media.Image;
import android.os.Build;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class BaseAttackButton {
    protected Stage stage;
    private Texture texture;
    private int width;
    private int height;
    Image image1 = new Image(texture);
    public BaseAttackButton(Texture texture, int width, int height)
    {
        this.texture = texture;
        this.width = width;
        this.height = height;
        stage = new Stage(new ScreenViewport());
        stage.addActor(image1);
    }

}
