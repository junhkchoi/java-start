package cond;

public class If4 {
    public static void main(String[] args) {
        // 조건이 여러개일때 항상 else if를 사용하는것은 아님!
        // 독립적인 조건들을 검사해야할 때는 if문을 여러번 쓴다

        int age = 9;
        int price = 11000;
        int discount = 0;

        if (age <= 10) {
            discount += 1000;
        }
        if (price >= 10000) {
            discount += 1000;
        }

        System.out.println("할인금액: " + discount + "원");
    }
}
