package org.designpatterns.creative.factory.abstract_factory.Factory;

import org.designpatterns.creative.factory.abstract_factory.Armor.Armor;
import org.designpatterns.creative.factory.abstract_factory.Enemy.Enemy;
import org.designpatterns.creative.factory.abstract_factory.Weapon.Weapon;

public abstract class EnemyAbstractFactory {
    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
