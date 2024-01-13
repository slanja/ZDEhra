package com.mygdx.game.characters;

import com.badlogic.gdx.utils.compression.lzma.Base;
import com.mygdx.game.mobs.BaseMob;
import com.mygdx.game.mobs.Rat;

public class BaseChar {
        private int charHealth;
        private int charAttack;
        private int charDodge;

        public BaseChar(int charHealth, int charAttack, int charDodge)
        {
                this.charHealth = charHealth;
                this.charAttack = charAttack;
                this.charDodge = charDodge;
        }

        public int getCharHealth() {
                return charHealth;
        }

        public int getCharDodge() {
                return charDodge;
        }

        public int getCharAttack() {
                return charAttack;
        }

        public void setCharHealth(int charHealth) {
                this.charHealth = charHealth;
        }

        public void setCharDodge(int charDodge) {
                this.charDodge = charDodge;
        }

        public void setCharAttack(int charAttack) {
                this.charAttack = charAttack;
        }

        public void doAttack(BaseChar character, BaseMob mob)
        {
                mob.setMobHealth(mob.getMobHealth() - character.getCharAttack());
        }
}
