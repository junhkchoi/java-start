package cond;

public class Switch3 {
    public static void main(String[] args) {

        // 좀더 깔끔해진? break랑 이런거 너무 더러워져서 자바14부터 개선된? switch 제공
        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 0;
        };
        System.out.println(coupon);
    }
}
