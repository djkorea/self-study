package study.java.test.programmers.skillCheckLv1;

/*
���� ����
�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.

���� ����
a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
����� ��
a	b	return
3	5	12
3	3	3
5	3	12

A
ä�� ���
��Ȯ��: 50.0
ȿ����: 0.0
�հ�: 50.0 / 50

 */
public class SkilCheckTest14 {
    public static void main(String[] args) {
        SkilCheckTest14 test = new SkilCheckTest14();
        System.out.println(test.solution(3, 3));

    }


    public long solution(int a, int b) {
        long answer = 0;
        int from = a > b ? b : a;
        int to = b > a ? b : a;

        for(int i=from;i<=to;i++){
            answer += i;
        }

        return answer;
    }
}
