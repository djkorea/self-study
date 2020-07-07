package study.java.test.programmers;

import java.util.ArrayList;
import java.util.List;

/*
���� ����
� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. ���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. z�� 1��ŭ �и� a�� �˴ϴ�. ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.

���� ����
������ �ƹ��� �о �����Դϴ�.
s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
s�� ���̴� 8000�����Դϴ�.
n�� 1 �̻�, 25������ �ڿ����Դϴ�.

����� ��
s	    n	result
AB	    1	BC
z	    1	a
a B z	4	e F d


A
not yet
 */
public class SkilCheckTest01 {
    public static void main(String[] args) {
        SkilCheckTest01 test = new SkilCheckTest01();
        test.solution("a B c", 4);
    }

    public String solution(String s, int n) {
        List<String> inputArray = devide(s);
        StringBuilder output = new StringBuilder();
        for(String str : inputArray){
            output.append(move(str, 4));
        }
        return output.toString();
    }

    public List<String> devide(String s){
        List<String> list = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.substring(i, i+1));
        }
        return list;
    }

    public String move(String str, int moveCount){
        char alphabet = str.charAt(str.length()-1);
        if(str.toUpperCase().equals("Z")){
            alphabet = (char)(alphabet-26);
        }
        return str.trim().length()==0?str:String.valueOf((char)(alphabet+moveCount));
    }
}
