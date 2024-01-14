package com.mygdx.game.characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.compression.lzma.Base;
import com.mygdx.game.mobs.BaseMob;
import com.mygdx.game.mobs.Rat;

public class BaseChar {
        private int charHealth;
        private int charAttack;
        private int charDodge;
        private Texture charTexture;

        public BaseChar(int charHealth, int charAttack, int charDodge, Texture charTexture)
        {
                this.charHealth = charHealth;
                this.charAttack = charAttack;
                this.charDodge = charDodge;
                this.charTexture = charTexture;
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

        public Texture getCharTexture() {
                return charTexture;
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

        public void setCharTexture(Texture charTexture) {
                this.charTexture = charTexture;
        }

        public void doAttack(BaseChar character, BaseMob mob)
        {
                mob.setMobHealth(mob.getMobHealth() - character.getCharAttack());
        }
}
