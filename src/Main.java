public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        Weapon bossWeapon = new Weapon();
        boss.setHealth(100);
        boss.setDamage(80);
        bossWeapon.setArms("Hard");
        bossWeapon.setGun("Shotgun");
        boss.setWeapon(bossWeapon);


        System.out.println("Boss health is " + boss.getHealth());
        System.out.println("Boss damage is  " + boss.getDamage());
        System.out.println("Boss weapon is " + boss.getWeapon().getArms() + " " + boss.getWeapon().getGun());

    }
}
