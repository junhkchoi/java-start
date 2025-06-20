package loop;

public class Nested1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i+"번째 세트");
            for (int j = 1; j <= 10; j++) {
                System.out.println(j);
            }
        }
    }
}
