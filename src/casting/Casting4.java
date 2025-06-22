package casting;

public class Casting4 {
    public static void main(String[] args) {

        // 같은 타입의 계산은 같은 타입의 결과를 출력
        int div1 = 3/2;
        System.out.println(div1); // 1

        double div2 = 3/2;
        System.out.println(div2); // double에 저장되므로 자동 casting -> 1.0

        // 다른 타입의 계산은 큰 범위 타입의 결과를 출력
        double div3 = 3.0/2;
        System.out.println(div3);

        double div4 = 3/2.0;
        System.out.println(div4);

        double div5 = (double) 3/2;
        System.out.println(div5);
    }
}
