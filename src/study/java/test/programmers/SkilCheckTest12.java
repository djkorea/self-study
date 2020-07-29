package study.java.test.programmers;

/*
īī���� ���Ӻ��� �Ϲݱ� �ű� ���񽺷� ��Ʈ ������ ����ϱ�� �ߴ�. ��Ʈ ������ ��Ʈ�ǿ� ��Ʈ�� �� ���� ���� �� ������ �հ�� �Ƿ��� �ܷ�� ��������, ��ΰ� ������ ��� �� �ִ�.
�� �Ի��� ������ �ڵ� �Ƿ��� �����޾� ������ �ٽ� �κ��� ���� ��� ������ �ð� �Ǿ���. ��Ʈ ������ ���� ��� ������ �Ʒ��� ����.

��Ʈ ������ �� 3���� ��ȸ�� �����ȴ�.
�� ��ȸ���� ���� �� �ִ� ������ 0������ 10�������̴�.
������ �Բ� Single(S), Double(D), Triple(T) ������ �����ϰ� �� ���� ��÷ �� �������� 1����, 2����, 3���� (����1 , ����2 , ����3 )���� ���ȴ�.
�ɼ����� ��Ÿ��(*) , ������(#)�� �����ϸ� ��Ÿ��(*) ��÷ �� �ش� ������ �ٷ� ���� ���� ������ �� 2��� �����. ������(#) ��÷ �� �ش� ������ ���̳ʽ��ȴ�.
��Ÿ��(*)�� ù ��° ��ȸ������ ���� �� �ִ�. �� ��� ù ��° ��Ÿ��(*)�� ������ 2�谡 �ȴ�. (���� 4�� ����)
��Ÿ��(*)�� ȿ���� �ٸ� ��Ÿ��(*)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ��Ÿ��(*) ������ 4�谡 �ȴ�. (���� 4�� ����)
��Ÿ��(*)�� ȿ���� ������(#)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ������(#)�� ������ -2�谡 �ȴ�. (���� 5�� ����)
Single(S), Double(D), Triple(T)�� �������� �ϳ��� �����Ѵ�.
��Ÿ��(*), ������(#)�� �������� �� �� �ϳ��� ������ �� ������, �������� ���� ���� �ִ�.
0~10�� ������ ���� S, D, T, *, #�� ������ ���ڿ��� �Էµ� �� �������� ��ȯ�ϴ� �Լ��� �ۼ��϶�.

�Է� ����
����|���ʽ�|[�ɼ�]���� �̷���� ���ڿ� 3��Ʈ.
��) 1S2D*3T

������ 0���� 10 ������ �����̴�.
���ʽ��� S, D, T �� �ϳ��̴�.
�ɼ��� *�̳� # �� �ϳ��̸�, ���� ���� �ִ�.
��� ����
3���� ��ȸ���� ���� ���� �հ迡 �ش��ϴ� �������� ����Ѵ�.
��) 37

����� ����
����	dartResult	answer	����
1	1S2D*3T	37	11 * 2 + 22 * 2 + 33
2	1D2S#10S	9	12 + 21 * (-1) + 101
3	1D2S0T	3	12 + 21 + 03
4	1S*2T*3S	23	11 * 2 * 2 + 23 * 2 + 31
5	1D#2S*3S	5	12 * (-1) * 2 + 21 * 2 + 31
6	1T2D3D#	-4	13 + 22 + 32 * (-1)
7	1D2S3T*	59	12 + 21 * 2 + 33 * 2
�ؼ� ��������



 */
public class SkilCheckTest12 {
    public static void main(String[] args) {
        String str = "1S2D*3T";
        SkilCheckTest12 test = new SkilCheckTest12();
        System.out.println(test.solution(str));
    }

    public int solution(String dartResult) {
        int total = 0;

        for (int j = 0; j < 3; j++) {
            int roundScore = -1;

            for (int i = 0; i < dartResult.length(); i++) {

                if (Character.isDigit(dartResult.charAt(i))) {
                    if(roundScore >= 0){
                        roundScore = -1;
                    }
                    // ����
                    roundScore = Integer.parseInt(String.valueOf(dartResult.charAt(i)));
                } else if ("*".equals(dartResult.charAt(i)) || "#".equals(dartResult.charAt(i))) {
                    // * x2, # * -1
                    if("*".equals(dartResult.charAt(i))){
                        roundScore = (int)Math.pow(roundScore, 2);
                    }else{
                        roundScore = roundScore * -1;
                    }
                } else {
                    // S D T
                    roundScore = bonus(roundScore, String.valueOf(dartResult.charAt(i)));
                }
                System.out.println(roundScore);
            }
            total = total + roundScore;
            System.out.println("------");
            System.out.println(roundScore+"\t"+total);
            System.out.println();
        }

        return total;
    }

    private int bonus(int score, String bonus){
        return (int)Math.pow(score, "S".equals(bonus)?1:"D".equals(bonus)?2:"T".equals(bonus)?3:1);
    }
}
