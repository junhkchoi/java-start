package method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. 함수 호출 전: num1 = " + num1); // 5 출력
        changeNumber(num1); // 10 출력
        System.out.println("4. changeNumber 호출 후: num1 = " + num1); // 5 출력 -> 대원칙: 자바는 항상 변수의 값을 복사해서 대입한다. (원본 헷갈림)

    }
    public static void changeNumber(int num2) {
        System.out.println("2. 함수 변경 전: num2 = " + num2);
        num2 =  num2 * 2;
        System.out.println("2. 함수 변경 후: num2 = " + num2);
        return;
    }
}
