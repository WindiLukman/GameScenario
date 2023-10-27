public class Mage extends Character {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Mage: " + super.toString());
    }
}
