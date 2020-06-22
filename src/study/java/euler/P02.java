package study.java.euler;
/*
Q
피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?

A
3524573
 */


import java.util.ArrayList;
import java.util.List;

public class P02 {
    public static void main(String[] args) {

        int lastCheckNumber = 4000000;
        int sum = 0;
        int startnumber = 1;
        int firstLocation = 0, secondLocation = 1;
        int next = 0;
        List<Integer> queue = new ArrayList<>();

        while (sum <= lastCheckNumber){
            if(queue == null || queue.size() == 0){
                queue.add(firstLocation, startnumber);
                queue.add(secondLocation, startnumber + startnumber);
            }
            next = queue.get(firstLocation) + queue.get(secondLocation);

            if(sum + next > lastCheckNumber){
                break;
            }

            sum = sum + next;
            queue.add(firstLocation, queue.get(secondLocation));
            queue.add(secondLocation, next);
//            System.out.println(next);
        }
        System.out.println(sum);
    }
}
