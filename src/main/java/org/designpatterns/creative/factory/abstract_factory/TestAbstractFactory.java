package org.designpatterns.creative.factory.abstract_factory;

import org.designpatterns.creative.factory.abstract_factory.Factory.EnemyAbstractFactory;
import org.designpatterns.creative.factory.abstract_factory.Factory.WarriorFactory;
import org.designpatterns.creative.factory.abstract_factory.Factory.WizardFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        EnemyAbstractFactory enemyFactory= new WarriorFactory();
        System.out.println(enemyFactory.createEnemy().attack());
        enemyFactory.createArmor().protect();
        System.out.println(enemyFactory.createWeapon().damage());

        enemyFactory=new WizardFactory();
        System.out.println(enemyFactory.createEnemy().attack());
        enemyFactory.createArmor().protect();
        System.out.println(enemyFactory.createWeapon().damage());

    }
}
