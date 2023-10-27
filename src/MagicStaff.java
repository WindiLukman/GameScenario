public class MagicStaff implements Weapon {
    @Override
    public void attack(Character attacker, Character target) {
        System.out.println(attacker.toString() + " attacks with Magic Staff and hits " + target.toString());
    }
}
