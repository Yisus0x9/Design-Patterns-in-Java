package org.designpatterns.creative.factory.abstract_factory.Armor;

public class HeavyArmor implements Armor{
    @Override
    public void protect() {
        System.out.println("Heavy armor protect");
    }
}
