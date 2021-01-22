package com.company.players;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int numRandom = 0;
        for (int i = 0; i<heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                numRandom = 20 + (int) (Math.random() * 40);
                heroes[i].setDamage(heroes[i].getDamage() + numRandom);
                System.out.println("Magic увеличил атаку на " + numRandom);


            }
        }


    }
}
