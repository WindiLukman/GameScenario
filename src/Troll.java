public class Troll extends Character {
    public Troll(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Troll: " + super.toString());
    }
}
