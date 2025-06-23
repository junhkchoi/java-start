package scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("문자열을 입력하세요: ");
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                // String은 기본형이 아닌 객체이므로 equals 사용
                // == 은 객체의 주소를 비교하므로 안됨.
                break;
            }
            else {
                System.out.println("입력하신 문자열: " + str);
            }
        }

    }
}
