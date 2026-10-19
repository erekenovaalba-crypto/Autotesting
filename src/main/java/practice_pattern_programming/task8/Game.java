package practice_pattern_programming.task8;

public class Game {
    static void main() {
        Character deadpool = new Character.CharacterBuilder()
                .setHealth("Способность регенерации")
                .setArmor("Брони нет, красный костюм")
                .setDamage("нет ущерба")
                .setMagic("Способность круто драться как ниньзя")
                .build();
        System.out.println(deadpool);
    }
}
