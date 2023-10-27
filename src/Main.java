public class Main {
    public static void main(String[] args) {

        // Create characters
        Character warrior = new Warrior("Warrior 1", 100);
        Character archer = new Archer("Archer 1", 80);
        Character mage = new Mage("Mage 1", 70);
        Character troll = new Troll("Troll 1", 120);

        // Create weapons
        Weapon magicStaff = new MagicStaff();
        Weapon bowAndArrow = new BowAndArrow();
        Weapon axe = new Axe();
        Weapon sword = new Sword();

        // Set weapons for characters
        warrior.setWeapon(magicStaff);
        archer.setWeapon(bowAndArrow);
        mage.setWeapon(axe);
        troll.setWeapon(sword);

        warrior.display();
        archer.display();
        mage.display();
        troll.display();

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
