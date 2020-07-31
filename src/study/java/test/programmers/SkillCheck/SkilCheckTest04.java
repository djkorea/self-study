package study.java.test.programmers.SkillCheck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
���� ����
�迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.

���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��

array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
�迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
array�� ���̴� 1 �̻� 100 �����Դϴ�.
array�� �� ���Ҵ� 1 �̻� 100 �����Դϴ�.
commands�� ���̴� 1 �̻� 50 �����Դϴ�.
commands�� �� ���Ҵ� ���̰� 3�Դϴ�.
����� ��
array	commands	return
[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
����� �� ����
[1, 5, 2, 6, 3, 7, 4]�� 2��°���� 5��°���� �ڸ� �� �����մϴ�. [2, 3, 5, 6]�� �� ��° ���ڴ� 5�Դϴ�.
[1, 5, 2, 6, 3, 7, 4]�� 4��°���� 4��°���� �ڸ� �� �����մϴ�. [6]�� ù ��° ���ڴ� 6�Դϴ�.
[1, 5, 2, 6, 3, 7, 4]�� 1��°���� 7��°���� �ڸ��ϴ�. [1, 2, 3, 4, 5, 6, 7]�� �� ��° ���ڴ� 3�Դϴ�.

A
not yet

 */
public class SkilCheckTest04 {
    public static void main(String[] args) {
        SkilCheckTest04 test = new SkilCheckTest04();
        int[] args1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] args2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = test.solution(args1, args2);

        for(int num : result){
            System.out.println(num);
        }

    }

    public int[] solution(int[] array, int[][] commands) {

        List<Integer> result = new ArrayList<>();
        for(int[] intArr : commands){

            int cnt = 1;
            List<Integer> temp = new ArrayList<>();

            int start = intArr[0];
            int end = intArr[1];
            int find = intArr[2];
            for(int input : array){
                if(cnt > end) break;;

                if(cnt >= start && cnt <= end) {
                    temp.add(input);
                }
                cnt++;
            }

            if(temp.size() < find-1) break;;
            // int[] ����
            Collections.sort(temp);
            result.add(temp.get(find-1));

            // ������ ��ġ �� ã��
        }
        return result.stream().filter(i->i != null).mapToInt(i->i).toArray();
    }
}
