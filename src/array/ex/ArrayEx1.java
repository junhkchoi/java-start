package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] studentScores = {91, 90, 83, 70, 54};
        int sum = 0;
        double average;
        for (int studentScore : studentScores) {
            sum += studentScore;
        }
        average = (double) sum/studentScores.length;
        System.out.println(average);
    }
}
