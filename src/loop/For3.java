package loop;

public class For3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; ; i++) { // while true와 같다
            sum += i;
            if (sum > 10) {
                break;
            }
        }
        System.out.println(sum);

    }
}
