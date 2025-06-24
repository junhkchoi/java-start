package method.ex1;

public class MethodEx1 {
    public static void main(String[] args) {
        int balance = 10000;

        balance = income(balance, 2000);
        balance = outcome(balance, 3000);
    }
    public static int income (int balance, int money) {
        balance = balance + money;
        System.out.println(money+"원을 입금하셨습니다."+ "현재 잔액: " + balance);
        return balance;
    }
    public static int outcome (int balance, int money) {
        balance = balance - money;
        System.out.println(money+"원을 입금하셨습니다. " + "현재 잔액: " + balance);
        return balance;
    }
}
