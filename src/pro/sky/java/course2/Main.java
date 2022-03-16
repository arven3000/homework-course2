package pro.sky.java.course2;

public class Main {

    public static void main(String[] args) {

        Gryffindor garry = new Gryffindor("Гарри", "Поттер", 100, 90
                , 78, 88, 100);
        Gryffindor hermione = new Gryffindor("Гермиона", "Грейнджер", 85, 100
                , 100, 100, 100);
        Gryffindor ron = new Gryffindor("Рон", "Уизли", 50, 65
                , 100, 87, 98);

        garry.PrintStudentCharacteristics();
        hermione.PrintStudentCharacteristics();
        ron.PrintStudentCharacteristics();

        Slytherin draco = new Slytherin("Драко", "Малфой", 95, 80,
                100, 50, 65, 65, 100);
        Slytherin graham = new Slytherin("Грэхэм", "Монтегю", 73, 56,
                78, 88, 65, 85, 93);
        Slytherin gregory = new Slytherin("Грегори", "Гойл", 69, 42,
                50, 50, 45, 65, 80);

        draco.PrintStudentCharacteristics();
        graham.PrintStudentCharacteristics();
        gregory.PrintStudentCharacteristics();

        Hufflepuff zachariah = new Hufflepuff("Захария", "Смит", 96, 87,
                87, 68, 72);
        Hufflepuff cedric = new Hufflepuff("Седрик", "Диггори", 100, 99,
                88, 98, 99);
        Hufflepuff justin = new Hufflepuff("Джастин", "Финч-Флетчли", 87, 78,
                72, 64, 84);

        zachariah.PrintStudentCharacteristics();
        cedric.PrintStudentCharacteristics();
        justin.PrintStudentCharacteristics();

        Ravenclaw zhou = new Ravenclaw("Чжоу", "Чанг", 100, 100,
                100, 100, 100, 100);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил", 100, 100,
                100, 100, 100, 100);
        Ravenclaw marcus = new Ravenclaw("Маркус", "Белби", 100, 100,
                100, 100, 100, 100);

        zhou.PrintStudentCharacteristics();
        padma.PrintStudentCharacteristics();
        marcus.PrintStudentCharacteristics();

        System.out.println();

        System.out.println(draco.comparison(garry));
        System.out.println(padma.comparison(hermione));
        System.out.println(ron.comparison(graham));
        System.out.println(cedric.comparison(zhou));
        System.out.println(marcus.comparison(gregory));

        System.out.println();

        System.out.println(ron.comparisonGryffindor(garry));
        System.out.println(draco.comparisonSlytherin(gregory));
        System.out.println(cedric.comparisonHufflepuff(zachariah));
        System.out.println(zhou.comparisonRavenclaw(marcus));

    }
}
