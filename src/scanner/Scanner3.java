package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력: ");
        int a = scanner.nextInt();

        System.out.print("두번째 숫자를 입력: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + "가 더 큽니다.");
        }
        else if (a < b) {
            System.out.println(b + "가 더 큽니다.");
        }
        else {
            System.out.println("두 수가 같습니다.");
        }
    }
}
