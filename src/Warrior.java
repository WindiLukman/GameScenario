public class Warrior extends Character {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Warrior: " + super.toString());
    }
}
