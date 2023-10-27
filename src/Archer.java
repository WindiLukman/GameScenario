public class Archer extends Character {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void display() {
        System.out.println("Archer: " + super.toString());
    }
}
