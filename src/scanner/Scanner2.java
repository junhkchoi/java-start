package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번쨰 숫자를 입력하세요: ");
        int number = scanner.nextInt();

        System.out.print("두번쨰 숫자를 입력하세요: ");
        int number2 = scanner.nextInt();

        int sum = number + number2;
        System.out.println("두 숫자의 합: " + sum);

    }
}
