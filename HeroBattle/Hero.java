package HeroBattle;

public class Hero {
    private String name;
    private double hp;
    private double attack;
    private double defense;

    public Hero(String name, double hp, double attack, double defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }


    public Hero() {

    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public double getAttack() {
        return attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public void attack(Hero hero) {
        hero.hp -= this.attack - hero.defense;

        if (hero.hp < 0) {
            hero.hp = 0;
        }
    }
}