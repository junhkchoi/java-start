package loop;

public class While2_1 {
    public static void main(String[] args) {

        int i = 1;
        int endnum = 10;
        int sum = 0;

        while (i <= endnum) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
