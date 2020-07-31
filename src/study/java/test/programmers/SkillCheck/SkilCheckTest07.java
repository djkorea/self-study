package study.java.test.programmers.SkillCheck;

/*
���� ����
��Ʈ ����
īī���忡 �� �� ��° ��! �ɽ��� ��? īī���� ���Ӻ�~

Game Star

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
1	1S2D*3T	    37	    11 * 2 + 22 * 2 + 33
2	1D2S#10S	9	    12 + 21 * (-1) + 101
3	1D2S0T	    3	    12 + 21 + 03
4	1S*2T*3S	23	    11 * 2 * 2 + 23 * 2 + 31
5	1D#2S*3S	5	    12 * (-1) * 2 + 21 * 2 + 31
6	1T2D3D#	    -4	    13 + 22 + 32 * (-1)
7	1D2S3T*	    59	    12 + 21 * 2 + 33 * 2
 */
public class SkilCheckTest07 {
    public static void main(String[] args) {
        SkilCheckTest07 test = new SkilCheckTest07();
        System.out.println(test.solution("SkilCheckTest07"));
    }

    public int solution(String dartResult) {

        int answer = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            String str = dartResult.substring(i, i+1);

            int tempScore = 0;
            if("*".equals(str) || "#".equals(str)){
                checkOption(answer, str);
            }else if(isDigit(str)){
                tempScore = Integer.parseInt(str);
            }else{
                tempScore = (int) Math.pow(tempScore, "S".equals(str)?1:"D".equals(str)?2:"T".equals(str)?3:1);
            }
            System.out.println(tempScore);
            answer = answer * tempScore;
        }

        return answer;
    }

    private int checkOption(int score, String str){
        return score * ("*".equals(str)?2:"#".equals(str)?-1:1);
    }

    private boolean isDigit(String str){
        return Character.isDigit(str.charAt(0));
    }


}
