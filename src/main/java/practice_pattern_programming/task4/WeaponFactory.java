package practice_pattern_programming.task4;

public abstract class WeaponFactory {
    public abstract Weapon createWeapon();
    public void planeAttack(){
        Weapon weapon = createWeapon();
        weapon.attack();
    }
}
