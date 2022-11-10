package creational.abstractfactory;

public class SpaceGun implements Weapon {

    private Ammo bullet = null;

    @Override
    public void shoot() {
        if (bullet!=null) {
            System.out.println("pew pew pew");
           bullet = null;
        } else {
            System.out.println("Its empty!");
        }
    }

    @Override
    public void reload(Ammo ammo) {
        if (ammo instanceof SpaceAmmo) {
            System.out.println("Successfully reloaded SpaceGun! it will deal: "+ammo.getDamage());
            this.bullet = ammo;
        }
    }
}
