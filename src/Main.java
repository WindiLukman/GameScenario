public class Main {
    public static void main(String[] args) {
        Character warrior = new Warrior("Warrior");
        Character archer = new Archer("Archer");
        Character mage = new Mage("Mage");
        Character troll = new Troll("Troll");

        Weapon magicStaff = new MagicStaff();
        Weapon bowAndArrow = new BowAndArrow();
        Weapon axe = new Axe();
        Weapon sword = new Sword();

        warrior.setWeapon(magicStaff);
        archer.setWeapon(bowAndArrow);
        mage.setWeapon(axe);
        troll.setWeapon(sword);

        warrior.useWeapon(archer);
        archer.useWeapon(mage);
        mage.useWeapon(troll);
        troll.useWeapon(warrior);

        warrior.display();
        archer.display();
        mage.display();
        troll.display();
    }
}
