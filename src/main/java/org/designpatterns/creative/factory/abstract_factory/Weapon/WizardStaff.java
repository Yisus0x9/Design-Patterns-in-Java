package org.designpatterns.creative.factory.abstract_factory.Weapon;

public class WizardStaff implements Weapon{
    @Override
    public String damage() {
        return "Use Wizard";
    }
}
