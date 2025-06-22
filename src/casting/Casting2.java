package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // 명시적 형변환
        intValue = (int) doubleValue;

        System.out.println(intValue); // 1 출력
    }
}
