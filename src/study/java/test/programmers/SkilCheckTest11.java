package study.java.test.programmers;

/*
���� ����
String�� �迭 seoul�� element�� Kim�� ��ġ x�� ã��, �輭���� x�� �ִٴ� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. seoul�� Kim�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.

���� ����
seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
Kim�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
����� ��
seoul	return
[Jane, Kim]	�輭���� 1�� �ִ�

A
ä�� ���
��Ȯ��: 50.0
ȿ����: 0.0
�հ�: 50.0 / 50
 */
public class SkilCheckTest11 {
    public static void main(String[] args) {
        SkilCheckTest11 test = new SkilCheckTest11();
        String[] str = {"Jane", "Kim"};
        System.out.println(test.solution(str));
    }

    public String solution(String[] seoul) {
        int limit = seoul == null? 0 : seoul.length > 1000 ? 1000 : seoul.length;
        String targetName = "Kim";
        int location = 0;

        for (int i = 0; i < limit; i++) {
            if(targetName.equals(seoul[i])){
              location = i;
              break;
            }
        }
        String answer = "�輭���� "+location+"�� �ִ�";
        return answer;
    }
}
