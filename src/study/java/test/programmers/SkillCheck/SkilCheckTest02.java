package study.java.test.programmers.SkillCheck;

/*
���� ����
���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.

���� ����
���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
ù ��° ���ڴ� 0��° �ε����� ���� ¦����° ���ĺ����� ó���ؾ� �մϴ�.
����� ��
s	return
try hello world	TrY HeLlO WoRlD
����� �� ����
try hello world�� �� �ܾ� try, hello, world�� �����Ǿ� �ֽ��ϴ�. �� �ܾ��� ¦����° ���ڸ� �빮�ڷ�, Ȧ����° ���ڸ� �ҹ��ڷ� �ٲٸ� TrY, HeLlO, WoRlD�Դϴ�. ���� TrY HeLlO WoRlD �� �����մϴ�.


A
not yet
 */
public class SkilCheckTest02 {

    public static void main(String[] args) {
        SkilCheckTest02 test = new SkilCheckTest02();
        test.solution("kim   doo jin");
    }

    public String solution(String s) {
        return transformCase(s);
    }

    public String transformCase(String str){
        String returnValue = "";
        boolean isUpperCase = true;
        for (int i = 0; i < str.length(); i++) {
            String subStr = str.substring(i, i+1);
            if(subStr.trim().length() == 0){
                isUpperCase = true;
                returnValue = returnValue + subStr;
                continue;
            }
            returnValue = returnValue + (isUpperCase?subStr.toUpperCase():subStr);
            isUpperCase = !isUpperCase;
        }
        System.out.println(String.valueOf(returnValue));
        return returnValue;
    }


}
