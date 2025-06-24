package method.ex1;

public class MethodEx2 {
    public static void main(String[] args) {
        repeatMessage("Hello, World!", 3);
    }
    public static void repeatMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
