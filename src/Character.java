public abstract class Character {
    private String name;
    private Weapon weapon;

    public Character(String name) {
        this.name = name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void useWeapon(Character target) {
        if (weapon != null) {
            weapon.attack(this, target);
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract void display();
}
