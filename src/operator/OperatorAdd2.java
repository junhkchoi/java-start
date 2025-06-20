package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a; // 연산 수행 후 a 변수 사용
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;

        b = a++; // a 변수를 먼저 사용하고 ; 이후 연산 수행
        System.out.println("a = " + a + ", b = " + b);
    }
}
