public class Warrior extends Character {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void display() {
        System.out.println("Warrior: " + super.toString());
    }
}
