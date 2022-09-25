public class Main {
    public static void main(String[] args) {
        // Задача 6
        int bananas = 5;
        System.out.println(bananas);
        int oneBananasWeightGr = 80;
        System.out.println(oneBananasWeightGr);
        int totalBananas = oneBananasWeightGr * bananas;
        int milkMl = 200;
        System.out.println(milkMl);
        double totalmilkGr = (100 * 1.05) * 2;
        System.out.println("Всего молока в граммах " + totalmilkGr);
        int icecream = 100;
        System.out.println(icecream);
        int totalIcecream = 100 * 2;
        System.out.println(totalIcecream);
        int egg = 70;
        System.out.println(egg);
        int totalEgg = 70 * 4;
        System.out.println(totalEgg);
        double breakfestGr = totalBananas + totalmilkGr + totalIcecream + totalEgg;
        System.out.println("Вес завтрака в граммах " + breakfestGr);
        double breakfestKg = breakfestGr / 1000;
        System.out.println("Вес завтрака в килограммах = " + breakfestKg);

    }
}