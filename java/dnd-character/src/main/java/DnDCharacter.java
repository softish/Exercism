import java.util.Random;

class DnDCharacter {

    private static final int INITIAL_HITPOINTS = 10;

    private final int ability;
    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;

    DnDCharacter() {
        ability = rollDice();
        strength = rollDice();
        dexterity = rollDice();
        constitution = rollDice();
        intelligence = rollDice();
        wisdom = rollDice();
        charisma = rollDice();
    }

    int ability() {
        return ability;
    }

    int modifier(int input) {
        return (int) Math.floor((input - INITIAL_HITPOINTS) / 2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return INITIAL_HITPOINTS + modifier(constitution);
    }

    private int rollDice() {
        return new Random().ints(4, 1, 7)
                .sorted()
                .skip(1)
                .sum();
    }
}
