package study.java.test.programmers.SkillCheck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
입출력 예
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
