//0308 ����
package ex1.bit;



public class Main2 {

	public static void main(String[] args) {
		//1. ���� 10���� �����ϱ� ���� ���ڹ迭 chs�� ����ÿ�
		char[] chs = new char[10];
		
		//J���� A���� ä��� �ڵ带 �ۼ��Ͻÿ�.
		for (int i = 0; i < 10; i++)
			chs[i] = (char) ('J' - i);
		
		//A B C D E F G H I J 
		char temp;
		for (int i = 0; i < 10; i++) {
			temp = chs[i];
			chs[i] = chs[9 - i];
			chs[9 - i] = temp;
			
			temp = chs[0];
			chs[9] = chs[8];
			chs[8] = temp;

		}

		// �迭�� ����� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		for (int i = 0; i < 10; i++)
			System.out.printf("%c ", chs[i]);

	}

}
