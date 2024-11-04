package org.designpatterns.creative.factory.abstract_factory.Factory;

import org.designpatterns.creative.factory.abstract_factory.Armor.Armor;
import org.designpatterns.creative.factory.abstract_factory.Armor.HeavyArmor;
import org.designpatterns.creative.factory.abstract_factory.Enemy.Enemy;
import org.designpatterns.creative.factory.abstract_factory.Enemy.Warrior;
import org.designpatterns.creative.factory.abstract_factory.Weapon.Axe;
import org.designpatterns.creative.factory.abstract_factory.Weapon.Weapon;

public class WarriorFactory extends EnemyAbstractFactory {
    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new Axe();
    }
}
