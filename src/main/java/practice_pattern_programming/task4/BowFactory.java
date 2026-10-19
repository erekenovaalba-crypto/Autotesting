package practice_pattern_programming.task4;

public class BowFactory extends WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }
}
