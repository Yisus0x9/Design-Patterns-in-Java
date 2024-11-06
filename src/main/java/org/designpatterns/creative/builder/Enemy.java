package org.designpatterns.creative.builder;


public class Enemy {
    private String name;
    private String type;
    private Integer damage;
    private Integer health;
    private Integer endurance;

    public static EnemyBuilder builder(){
        return new EnemyBuilder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getEndurance() {
        return endurance;
    }

    public void setEndurance(Integer endurance) {
        this.endurance = endurance;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", damage=" + damage +
                ", health=" + health +
                ", endurance=" + endurance +
                '}';
    }
}

