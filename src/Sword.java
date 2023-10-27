public class Sword implements Weapon {
    @Override
    public void attack(Character attacker, Character target) {
        System.out.println(attacker.toString() + " attacks with Sword and hits " + target.toString());
    }
}
