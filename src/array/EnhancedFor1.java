package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

//        for (int i = 0; i < numbers.length; i++){
//            System.out.print(numbers[i] + " ");
//        }

        // iter 단축어로도 만들 수 있음.
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // for each문을 쓸 수 없는 경우: 증가하는 인덱스 값 필요할 떄


    }
}
