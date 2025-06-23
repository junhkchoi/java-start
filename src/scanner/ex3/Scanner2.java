package scanner.ex3;

import java.util.Scanner;
public class Scanner2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPrice = 0;
        int menu;

        while(true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            menu = input.nextInt();
            if (menu == 1) {
                System.out.print("상품명을 입력하세요: ");
                String productName = input.nextLine();
                input.nextLine();

                System.out.print("상품가격을 입력하세요: ");
                int productPrice = input.nextInt();

                System.out.print("상품수량을 입력하세요: ");
                int productQuantity = input.nextInt();

                System.out.println("상품명: "+ productName + " 가격: " + productPrice + " 수량 :" + productQuantity);

                totalPrice += (productPrice * productQuantity);
            }
            else if (menu == 2) {
                System.out.println("총비용: " + totalPrice);
            }
            else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

    }
}
