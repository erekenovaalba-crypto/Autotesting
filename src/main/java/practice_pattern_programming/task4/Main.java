package practice_pattern_programming.task4;

public class Main {
    static void main() {
        WeaponFactory weaponFactory1 = new GunFactory();
        weaponFactory1.planeAttack();
        WeaponFactory weaponFactory2 = new BowFactory();
        weaponFactory2.planeAttack();
        WeaponFactory weaponFactory3 = new SwordFactory();
        weaponFactory3.planeAttack();
    }
}