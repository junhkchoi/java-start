package scanner.ex2;

import java.util.Scanner;
public class Scanner5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요: ");
            String name = input.nextLine();
            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt();
            // 우리가 숫자 10을 입력하고 엔터를 누르면
            // 입력으로 숫자\n이 들어간다. 근데 nextInt는 숫자만 받아서
            // 개행문자가 남아있는 문제가 발생해 다음 반복에서 이름으로 개행문자가 들어가는
            // 문제가 발생한다
            input.nextLine();
            // 따라서 아래에 nextLine을 넣어서 개행문자를 따로 처리해준다.

            System.out.println("이름: " + name + " 나이: " + age);
        }
    }
}
