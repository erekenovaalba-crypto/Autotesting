package practice_pattern_programming.task8;

public class Character {
    private String health;
    private String damage;
    private String armor;

    @Override
    public String toString() {
        return "Character{" +
                "health='" + health + '\'' +
                ", damage='" + damage + '\'' +
                ", armor='" + armor + '\'' +
                ", magic='" + magic + '\'' +
                '}';
    }

    private  String magic;
    public Character(CharacterBuilder builder){
        this.armor = builder.armor;
        this.damage = builder.damage;
        this.health = builder.health;
        this.magic = builder.magic;
    }

    static class CharacterBuilder{
        private String health;
        private String damage;
        private String armor;
        private  String magic;

        public CharacterBuilder setHealth(String health) {
            this.health = health;
            return this;
        }

        public CharacterBuilder setDamage(String damage) {
            this.damage = damage;
            return this;
        }

        public CharacterBuilder setArmor(String armor) {
            this.armor = armor;
            return this;
        }

        public CharacterBuilder setMagic(String magic) {
            this.magic = magic;
            return this;
        }
        public Character build(){
            return new Character(this);
        }
    }
}
