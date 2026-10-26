package practice_pattern_programming.task8;

public class Game {
    static void main() {
        Character deadpool = new Character.CharacterBuilder()
                .setHealth(10)
                .setArmor(5)
                .setDamage(4)
                .setMagic(5)
                .build();
        System.out.println(deadpool);
    }
}
