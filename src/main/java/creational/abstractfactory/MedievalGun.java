package creational.abstractfactory;

public class MedievalGun implements Weapon {
    @Override
    public void shoot() {
        System.out.println("BUMM");
    }

    @Override
    public void reload(Ammo ammo) {
        if (ammo instanceof MedievalAmmo) {
            System.out.println("Medieval gun reloaded successfully, it will deal: "+ammo.getDamage());
        }
    }
}
