
package com.mygdx.game.mobs;
public class BaseMob {
    private int health;
    private int attack;
    private int dodge;

    public BaseMob(int health, int attack, int dodge)
    {
        this.health = health;
        this.attack = attack;
        this.dodge = dodge;
    }

    public int getHealth() {
        return health;
    }

    public int getDodge() {
        return dodge;
    }

    public int getAttack() {
        return attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
