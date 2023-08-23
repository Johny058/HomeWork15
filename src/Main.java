
public class Main {
    public static void main(String[] args) {

        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри", "Поттер", 100, 99),
                new Hogwarts("Гермиона", "Грейнджер", 75, 66),
                new Hogwarts("Рон", "Уизли", 70, 60),
                new Hogwarts("Драко", "Малфой", 75, 71),
                new Hogwarts("Грехан", "Мюнтегю", 65, 60),
                new Hogwarts("Грегори", "Гоил", 71, 62),
                new Hogwarts("Захария", "Смит", 72, 63),
                new Hogwarts("Седриг", "Диггори", 76, 70),
                new Hogwarts("Джастин", "Финч-Флетчли", 60, 55),
                new Hogwarts("Джоу", "Чанг", 55, 72),
                new Hogwarts("Падма", "Патил", 58, 55),
                new Hogwarts("Маркус", "Бэлби", 62, 60),
        };


        Gryffendor[] gryffendors = {
                new Gryffendor("Гарри", "Поттер", 100, 99,
                        95, 92, 100),
                new Gryffendor("Гермиона", "Грейнджер", 75, 66,
                        88, 75, 90),
                new Gryffendor("Рон", "Уизли", 70, 60,
                        70, 66, 75),
        };


        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 75, 71, 15,
                        20, 20, 1, 10),
                new Slytherin("Грехан", "Мюнтегю", 65, 60, 15,
                        2, 10, 3, 7),
                new Slytherin("Грегори", "Гоил", 71, 62, 3,
                        8, 1, 7, 12),
        };


        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", 72, 63, 27,
                        50, 44),
                new Hufflepuff("Седриг", "Диггори", 76, 70, 60,
                        77, 60),
                new Hufflepuff("Джастин", "Финч-Флетчли", 60, 55, 33,
                        15, 60),
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Джоу", "Чанг", 55, 72, 55,
                        44, 15, 12),
                new Ravenclaw("Падма", "Патил", 58, 55, 33,
                        44, 13, 23),
                new Ravenclaw("Маркус", "Бэлби", 62, 60, 11,
                        21, 17, 19),
        };

        Gryffendor.print(gryffendors);
        System.out.println();
        Slytherin.print(slytherins);
        System.out.println();
        Hufflepuff.print(hufflepuffs);
        System.out.println();
        Ravenclaw.print(ravenclaws);
        System.out.println();
        Gryffendor.printTheBestStudent(gryffendors);
        System.out.println();
        Slytherin.printTheBestStudent(slytherins);
        System.out.println();
        Hufflepuff.printTheBestStudent(hufflepuffs);
        System.out.println();
        Ravenclaw.printTheBestStudent(ravenclaws);
        System.out.println();
        Hogwarts.printTheBestStudentInHogwarts(hogwarts);

    }
}

