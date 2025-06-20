package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endnum = 10;

        for (int i = 1; i <= endnum; i++) {
            sum += i;
            System.out.println("sum = " + sum);
        }
    }
}
