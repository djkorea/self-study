package study.java.euler;
/*
Q
10���� ���� �ڿ��� �߿��� 3 �Ǵ� 5�� ����� 3, 5, 6, 9 �̰�, �̰��� ��� ���ϸ� 23�Դϴ�.
1000���� ���� �ڿ��� �߿��� 3 �Ǵ� 5�� ����� ��� ���ϸ� ���ϱ��?

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
