package org.designpatterns.creative.factory.abstract_factory.Factory;

import org.designpatterns.creative.factory.abstract_factory.Armor.Armor;
import org.designpatterns.creative.factory.abstract_factory.Armor.Robe;
import org.designpatterns.creative.factory.abstract_factory.Enemy.Enemy;
import org.designpatterns.creative.factory.abstract_factory.Enemy.Wizard;
import org.designpatterns.creative.factory.abstract_factory.Weapon.Weapon;
import org.designpatterns.creative.factory.abstract_factory.Weapon.WizardStaff;

public class WizardFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Wizard();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }
}
