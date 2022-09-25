public class Main {
    public static void main(String[] args) {
        // Задача 5
        int totalPaint = 120;
        System.out.println(totalPaint);
        int white = 1;
        System.out.println(white);
        int brown = 1;
        System.out.println(brown);
        int paintForOneClass = (2 * white) + (4 * brown);
        System.out.println(paintForOneClass);
        int totalClass = 120 / paintForOneClass;
        System.out.println("Всего классов " + totalClass);
        int totalWhitePaint = totalClass * 2;
        System.out.println(totalWhitePaint);
        int totalBrownPaint = totalClass * 4;
        System.out.println(totalBrownPaint);
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски" );
    }
}