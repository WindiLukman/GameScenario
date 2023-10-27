public class BowAndArrow implements Weapon {
    @Override
    public void attack(Character attacker, Character target) {
        System.out.println(attacker.toString() + " attacks with Bow and Arrow and hits " + target.toString());
    }
}
