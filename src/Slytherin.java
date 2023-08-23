public class Slytherin extends Hogwarts {
    private final int cunning;  // хитрость
    private final int determination;  // решительность
    private final int ambition;   // амбиционизм
    private final int resourcefulness;  // находчивость
    private final int thirstForPower;  // жажда власти

    public Slytherin(String name, String lastName, int witchcraft,
                     int transgression, int cunning, int determination,
                     int ambition, int resourcefulness, int thirstForPower) {
        super(name, lastName, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public static void print(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Маг Слизерина - " + slytherin.getName() + " " + slytherin.getLastName() +
                    " Уровень колдовства: " + slytherin.getWitchcraft() +
                    " Растояние трансгрессии: " + slytherin.getTransgression() +
                    " Хитрость - " + slytherin.getCunning() + " Решительность - " +
                    slytherin.getDetermination() + "Амбиционизм -" + slytherin.getAmbition() +
                    " Находчивость - " + slytherin.getResourcefulness() + " Жажда власти - " +
                    slytherin.getThirstForPower());
        }
    }

    public static void printTheBestStudent(Slytherin[] slytherins) {
        int student1 = slytherins[0].getCunning() + slytherins[0].getDetermination() +
                slytherins[0].getAmbition() + slytherins[0].getResourcefulness() +
                slytherins[0].getThirstForPower();
        int student2 = slytherins[1].getCunning() + slytherins[1].getDetermination() +
                slytherins[1].getAmbition() + slytherins[1].getResourcefulness() +
                slytherins[1].getThirstForPower();
        if (student1 > student2) {
            System.out.println("У Драко Малфея, хитрость - " + slytherins[0].getCunning() +
                    " , решительность - " + slytherins[0].getDetermination() + " , амбиционизм -" +
                    slytherins[0].getAmbition() + " , находчивость - " + slytherins[0].getResourcefulness() +
                    " , жажда власти -" + slytherins[0].getThirstForPower());
            System.out.println("Драго лучший Слизерениц, чем Грехан.");
        } else {
            System.out.println("У Грехана Мюнтегю, хитрость - " + slytherins[1].getCunning() +
                    " , решительность - " + slytherins[1].getDetermination() + " , амбиционизм -" +
                    slytherins[1].getAmbition() + " , находчивость - " + slytherins[1].getResourcefulness() +
                    " , жажда власти -" + slytherins[1].getThirstForPower());
            System.out.println("Грехан лучший Слизеренец, чем Драго.");
        }
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

}
