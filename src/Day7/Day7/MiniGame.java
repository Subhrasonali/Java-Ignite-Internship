
package Day7.Day7;

class GameCharacter {
    String name;
    private int health;
    private int attackPower;

    GameCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    void attack(GameCharacter enemy) {
        enemy.health = enemy.health - this.attackPower;
        System.out.println(name + " attacked " + enemy.name +
                " and reduced health by " + attackPower);
    }

    void heal() {
        health = health + 20;
        System.out.println(name + " healed and gained 20 health");
    }

    void showStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
        System.out.println();
    }
}

public class MiniGame {
    public static void main(String[] args) {

        GameCharacter c1 = new GameCharacter("Ninja", 100, 25);
        GameCharacter c2 = new GameCharacter("Samurai", 120, 20);

        c1.showStats();
        c2.showStats();

        c1.attack(c2);
        c2.heal();

        System.out.println("\nAfter Battle:");
        c1.showStats();
        c2.showStats();
    }
}
