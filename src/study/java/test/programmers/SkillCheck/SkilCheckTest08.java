package study.java.test.programmers.SkillCheck;

import java.util.Arrays;

/*
���� ����
������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.

���� ����
arr�� ���� 1 �̻��� �迭�Դϴ�.
�ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.
����� ��
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]

A
net yet
 */
public class SkilCheckTest08 {
    public static void main(String[] args) {
        SkilCheckTest08 test = new SkilCheckTest08();

        int[] arr = {4,3,2,1};
        for(int a  : test.solution(arr)){
            System.out.println(a);
        }


    }

    public int[] solution(int[] arr) {
        Arrays.sort(arr);

        for(int a : arr){
            System.out.println(a);
        }

        int[] answer = new int[arr.length<=1?1:arr.length-1];
        if(arr.length == 1){
            answer[0] = -1;
        }else{
            for (int i = 1; i < arr.length; i++) {
                answer[i-1] = arr[i];
            }
        }

        return answer;
    }
}
