public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8();


}

    public static void task1 () {
        System.out.println("Задача 1");
        int tangerine = 5;
        System.out.println("Значение переменной tangerine с типом int равно " + 5);
        byte car = 3;
        System.out.println("Значение переменной car с типом byte равно " + 3);
        short apple = 20;
        System.out.println("Значение переменной apple с типом short равно " + 20);
        long people = 5_000_000_000l;
        System.out.println("Значение переменной people с типом long равно " + 5_000_000_000l);
        float gr = 3.0255f;
        System.out.println("Значение переменной gr с типом float равно " + 3.0255f);
        double sm = 4.5462;
        System.out.println("Значение переменной sm с типом double равно " + 4.5462);

    }
    public static void task2 () {
        System.out.println("Задача 2");
        double fruitWeight = 27.12;
        System.out.println(fruitWeight);
        long human = 987678965549l;
        System.out.println(human);
        double totalFruit = 2.786;
        System.out.println(totalFruit);
        short car = 569;
        System.out.println(car);
        int temperature = -159;
        System.out.println(temperature);
        short boot = 27897;
        System.out.println(boot);
        long dog = 67;
        System.out.println(dog);

    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte klacc1 = 23;
        byte klacc2 = 27;
        byte klacc3 = 30;
        byte student = 23 + 27 + 30;
        short sheet = 480;
        System.out.println("На каждого ученика рассчитано " + (480 / student) + " листов бумаги.");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        short in2Minute = 16;
        short in1Minute = 16 / 2;
        int in1Hour = in1Minute * 60;
        System.out.println("За 20 минут машина произвела " + in1Minute * 20 + " штук бутылок.");
        System.out.println("За сутки машина произвела " + in1Hour * 24 + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + (in1Hour * 24) * 3 + " штук бутылок.");
        System.out.println("За месяц машина произвела " + ((in1Hour * 24) * 3) * 30 + " штук бутылок.");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte pot = 120;
        int room = pot / 6;
        System.out.println("В школе, где " + room + " классов, нужно " + room * 2 + " банок белой краски и " + room * 4 + " банок коричневой краски.");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int grams = bananas + milk + iceCream + eggs;
        System.out.println(grams + " грамм.");
        float kilograms = grams / 1000f;
        System.out.println(kilograms + " кг.");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        short totalGrams = 7 * 1000;
        int daysOf250Grams = totalGrams / 250;
        System.out.println(daysOf250Grams + " дней.");
        int daysOf500Grams = totalGrams / 500;
        System.out.println(daysOf500Grams + " дней.");
        int averageNumberOfDays = (daysOf250Grams + daysOf500Grams) / 2;
        System.out.println(averageNumberOfDays + " - это среднее коллическво дней.");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int Masha = 67760;
        int MashaIncomeYear1 = 67760 * 12;
        Masha = (Masha * 10 / 100) + 67760;
        int MashaIncomeYear2 = Masha * 12;
        System.out.println("Маша теперь получает " + Masha + " рублей. Годовой доход вырос на " + (MashaIncomeYear2 - MashaIncomeYear1) + " рублей.");
        int Denis = 83690;
        int DenisIncomeYear1 = 83690 * 12;
        Denis = (Denis * 10 / 100) + 83690;
        int DenisIncomeYear2 = Denis * 12;
        System.out.println("Денис теперь получает " + Denis + " рублей. Годовой доход вырос на " + (DenisIncomeYear2 - DenisIncomeYear1) + " рублей.");
        int Kris = 76230;
        int KrisIncomeYear1 = 76230 * 12;
        Kris = (Kris * 10 / 100) + 76230;
        int KrisIncomeYear2 = Kris * 12;
        System.out.println("Кристина теперь получает " + Kris + " рублей. Годовой доход вырос на " + (KrisIncomeYear2 - KrisIncomeYear1) + " рублей.");
    }
}
