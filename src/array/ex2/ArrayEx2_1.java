package array.ex2;

import java.util.Scanner;
public class ArrayEx2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min, max;
        System.out.print("입력하실 숫자 개수를 입력하세요: ");
        int testCase = input.nextInt();

        int[] array = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            array[i] = input.nextInt();
        }
        max = min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("max: " + max + " min: " + min);

    }
}
