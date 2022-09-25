public class Main {
    public static void main(String[] args) {
        // Задача 4
        short workTwoMin = 16;
        System.out.println(workTwoMin);
        int workOneMin = workTwoMin / 2;
        System.out.println(workOneMin);
        int work20Min = workOneMin * 20;
        System.out.println("За 20 минут машина произвела бутылок " + work20Min + " штук");
        int minutePerDay = 60 * 24;
        System.out.println(minutePerDay);
        int maidBotPerDay = workOneMin * 1440;
        System.out.println("За сутки машина произвела бутылок " + maidBotPerDay + " штук");
        int maidBotPer3Day = maidBotPerDay * 3;
        System.out.println("За 3 суток машина произвела бутылок " + maidBotPer3Day + " штук");
        int maidPerOneMonth = maidBotPer3Day * 10;
        System.out.println("За месяц машина произвела бутылок " + maidPerOneMonth + " штук");
    }
}