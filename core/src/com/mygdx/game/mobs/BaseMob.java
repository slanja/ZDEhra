
package com.mygdx.game.mobs;

import com.mygdx.game.characters.BaseChar;
import com.mygdx.game.characters.Warrior;

public class BaseMob {
    private int mobHealth;
    private int mobAttack;
    private int mobDodge;

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
