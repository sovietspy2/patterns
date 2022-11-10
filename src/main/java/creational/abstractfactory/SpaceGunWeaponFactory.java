package creational.abstractfactory;

public class SpaceGunWeaponFactory implements AbstractWeaponFactory{


    @Override
    public Weapon createGun() {
        return new SpaceGun();
    }

    @Override
    public Ammo createAmmo() {
        return new SpaceAmmo();
    }
}
