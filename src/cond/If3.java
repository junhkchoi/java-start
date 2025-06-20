package cond;

public class If3 {
    public static void main(String[] args) {

        int age = -1;

        if (age <= 7) {
            System.out.println("미취학");
        }
        else if (age > 7 && age <= 12) {
            System.out.println("초등학생");
        }
        else if (age > 12 && age <= 18) {
            System.out.println("청소년");
        }
        else {
            System.out.println("성인");
        }
    }
}
