package study.java.test.programmers.skillCheckLv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
���� ����
���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.

���� ����
str�� ���� 1 �̻��� ���ڿ��Դϴ�.
����� ��
s	return


A. not yet
 */
public class SkilCheckTest05 {
    public static void main(String[] args) {
        SkilCheckTest05 test = new SkilCheckTest05();
        System.out.println(test.solution("Zbcdefg"));
    }

    public String solution(String s) {
        int cnt = 0;
        List<String> result = new ArrayList<>();
        while(cnt < s.length()){
            result.add(s.substring(cnt, cnt+1));
            cnt++;
        }
        Collections.sort(result);

        StringBuilder builder = new StringBuilder();
        for(String str : result){
            builder.append(str);
        }
        return builder.toString();
    }
}
