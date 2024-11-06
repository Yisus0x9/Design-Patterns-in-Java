package org.designpatterns.creative.builder;

public class TestBuilder {
    public static void main(String[] args) {
        Enemy enemy = Enemy.builder().
                name("Yisus").
                type("Rare").
                endurance(100).
                health(10000).
                damage(300).build();
        System.out.println(enemy.toString());
    }
}
