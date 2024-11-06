package org.designpatterns.creative.prototype;

import org.designpatterns.creative.builder.EnemyBuilder;

public abstract class Enemy {
    protected Integer health;
    protected Integer damage;

    public Enemy(Integer health, Integer damage) {
        this.health = health;
        this.damage = damage;
    }

    public Enemy(Enemy enemy){
        if(enemy!=null)
            setHealth(enemy.getHealth());
            setDamage(enemy.getDamage());
    }

    public abstract Enemy clone();

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "health=" + health +
                ", damage=" + damage +
                '}';
    }
}
