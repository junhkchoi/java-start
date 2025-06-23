package scanner;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("정수입력: ");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }
            else {
                sum += number;
            }
        }
        System.out.println("누적합: " + sum);
    }
}
