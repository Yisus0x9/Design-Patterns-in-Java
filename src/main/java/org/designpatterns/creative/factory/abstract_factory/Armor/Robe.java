package org.designpatterns.creative.factory.abstract_factory.Armor;

public class Robe implements Armor{
    @Override
    public void protect() {
        System.out.println("robe protect");
    }
}
