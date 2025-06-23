package array.ex;

import java.util.Scanner;

public class ArrayDim4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        int[] numbers = new int[testCase];
        int sum = 0;
        System.out.println(testCase + "개의 정수를 입력하세요");

        for (int i = 0; i < testCase; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("평균: " + ((double) sum / numbers.length));
    }
}
