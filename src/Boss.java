public class Boss extends GameEntity{
    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "Damage is: " + this.getDamage() + " .Health is: " + this.getHealth() +
                " .Name of weapon is: " + getWeapon().getNameOfWeapon() +
                " .Type of weapon is:" + getWeapon().getTypeOfWeapon();
    }
}
