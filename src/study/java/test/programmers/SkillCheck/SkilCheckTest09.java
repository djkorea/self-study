package study.java.test.programmers.SkillCheck;

import java.util.ArrayList;
import java.util.List;

/*
���� ����
�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,

arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
�迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
�迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����
����� ��
arr	answer
[1,1,3,3,0,1,1]	[1,3,0,1]
[4,4,4,3,3]	[4,3]
����� �� ����
����� �� #1,2
������ ���ÿ� �����ϴ�.

A
ä�� ���
��Ȯ��: 36.0
ȿ����: 14.0
�հ�: 50.0 / 50

 */
public class SkilCheckTest09 {
    public static void main(String[] args) {
        SkilCheckTest09 test =  new SkilCheckTest09();
        int[] param = {1,1,3,3,0,1,1};
        for(int num : test.solution(param)){
            System.out.println(num);
        }
    }

    public int[] solution(int []arr) {
        final int MAX_LOOP = 1000000;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(i == MAX_LOOP) break;
            if(result.size() == 0) {
                result.add(arr[i]);
            }else{
                if(arr[i] != arr[i-1] && arr[i] >= 0 && arr[i] <= 9){
                    result.add(arr[i]);
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
