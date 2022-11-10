package creational.abstractfactory;

public interface AbstractWeaponFactory {
    Weapon createGun();
    Ammo createAmmo();
}
