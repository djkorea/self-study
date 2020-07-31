package study.java.test.programmers.SkillCheck;

import java.util.ArrayList;
import java.util.Collections;

/*
���� ����
array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.

���ѻ���
arr�� �ڿ����� ���� �迭�Դϴ�.
���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�.
divisor�� �ڿ����Դϴ�.
array�� ���� 1 �̻��� �迭�Դϴ�.
����� ��
arr	divisor	return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	10	[-1]
����� �� ����
����� ��#1
arr�� ���� �� 5�� ������ �������� ���Ҵ� 5�� 10�Դϴ�. ���� [5, 10]�� �����մϴ�.

����� ��#2
arr�� ��� ���Ҵ� 1���� ������ �������ϴ�. ���Ҹ� ������������ ������ [1, 2, 3, 36]�� �����մϴ�.

����� ��#3
3, 2, 6�� 10���� ������ �������� �ʽ��ϴ�. ������ �������� ���Ұ� �����Ƿ� [-1]�� �����մϴ�.

A
ä�� ���
��Ȯ��: 50.0
ȿ����: 0.0
�հ�: 50.0 / 50

 */
public class SkilCheckTest13 {
    public static void main(String[] args) {
        int[] intArr= {2, 36, 1, 3};
        SkilCheckTest13 test = new SkilCheckTest13();

        for(int num : test.solution(intArr, 1)){
            System.out.println(num);
        }
    }

    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr){
            if(num%divisor == 0){
                result.add(num);
            }
        }

        if(result.size() == 0){
            return new int[]{-1};
        }else {
            Collections.sort(result);
            return result.stream().mapToInt(i -> i).toArray();
        }
    }
}
