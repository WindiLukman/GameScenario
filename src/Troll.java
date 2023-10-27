public class Troll extends Character {
    public Troll(String name, int health) {
        super(name, health);
    }

    @Override
    public void display() {
        System.out.println("Troll: " + super.toString());
    }
}
