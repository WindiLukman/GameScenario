public abstract class Character {
    private String name;
    protected Weapon weapon;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void useWeapon(Character target) {
        if (weapon != null) {
            int damage = weapon.getDamage();
            target.receiveDamage(damage);
            System.out.println(this + " attacks with " + weapon + " and hits " + target + " for " + damage + " damage.");
        }
    }

    public void receiveDamage(int damage) {
        health -= damage;
    }

    @Override
    public String toString() {
        return name + " (Health: " + health + ", Weapon: " + weapon + ")";
    }

    public abstract void display();
}
