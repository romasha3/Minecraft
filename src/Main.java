//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Character player = new Character("Steve", 100);// Введіть гравця та здоров'я.

        String mobChoice = "ендермен"; // Введіть моба: "Зомбі", "Скелет", "Ендермен"
        Mob mob = createMob(mobChoice);

        String weaponChoice = "алмазний"; // Введіть меч: "Алмазний", "Золотий" або "Залізний"
        Weapon weapon = createWeapon(weaponChoice);

        System.out.println("Бій з " + mob.getName() + ":");
        System.out.println("Ім'я: " + player.getName());
        System.out.println("Здоров'я "+ player.getName()+": " + player.getHealth());
        player.attack(mob, weapon);

        System.out.println("Кінець гри.");
    }
    public static Mob createMob(String mobChoice) {
        switch (mobChoice.toLowerCase()) {
            case "зомбі":
                return new Mob("Зомбі", 70,40);
            case "скелет":
                return new Mob("Скелет", 90,50);
            case "ендермен":
                return new Mob("Ендермен", 120,100);
            default:
                return null;
        }
    }

    public static Weapon createWeapon(String weaponChoice) {
        switch (weaponChoice.toLowerCase()) {
            case "алмазний":
                return new Weapon("Алмазний меч", 125);
            case "золотий":
                return new Weapon("Золотий меч", 30);
            case "залізний":
                return new Weapon("Залізний меч", 40);
            default:
                return null;
        }

    }
}