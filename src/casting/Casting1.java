package casting;

public class Casting1 {
    public static void main(String[] args) {

        // 작은 범위를 큰 범위를 넣는건 가능
        int intValue = 123;
        long longValue;
        double doubleValue;

        // 대입은 타입을 맞춰줘야하기때문에 자동형변환 일어남
        longValue = intValue; // int -> double
        longValue = (long) intValue;

        doubleValue = longValue; // long -> double
        doubleValue = (double) longValue; // long -> double


        // 큰 범위를 작은 범위로 대입은 불가
        // intValue = longValue; // long -> int (XXX)
    }
}
