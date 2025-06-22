package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 1;

        if(true) {
            int x = 2;
            System.out.println("m = " + m);
            System.out.println("x = " + x);
        }

        // System.out.println("x = " + x); -> x의 스코프를 벗어남: 오류!

    }
}
