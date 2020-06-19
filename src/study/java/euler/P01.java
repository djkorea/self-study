package study.java.euler;
/*
Q
10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?

A
233168
 */
public class P01 {
    public static void main(String[] args){
        int limit= 1000;
        int sum = 0;
        for (int i = 1; i < limit; i++) {
            if (i%3 == 0 || i%5 ==0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
