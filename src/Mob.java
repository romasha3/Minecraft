public class Mob {
    private String name;
    private int health;
    private int damage;

    public Mob(String name,int health,int damage){
        this.name=name;
        this.health=health;
        this.damage=damage;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getDamage(){
        return damage;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public void takeDamage(int damage){
        health-=damage;
    }
    public void dropItem(String playerName) {
        if (health<=0) {
            if (name.equals("Зомбі")) {
                System.out.println("З " + name + " випала: гнила плоть");
            } else if (name.equals("Скелет")) {
                System.out.println("З " + name + " випали: кістки та стріли");
            } else if (name.equals("Ендермен")) {
                System.out.println("З " + name + " випала: перлина Енду");
            }
        } else {
            System.out.println("Вам гаплик!");
            System.out.println(playerName+" втратив зброю :(");
        }
    }
}
