package method;

public class Method1 {

    public static void main(String[] args) {
        printHeader();

        int result = add(3, 5);
        System.out.println("합: " + result);

        printFooter();
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void printHeader() {
        System.out.println("프로그램을 시작합니다!");
        return;
    }
    public static void printFooter() {
        System.out.println("프로그램을 종료합니다!");
        return;
    }
}