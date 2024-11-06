package org.designpatterns.creative.builder;

//Dupñicación de codigo de clase
//Construir objetos con atributos elegidos
public class EnemyBuilder {
    private String name;
    private String type;
    private Integer damage;
    private Integer health;
    private Integer endurance;


    public String getName() {
        return name;
    }

    public EnemyBuilder name(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public EnemyBuilder type(String type) {
        this.type = type;
        return this;
    }

    public Integer getDamage() {
        return damage;
    }

    public EnemyBuilder damage(Integer damage) {
        this.damage = damage;
        return this;
    }

    public Integer getHealth() {
        return health;
    }

    public EnemyBuilder health(Integer health) {
        this.health = health;
        return this;
    }

    public Integer getEndurance() {
        return endurance;
    }

    public EnemyBuilder endurance(Integer endurance) {
        this.endurance = endurance;
        return this;
    }

    public Enemy build(){
        Enemy enemy= new Enemy();
        enemy.setName(this.getName());
        enemy.setDamage(this.getDamage());
        enemy.setHealth(this.getHealth());
        enemy.setType(this.getType());
        enemy.setEndurance(this.getEndurance());
        return enemy;
    }
}
