package study.java.test.programmers;
/*
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
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
