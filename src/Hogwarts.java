public class Hogwarts {
    String name;
    private final String lastName;

    private final int witchcraft;  // колдовство
    private final int transgression;  // трансгесирование

    public Hogwarts(String name, String lastName, int witchcraft, int transgression) {
        this.name = name;
        this.lastName = lastName;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }


    public static void printTheBestStudentInHogwarts(Hogwarts[] hogwarts) {
        int student1 = hogwarts[0].getWitchcraft() + hogwarts[0].getTransgression();
        int student2 = hogwarts[3].getWitchcraft() + hogwarts[3].getTransgression();
        if (student1 > student2) {
            System.out.println(hogwarts[0].getName() + " " + hogwarts[0].getLastName() + " сильнейший маг " +
                    "в Хогвартсе.");
        } else {
            System.out.println(hogwarts[3].getName() + " " + hogwarts[3].getLastName() + " сильнейший маг " +
                    "в Хогвартсе.");
        }
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

}





