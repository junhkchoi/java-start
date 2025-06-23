package scanner.ex3;

import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

//        while(true) {
//            int num = input.nextInt();
//            if (num == -1) {
//                System.out.println("입력 종료");
//                break;
//            }
//            sum += num;
//            cnt++;
//        }
        int num = 0;
        while ((num = input.nextInt()) != -1) {
            sum += num;
            cnt++;
        }
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + (double)sum/cnt);

    }
}
