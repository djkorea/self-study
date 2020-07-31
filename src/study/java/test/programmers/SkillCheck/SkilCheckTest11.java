package study.java.test.programmers.SkillCheck;

/*
문제 설명
String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요. seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

제한 사항
seoul은 길이 1 이상, 1000 이하인 배열입니다.
seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
Kim은 반드시 seoul 안에 포함되어 있습니다.
입출력 예
seoul	return
[Jane, Kim]	김서방은 1에 있다

A
채점 결과
정확성: 50.0
효율성: 0.0
합계: 50.0 / 50
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
        String answer = "김서방은 "+location+"에 있다";
        return answer;
    }
}
