package method.ex2;

import cond.If1;

import java.util.Scanner;

public class MethodEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 0;
        int money = 0;

        while (true) {
            System.out.println("------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액확인 | 4. 종료");
            System.out.println("------------------------------------");

            System.out.print("선택: ");
            int menu = input.nextInt();

            switch (menu) {
                case 1 -> {
                    System.out.print("입금액을 입력해주세요: ");
                    money = input.nextInt();
                    balance = income(balance, money);
                }
                case 2 -> {
                    System.out.print("출금액을 입력해주세요: ");
                    money = input.nextInt();
                    balance = outcome(balance, money);
                }
                case 3 -> {
                    checkBalance(balance);
                }
                case 4 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> {
                    System.out.println("올바른 입력을 해주세요!");
                }
            }
        }
    }
    public static int income(int balance, int money) {
        balance += money;
        System.out.println(money + "원을 입금하셨습니다. 현재 잔액: " + balance);
        return balance;
    }
    public static int outcome(int balance, int money) {
        if (balance < money) {
            System.out.println(money + "원을 출금하려했으나, 잔액이 부족합니다.");
            return balance;
        } else {
            balance -= money;
            System.out.println(money + "원을 출금하셨습니다. 현재 잔액: " + balance);
            return balance;
        }
    }
    public static void checkBalance(int balance) {
        System.out.println("현재 잔액: " + balance);
    }
}
