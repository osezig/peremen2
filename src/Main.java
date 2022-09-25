public class Main {
    public static void main(String[] args) {
        // Задача 8
        int mashaSal = 67760;
        System.out.println(mashaSal);
        int mashaGr = 67760 / 10;
        System.out.println(mashaGr);
        int mashaSalYear = 67760 * 12;
        System.out.println(mashaSalYear);
        int mashaSal1 = mashaSal + mashaGr;
        System.out.println(mashaSal1);
        int mashaSalYear1 = mashaSal1 * 12;
        System.out.println(mashaSalYear1);
        int mashaProfit = mashaSalYear1 - mashaSalYear;
        System.out.println(mashaProfit);
        System.out.println("Маша теперь получает " + mashaSal1 + " рублей. Годовой доход вырос на " + mashaProfit + " рублей");

        int denSal = 83690;
        System.out.println(denSal);
        int denGr = 83690 / 10;
        System.out.println(denGr);
        int denSalYear = 83690 * 12;
        System.out.println(denSalYear);
        int denSal1 = denSal + denGr;
        System.out.println(denSal1);
        int denSalYear1 = denSal1 * 12;
        System.out.println(denSalYear1);
        int denProfit = denSalYear1 - denSalYear;
        System.out.println(denProfit);
        System.out.println("Денис теперь получает " + denSal1 + " рублей. Годовой доход вырос на " + denProfit + " рублей");

        int kriSal = 76230;
        System.out.println(kriSal);
        int kriGr = 76230 / 10;
        System.out.println(kriGr);
        int kriSalYear = 76230 * 12;
        System.out.println(kriSalYear);
        int kriSal1 = kriSal + mashaGr;
        System.out.println(kriSal1);
        int kriSalYear1 = kriSal1 * 12;
        System.out.println(kriSalYear1);
        int kriProfit = kriSalYear1 - kriSalYear;
        System.out.println(kriProfit);
        System.out.println("Кристина теперь получает " + kriSal1 + " рублей. Годовой доход вырос на " + kriProfit + " рублей");
    }
}