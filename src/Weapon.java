public class Weapon {
    private String sword;
    private int damage;

    public Weapon(String type,int damage){
        this.sword=type;
        this.damage=damage;
    }
    public int getDamage() {
        return damage;
    }
    public String getSword() {
        return sword;
    }
}
