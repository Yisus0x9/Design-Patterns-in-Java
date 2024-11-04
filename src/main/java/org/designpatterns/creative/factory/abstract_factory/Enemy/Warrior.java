package org.designpatterns.creative.factory.abstract_factory.Enemy;

public class Warrior implements Enemy {
    @Override
    public String attack() {
        return "Warrior attack";
    }
}
