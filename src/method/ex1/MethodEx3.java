package method.ex1;

public class MethodEx3 {
    public static void main(String[] args) {
        System.out.println("평균값: " + average(1,2,3));
    }

    public static double average (int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
