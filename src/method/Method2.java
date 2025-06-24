package method;

public class Method2 {
    public static void main(String[] args) {
        boolean result = even(2);
        System.out.println(result);
    }
    public static boolean even(int i) {
        if (i % 2 == 0) {
            return true;
        }
        else {
            return false;
            // else문의 return이 없으면 컴파일 에러 발생!
        }
    }
}
