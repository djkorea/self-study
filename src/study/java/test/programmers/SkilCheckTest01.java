package study.java.test.programmers;

import java.util.ArrayList;
import java.util.List;

/*
문제 설명
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

제한 조건
공백은 아무리 밀어도 공백입니다.
s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
s의 길이는 8000이하입니다.
n은 1 이상, 25이하인 자연수입니다.

입출력 예
s	    n	result
AB	    1	BC
z	    1	a
a B z	4	e F d

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
