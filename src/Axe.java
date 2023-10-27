public class Axe implements Weapon {
    @Override
    public void attack(Character attacker, Character target) {
        System.out.println(attacker.toString() + " attacks with Axe and hits " + target.toString());
    }
}
