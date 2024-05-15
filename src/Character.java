public class Character {
    private String name;
    private int health;
    public Character(String name,int health){
        this.name=name;
        this.health=health;

    }

    public void attack(Mob mob, Weapon weapon){
        System.out.println(name + " атакує " + mob.getName() + " зброєю " + weapon.getSword());
        while (true) {
            mob.takeDamage(weapon.getDamage());
            if (mob.getHealth() <= 0) {
                System.out.println(name + " перемагає " + mob.getName() + "!");
                mob.dropItem(name);
                break;
            }

            takeDamage(mob.getDamage());
            if (health <= 0) {
                System.out.println("Вам гаплик!");
                dropWeapon();
                break;
            }
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Здоров'я " + name + ": " + health);
    }

    public void dropWeapon() {
        System.out.println("Ви втратили зброю :(");
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
