package creational.abstractfactory;

public class AbstractFactoryExample {
    public static void run() {

        AbstractWeaponFactory factory = new SpaceGunWeaponFactory();

        var gun = factory.createGun();
        var ammo = factory.createAmmo();
        var ammo1 = factory.createAmmo();

        gun.reload(ammo);
        gun.shoot();

        gun.shoot();

        gun.reload(ammo1);
        gun.shoot();


    }
}
