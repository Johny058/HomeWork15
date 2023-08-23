public class Hufflepuff extends Hogwarts {
    private final int diligence;  // трудолюбие
    private final int loyalty;  // верность
    private final int honesty;  // честность

    public Hufflepuff(String name, String lastName, int witchcraft,
                      int transgression, int diligence, int loyalty, int honesty) {
        super(name, lastName, witchcraft, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public static void print(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Маг Пуффендуя - " + hufflepuff.getName() + " " + hufflepuff.getLastName() +
                    " Уровень колдовства: " + hufflepuff.getWitchcraft() +
                    " Растояние трансгрессии: " + hufflepuff.getTransgression() + " Трудолюбие - " +
                    hufflepuff.getDiligence() + " Верность - " + hufflepuff.getLoyalty() +
                    " Честность - " + hufflepuff.getHonesty());
        }
    }

    public static void printTheBestStudent(Hufflepuff[] hufflepuffs) {
        int student1 = hufflepuffs[0].getDiligence() + hufflepuffs[0].getLoyalty() +
                hufflepuffs[0].getHonesty();
        int student2 = hufflepuffs[1].getDiligence() + hufflepuffs[1].getLoyalty() +
                hufflepuffs[1].getHonesty();

        if (student1 > student2) {
            System.out.println("У Захарии Смит, трудолюбие - " + hufflepuffs[0].getDiligence() +
                    " , верность - " + hufflepuffs[0].getLoyalty() + " , честность - " +
                    hufflepuffs[0].getHonesty());
            System.out.println("Захария лучший Пуффендуец, чем Седриг.");
        } else {
            System.out.println("У Седриг Диггори, трудолюбие - " + hufflepuffs[1].getDiligence() +
                    " , верность - " + hufflepuffs[1].getLoyalty() + " , честность - " +
                    hufflepuffs[1].getHonesty());
            System.out.println("Седриг лучший Пуффендуец, чем Захария.");
        }
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

}
