package array.ex2;

import java.util.Scanner;
public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "수학", "영어"};

        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요");
            for (int j = 0; j < 3; j++) {
                System .out.print(subjects[j] + " 점수: ");
                scores[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            double avg = 0;
            for (int j = 0; j < 3; j++) {
                sum += scores[i][j];
            }
            avg = (double) sum / 3;
            System.out.println((i+1) + "번 학생의 총점: " + sum +" 평균: " + avg);
        }

    }
}
