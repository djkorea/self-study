package study.java.test.programmers.skillCheckLv1;

import java.util.ArrayList;
import java.util.List;

/*
문제 설명
배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,

arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

제한사항
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
입출력 예
arr	answer
[1,1,3,3,0,1,1]	[1,3,0,1]
[4,4,4,3,3]	[4,3]
입출력 예 설명
입출력 예 #1,2
문제의 예시와 같습니다.

A
채점 결과
정확성: 36.0
효율성: 14.0
합계: 50.0 / 50

 */
public class SkilCheckTest09 {
    public static void main(String[] args) {
        SkilCheckTest09 test =  new SkilCheckTest09();
        int[] param = {1,1,3,3,0,1,1};
        for(int num : test.solution(param)){
            System.out.println(num);
        }
    }

    public int[] solution(int []arr) {
        final int MAX_LOOP = 1000000;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(i == MAX_LOOP) break;
            if(result.size() == 0) {
                result.add(arr[i]);
            }else{
                if(arr[i] != arr[i-1] && arr[i] >= 0 && arr[i] <= 9){
                    result.add(arr[i]);
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
