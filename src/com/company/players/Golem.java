package com.company.players;

public class Golem extends Hero {
    public Golem(int health, int damage, SuperAbility superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i< heroes.length; i++){
            if (heroes[i].getHealth() > 0) {
                heroes[i].setHealth((boss.getDamage() - heroes[i].getDamage()) + heroes[i].getDamage());
            }
        }

    }
}
