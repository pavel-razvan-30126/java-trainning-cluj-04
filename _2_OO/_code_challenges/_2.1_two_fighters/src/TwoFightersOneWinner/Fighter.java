package TwoFightersOneWinner;

public class Fighter {
    private String name;
    private int health;
    private double damagePerAttack;

    public Fighter(String name, int health, double damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent) {
        System.out.println("Opponent " + opponent.getName() + " hit for " + this.damagePerAttack + " by " + this.name);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public double getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamagePerAttack(double damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }
}
