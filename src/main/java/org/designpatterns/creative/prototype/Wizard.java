package org.designpatterns.creative.prototype;

public class Wizard extends Enemy{
    private Integer mana;

    public Wizard(Integer health, Integer damage, Integer mana) {
        super(health, damage);
        this.mana = mana;
    }

    public Wizard(Wizard wizard) {
        super(wizard);
        if(wizard!=null)
            setMana(wizard.getMana());
    }

    @Override
    public Enemy clone() {
        return new Wizard(this);
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
