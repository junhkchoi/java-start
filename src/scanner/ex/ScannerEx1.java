package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("음식: ");
        String foodName = input.nextLine();
        System.out.print("음식 가격: ");
        int foodPrice = input.nextInt();
        System.out.print("음식 수량: ");
        int foodQuantity = input.nextInt();

        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + (foodPrice * foodQuantity) + "원 입니다.");
    }
}
