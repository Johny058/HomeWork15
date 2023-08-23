public class Ravenclaw extends Hogwarts {
    private final int intelligence;  // ум
    private final int wisdom;  // мудрость
    private final int wit;  // остроумие
    private final int Creativity;  //творчество

    public Ravenclaw(String name, String lastName, int witchcraft, int transgression,
                     int intelligence, int wisdom, int wit, int creativity) {
        super(name, lastName, witchcraft, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        Creativity = creativity;
    }

    public static void print(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Маг Когтеврана - " + ravenclaw.getName() + " " + ravenclaw.getLastName() +
                    " Уровень колдовства: " + ravenclaw.getWitchcraft() +
                    " Растояние трансгрессии: " + ravenclaw.getTransgression() + " Мудрость - " +
                    ravenclaw.getWisdom() + " Остроумие - " + ravenclaw.getWit() +
                    " Творчество - " + ravenclaw.getCreativity());
        }
    }

    public static void printTheBestStudent(Ravenclaw[] ravenclaws) {
        int student1 = ravenclaws[0].getIntelligence() + ravenclaws[0].getWisdom() +
                ravenclaws[0].getWit() + ravenclaws[0].getCreativity();
        int student2 = ravenclaws[1].getIntelligence() + ravenclaws[1].getWisdom() +
                ravenclaws[1].getWit() + ravenclaws[1].getCreativity();
        if (student1 > student2) {
            System.out.println("У Джоу Чанг, ум - " + ravenclaws[0].getIntelligence() +
                    " , мудрость - " + ravenclaws[0].getWisdom() + " , остроумие -" +
                    ravenclaws[0].getWit() + " , творчество - " + ravenclaws[0].getCreativity());
            System.out.println("Джоу лучший Когтевранец, чем Падма.");
        } else {
            System.out.println("У Грехана Мюнтегю, ум - " + ravenclaws[1].getIntelligence() +
                    " , мудрость - " + ravenclaws[1].getWisdom() + " , остроумие -" +
                    ravenclaws[1].getWit() + " , творчество - " + ravenclaws[1].getCreativity());
            System.out.println("Падма лучший Когтевранец, чем Джоу.");
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return Creativity;
    }

}
