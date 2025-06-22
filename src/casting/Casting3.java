package casting;

public class Casting3 {
    public static void main(String[] args) {

        long maxIntValue = 2147483647; // int 최댓값
        long maxIntOver = 2147483648L; // int 최댓값 + 1

        int intValue = (int) maxIntOver; // 오버플로우 발생 -> int 가장 작은 범위 출력
        System.out.println(intValue);
    }
}
