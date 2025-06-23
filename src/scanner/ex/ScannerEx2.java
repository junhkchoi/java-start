package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " -> 짝수");
        }
        else {
            System.out.println(number + " -> 홀수");
        }


    }
}
