//array test2

package ex3.control;

import java.util.Random;

public class Program3 {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		
		
		 
		
		//�������� �� ���´�.
		
		Random rand = new Random();
		
		
		for(int i =0; i<100; i++) {
			int idx1 = rand.nextInt(10);
			int idx2 = rand.nextInt(10);
			System.out.printf("idx1:%d, idx2:%d", idx1, idx2);
		
		
		//�� �ε��� ��ġ�� ���� �ٲ��
		//{1,2,3,4,5,6,7,8,9,10}
			
		int temp;
		temp = num[idx1];
		num[idx1] = num[idx2];
		num[idx2] = temp;
		}
		//13~20�� 100�� �ݺ�
	
			
		
		//num ����ϴ� �ڵ带 �ۼ��Ѵ�.
		
		for(int i =0;i<10;i++) {
			 System.out.printf("%d", num[i]);
		 
			 if(i<9)
				 	System.out.print(",");
		
	}
		
		System.out.println();
		//����(��������/��������/������..)
		
		
		//����
		//���� ū���� ã�Ƽ� �� �ڷ� �о��
		//1.���࿡ num�� 0��° ���� 1��° ������ ũ�ٸ�
		//	�� ��ġ�� ���� �ٲٽÿ�
		//[][][][][] -> 5-1�� �ݺ����� ���ؼ� ���ǿ� ������ ��ü
		

	 	
			
			
		//2.���࿡ num�� 1��° ���� 2��° ������ ũ�ٸ�
		//	�� ��ġ�� ���� �ٲٽÿ�
		
	 	for(int j =0; j<10-1; j++) 
	 		for(int i =0; i<10-1-j; i++)
		 		if(num[i] > num[i+1]){	 
				int temp1;
		 		temp1 = num[i];
		 		num[i] = num[i+1];
		 		num[i+1] = temp1;
		 	
	 		}	
		
		//3.���࿡ num�� 2��° ���� 3��° ������ ũ�ٸ�
		//	�� ��ġ�� ���� �ٲٽÿ�
		
		
		for(int i =0;i<10;i++) {
			 System.out.printf("%d", num[i]);
		 
			 if(i<9)
				 	System.out.print(",");
		
			
			
		
		
		
		
		}
		
		System.out.println();
		
	}
		
}
            