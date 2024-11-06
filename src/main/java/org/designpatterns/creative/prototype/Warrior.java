package org.designpatterns.creative.prototype;

public class Warrior extends Enemy{

    private Integer endurance;

    public Warrior(Integer health, Integer damage, Integer endurance) {
        super(health, damage);
        this.endurance = endurance;
    }

    public Warrior(Warrior warrior) {
        super(warrior);
        if(warrior!=null)
            setEndurance(warrior.getEndurance());
    }

    @Override
    public Enemy clone() {
        return new Warrior(this);
    }

    public Integer getEndurance() {
        return endurance;
    }

    public void setEndurance(Integer endurance) {
        this.endurance = endurance;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "endurance=" + endurance +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
