package org.designpatterns.creative.prototype;

import java.sql.SQLOutput;

public class TestPrototype {
    public static void main(String[] args) {
        Warrior warrior1=new Warrior(100,100,100);
        Warrior warrior2=(Warrior) warrior1.clone();
        Warrior warrior3=(Warrior) warrior1.clone();
        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println(warrior3);
        warrior2.setEndurance(0);
        warrior1.setHealth(0);
        System.out.println("********************************");
        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println(warrior3);

        System.out.println("************WIZARD************");
        Wizard m1=new Wizard(100,100,100);
        Wizard m2=(Wizard) m1.clone();
        Wizard m3=(Wizard) m1.clone();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        m1.setMana(0);
        m3.setDamage(50);
        System.out.println("*********************************");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);




    }
}
