package scanner.ex2;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("첫번쨰 정수: ");
        int num1 = input.nextInt();

        System.out.print("두번째 정수: ");
        int num2 = input.nextInt();

        System.out.println();
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("두 사이의 모든 정수: ");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(", ");
            }
        }

    }
}
