package operator;

public class Operator2 {
    public static void main(String[] args) {

        String result1 = "Hello" + "World";
        System.out.println(result1);

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기1
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        // 문자열과 숫자 더하기2
        int num = 100;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
