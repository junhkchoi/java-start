package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. 함수 호출 전: number = " + number); // 5 출력
        changeNumber(number); // 10 출력
        System.out.println("4. changeNumber 호출 후: number = " + number); // 5 출력 -> 대원칙: 자바는 항상 변수의 값을 복사해서 대입한다. (원본 헷갈림)
        // 참조형도 참조형 변수에 있는 값인 참조값을 복사하는 것이다!
    }
    public static void changeNumber(int number) {
        System.out.println("2. 함수 변경 전: number = " + number); // main 메서드의 변수와 changeNumber안의 변수는 다른 변수다
        number =  number * 2;
        System.out.println("3. 함수 변경 후: number = " + number);
        return;
    }
}
