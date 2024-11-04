package org.designpatterns.creative.factory.abstract_factory.Enemy;

public class Wizard implements Enemy {
    @Override
    public String attack() {
        return "Mage attack";
    }
}
