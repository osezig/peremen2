public class Main {
    public static void main(String[] args) {
      // Задача 3
        int lubPav = 23;
        System.out.println(lubPav);
        int annSerg = 27;
        System.out.println(annSerg);
        int ekAnd = 30;
        System.out.println(ekAnd);
        int totalPaper = 480;
        System.out.println(totalPaper);
        int totalStudent = lubPav + annSerg + ekAnd;
        System.out.println("Всего школьников " + totalStudent);
        int sheetPerOneStudent = totalPaper / totalStudent;
        System.out.println("На каждого школьника рассчитано " + sheetPerOneStudent + " листов бумаги");


    }
}