package study.java.test.programmers;
/*
���� ����
�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.

���ѻ���
s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
����� ��
s	return
abcde	c
qwer	we


 */
public class SkilCheckTest06 {
    public static void main(String[] args) {
        SkilCheckTest06 test = new SkilCheckTest06();
        System.out.println(test.solution("a"));
    }

    public String solution(String s) {
        if(s == null || s.length() == 0 || s.length() > 100) return "";
        return s.substring(s.length()/2-(s.length()%2==0?1:0), s.length()/2+1);
    }
}
