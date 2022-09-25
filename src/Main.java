public class Main {
    public static void main(String[] args) {
        // Задача 7
        int totalWeiqghtLossKg = 7;
        System.out.println(totalWeiqghtLossKg);
        int totalWeightLossGr = 7 * 1000;
        System.out.println(totalWeightLossGr);
        int loseWeightPerDay1 = 250;
        System.out.println(loseWeightPerDay1);
        int dayForEnd250 = totalWeightLossGr / loseWeightPerDay1;
        System.out.println("Если терять каждый день по " + loseWeightPerDay1 + " грамм то, чтобы сбросить 7 кг потребуется " + dayForEnd250 + " дней");


        int loseWeightPerDay2 = 500;
        System.out.println(loseWeightPerDay2);
        int dayForEnd500 = totalWeightLossGr / loseWeightPerDay2;
        System.out.println("Если терять каждый день по " + loseWeightPerDay2 + " грамм то, чтобы сбросить 7 кг потребуется " + dayForEnd500 + " дней");

        System.out.println(totalWeightLossGr);
        int loseWeightPerDay3 = (loseWeightPerDay1 + loseWeightPerDay2) / 2;
        System.out.println(loseWeightPerDay3);
        int dayForEndAvg = totalWeightLossGr / loseWeightPerDay3;
        System.out.println("Если терять каждый день по " + loseWeightPerDay3 + " грамм то, чтобы сбросить 7 кг потребуется " + dayForEndAvg + " дней");


    }
}