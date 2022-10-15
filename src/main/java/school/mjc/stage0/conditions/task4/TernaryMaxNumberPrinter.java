package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = 0;
        int temp = 0;
        temp = Math.max(first, second);
        result = Math.max(temp, third);
        System.out.println(result);
    }
}
