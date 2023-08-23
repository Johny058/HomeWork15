import java.util.Objects;

public class Gryffendor extends Hogwarts {
    private final int nobility;  // благородство
    private final int honour;  //честь
    private final int bravery;  // храбрость

    public Gryffendor(String name, String lastName, int witchcraft,
                      int transgression, int nobility, int honour, int bravery) {
        super(name, lastName, witchcraft, transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public static void print(Gryffendor[] gryffendors) {
        for (int i = 0; i < gryffendors.length; i++) {
            Gryffendor gryffendor = gryffendors[i];
            System.out.println("Маг Гриффендора - " + gryffendor.getName() + " " + gryffendor.getLastName() +
                    " Уровень колдовства: " + gryffendor.getWitchcraft() +
                    " Растояние трансгрессии: " + gryffendor.getTransgression() + "Благородство - "
                    + gryffendor.getNobility() + " Честь - " + gryffendor.getHonour() + " Храбрость - "
                    + gryffendor.getBravery());
        }
    }

    public static void printTheBestStudent(Gryffendor[] gryffendors) {
        int student1 = gryffendors[0].getBravery() + gryffendors[0].getHonour() +
                gryffendors[0].getNobility();
        int student2 = gryffendors[1].getBravery() + gryffendors[1].getHonour() +
                gryffendors[1].getNobility();
        if (student1 > student2) {
            System.out.println("У Гарри Поттера, благородство - " + gryffendors[0].getNobility() +
                    " , честь - " + gryffendors[0].getHonour() + " , храбрость - " +
                    gryffendors[0].getNobility());
            System.out.println("Гарри лучший Гриффиндорец, чем Гермиона.");
        } else {
            System.out.println("У Гермионы Грейнджер, благородство - " + gryffendors[1].getNobility() +
                    " , честь - " + gryffendors[1].getHonour() + " , храбрость - " +
                    gryffendors[1].getNobility());
            System.out.println("Гермиона лучший Гриффиндорец, чем Гарри.");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }
}
