package com.mygdx.game.UI;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.characters.Warrior;
import com.mygdx.game.mobs.Rat;

public class AttackButton1 extends BaseAttackButton implements InputProcessor {
    Warrior onAttack;
    Rat rat;
    public AttackButton1(Warrior warrior, Rat rat) {
        super(100, 100, new Texture("button.png"));
        this.onAttack = warrior;
        this.rat = rat;
    }


    @Override
    public boolean keyDown(int X) {
        onAttack.doAttack(onAttack, rat);
        rat.setMobTexture(new Texture("warrior.png"));
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
