//0309 �迭

package ex3.control;

public class ex3array2 {

	public static void main(String[] args) {
		//�ݸ��� ����ϴ� �Ϳ� ������ �ΰ� ����
		//1. ���� 10���� �����ϱ� ���� ���ڹ迭 chs�� ����ÿ�
		char[]chs = new char[10];//[]�� 0-10(11��)�� �ƴ϶� 0-9����(10��) �������
				
									
//		//2.chs �迭�� ���� 'A'�� ��� ä��ÿ�
//			for(int i=0; i<10; i++)
//				chs[i] = 'A';
		
		
		
//		//3.chs �迭�� ����� ������ ��� ����Ͻÿ�, �� �����
//		//A A A A A A A A A
//			for(int i=0; i<10; i++)
//				System.out.printf("%c ", chs[i]);
			
		
		
		
		//J���� A���� ä��� �ڵ带 �ۼ��Ͻÿ�.
			for(int i =0; i<10; i++)
				chs[i] = (char) ('J'-i);
			
			//A�� J�� �ڸ��� �ٲ���
			//J I H G F E D C B A 
			//A I H G F E D C B J 
			
			//A B C D E F G H I J 
			
			char temp;
			
			for(int i=0; i<10; i++)  {
				temp = chs[i];
				chs[i] = chs[9-i];
				chs[9-i] = temp;
				
				}
			
//			1. [0] -> temp;
//			2. [9] -> [0];
//			3. temp ->[9]
			
			
		//�迭�� ����� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
			for(int i=0; i<10; i++)
				System.out.printf("%c ", chs[i]);
			
			
		
	}

}
