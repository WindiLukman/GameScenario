public class Archer extends Character {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Archer: " + super.toString());
    }
}
