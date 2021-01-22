package com.company.players;

public  class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }


    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int numRandom = 0;

        for (int i= 0; i< heroes.length; i++){
            if (heroes[i].getHealth() > 0)
                numRandom = 2 + (int)(Math.random() *2) +1;
                heroes[i].setDamage(heroes[i].getDamage() * numRandom);

        }


    }

}
