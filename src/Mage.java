public class Mage extends Character {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void display() {
        System.out.println("Mage: " + super.toString());
    }
}
