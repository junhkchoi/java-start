package method;

public class Method3 {
    public static void main(String[] args) {
        checkAge(30);
    }
    public static void checkAge(int age) {
        if (age > 18) {
            System.out.println("성인");
        }
        else {
            System.out.println("미자");
        }
    }
}
