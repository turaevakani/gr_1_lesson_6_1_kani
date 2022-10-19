public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(200);
        Weapon bWeapon = new Weapon();
        bWeapon.setNameOfWeapon("Knife");
        bWeapon.setTypeOfWeapon(WeaponType.COLD);
        boss.setWeapon(bWeapon);
        System.out.println("Boss damage is: " + boss.getDamage() + ". Boss health is: " + boss.getHealth() +
                " .Boss name of weapon is: " + bWeapon.getNameOfWeapon() +
                " .Boss type of weapon is:" + bWeapon.getTypeOfWeapon());

        System.out.println("Info about boss:******" + boss.printInfo());

        Skelet skelet1 = new Skelet();
        skelet1.setNumberOfArrows(15);
        skelet1.setDamage(40);
        skelet1.setHealth(250);
        Weapon s1Weapon = new Weapon();
        s1Weapon.setNameOfWeapon("Pistol");
        s1Weapon.setTypeOfWeapon(WeaponType.FIRE_SHOOT);
        skelet1.setWeapon(s1Weapon);

        Skelet skelet2 = new Skelet();
        skelet2.setNumberOfArrows(20);
        skelet2.setDamage(35);
        skelet2.setHealth(190);
        Weapon s2Weapon = new Weapon();
        s2Weapon.setNameOfWeapon("Suffocating");
        s2Weapon.setTypeOfWeapon(WeaponType.CHEMICAL);
        skelet2.setWeapon(s2Weapon);

        System.out.println("Info about skelet1:******" + skelet1.printInfo() +
                "\nInfo about skelet2:******" + skelet2.printInfo());





    }
}