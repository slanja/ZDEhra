package com.mygdx.game.UI;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.mygdx.game.characters.Warrior;
import com.mygdx.game.mobs.Rat;

public class AttackButton1 extends BaseAttackButton implements InputProcessor{
    Warrior onAttack;
    Rat rat;
    Skin attButton1Skin = new Skin(Gdx.files.internal("attackButton1.json"));
    ImageButton attButton1Image = new ImageButton(attButton1Skin);
    public AttackButton1(Warrior warrior, Rat rat) {
        super(100, 100, new Texture("button.png"));
        this.onAttack = warrior;
        this.rat = rat;
        this.attButton1Image.setSize(600,400);
    }

    @Override //On button press SPACE, doAttack char to enemy = minus health
    public boolean keyDown(int X) {
        if(X == Input.Keys.SPACE)
        {
            onAttack.doAttack(onAttack, rat);
            System.out.println(rat.getMobHealth());
            rat.setMobTexture(new Texture("warrior.png"));
        }
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchCancelled(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }
}
