package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int div = 5/2;
        System.out.println("5/2 = " + div);
        // 정수/정수 = 정수(몫) -> 의도한대로 하려면 형변환해야됨

        int mod = 5%2;
        System.out.println("5%2 = " + mod);
    }
}
