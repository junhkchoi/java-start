package loop.ex;

public class SumEx2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int max = 100;
        while(i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
