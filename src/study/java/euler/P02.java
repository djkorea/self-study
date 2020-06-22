package study.java.euler;
/*
Q
�Ǻ���ġ ������ �� ���� �ٷ� ���� �� �� ���� ���� ���� �˴ϴ�. 1�� 2�� �����ϴ� ��� �� ������ �Ʒ��� �����ϴ�.

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
¦���̸鼭 4�鸸 ������ ��� ���� ���ϸ� �󸶰� �˴ϱ�?

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
