package study.java.test.programmers;

/*
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
1	1S2D*3T	37	11 * 2 + 22 * 2 + 33
2	1D2S#10S	9	12 + 21 * (-1) + 101
3	1D2S0T	3	12 + 21 + 03
4	1S*2T*3S	23	11 * 2 * 2 + 23 * 2 + 31
5	1D#2S*3S	5	12 * (-1) * 2 + 21 * 2 + 31
6	1T2D3D#	-4	13 + 22 + 32 * (-1)
7	1D2S3T*	59	12 + 21 * 2 + 33 * 2

A

ä�� ���
��Ȯ��: 50.0
ȿ����: 0.0
�հ�: 50.0 / 50
 */
public class SkilCheckTest15 {
    public static void main(String[] args) {
        SkilCheckTest15 test = new SkilCheckTest15();
        System.out.println(test.solution("1D2S#10S"));

    }

    int round1Score = 0;
    int round2Score = 0;
    int round3Score = 0;

    int round = 0;

    public int solution(String dartResult) {
        int answer = 0;


        for (int i = 0; i < dartResult.length(); i++) {
            String ch = String.valueOf(dartResult.charAt(i));
            if(Character.isDigit(dartResult.charAt(i))){
                round++;

                if(Character.isDigit(dartResult.charAt(i+1))){
                    ch = ch + String.valueOf(dartResult.charAt(i+1));
                    i++;
                }
                int score = Integer.parseInt(ch);
                setScore(score);

            }else if("*".equals(ch)){
                setPreScore(getPreScore() * 2);
                setScore(getScore() * 2);
            }else if("#".equals(ch)){
                setScore(getScore() * -1);
            }else{
                setScore((int)Math.pow(getScore(), "S".equals(ch) ? 1 : "D".equals(ch) ? 2 : "T".equals(ch) ? 3 : 0));
            }
        }

        return round1Score + round2Score + round3Score;
    }

    private int getScore(){
        return round == 1 ? round1Score : round == 2 ? round2Score : round3Score;
    }

    private int getPreScore(){
        return round == 1 ? 0 : round == 2 ? round1Score : round2Score;
    }

    private void setScore(int score){
        if(round == 1) round1Score = score;
        else if(round == 2) round2Score = score;
        else round3Score = score;
    }

    private void setPreScore(int score){
        if(round == 2) round1Score = score;
        else if(round == 3) round2Score = score;
    }
}
