package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int max=first>=second?
                first:
                second;
        System.out.println(max);
    }

    public static void main(String[] args) {
        TernaryGreatestNumberPrinter greatestNumberPrinter=new TernaryGreatestNumberPrinter();
        greatestNumberPrinter.printGreatest(9,19);
    }
}
