package cond.ex;

public class GradeEx {
    public static void main(String[] args) {

        char grade = 'A';

        String result = switch (grade) {
            case 'A' -> "좋은 성적입니다";
            case 'B' -> "평균 성적입니다";
            case 'C' -> "재수강해라임마";
            default -> "잘못된 학점입니다";
        };
        System.out.println(result);
    }
}
