public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(WeaponType.FIRE_GUN, "AKM");

        Boss boss = new Boss(500, 1000, weapon);
        System.out.println(boss.info());


        Skeleton skeleton = new Skeleton(50, 100, weapon, 10);
        Skeleton skeleton1 = new Skeleton(50, 100, weapon, 10);
        System.out.println();
        System.out.println(skeleton.info());
        System.out.println();
        System.out.println(skeleton1.info());

    }
}