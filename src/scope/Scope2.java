package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 1;
        for (int i = 0; i <= 2; i++) {
            System.out.println("m = " + m);
            System.out.println("x = " + i);
        }
        // System.out.println(i); -> for문의 Scope 벗어남
    }
}
