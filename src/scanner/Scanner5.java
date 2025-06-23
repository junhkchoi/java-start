package scanner;

import java.util.Scanner;
public class Scanner5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 숫자 모두 0을 입력해야 종료");
        while (true) {
            System.out.print("첫번째 수 입력: ");
            int a = scanner.nextInt();
            System.out.print("두번째 수 입력: ");
            int b = scanner.nextInt();

            if (a == 0 && b == 0) {
                System.out.println("프로그램 종료됨.");
                break;
            }
            else {
                int sum = a + b;
                System.out.println("두수의 합: " + sum);
            }
        }
    }
}
