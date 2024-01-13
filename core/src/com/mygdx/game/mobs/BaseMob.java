
package com.mygdx.game.mobs;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.characters.BaseChar;
import com.mygdx.game.characters.Warrior;

public class BaseMob extends Actor {    //actor je jakýkoliv prvek na stage (jde to i jinak ale když je to actor tak k němu rovnou můžeme přiřazovat zabudovaný actor funkce jako kliknutí atd.)
    private int mobHealth;
    private int mobAttack;
    private int mobDodge;

    public Texture img;

    @Override
    public void draw(Batch batch, float parentAlpha) {      //tohle je na vykreslení    (btw jestli chci zabudovaný funkce rodičovský classy dám CTRL + O)
        batch.draw(img,0,0, 100, 100);            //vykreslí img který definujeme v podclasse jako je rat.java a jeho pozici definuji zatím 0 0 ale potom bychom přidali proměnné
    }

    public BaseMob(int mobHealth, int mobAttack, int mobDodge)
    {
        this.mobHealth = mobHealth;
        this.mobAttack = mobAttack;
        this.mobDodge = mobDodge;
    }

    public int getMobHealth() {
        return mobHealth;
    }

    public int getMobDodge() {
        return mobDodge;
    }

    public int getMobAttack() {
        return mobAttack;
    }

    public void setMobHealth(int mobHealth) {
        this.mobHealth = mobHealth;
    }

    public void setMobDodge(int mobDodge) {
        this.mobDodge = mobDodge;
    }

    public void setMobAttack(int mobAttack) {
        this.mobAttack = mobAttack;
    }

    public void doAttack(BaseChar character, BaseMob mob)
    {
        character.setCharHealth(character.getCharHealth() - mob.getMobAttack());
    }
}
