package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2: // case 2는 break문이 없으므로 case 3이 실행됨
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println(coupon);
    }
}
