//0309 �迭 ȥ�� �غ���

package ex4.array;

public class ex3array3 {

	public static void main(String[] args) {
		//�ݸ��� ����ϴ� �Ϳ� ������ �ΰ� ����
		//1. ���� 10���� �����ϱ� ���� ���ڹ迭 chs�� ����ÿ�
		 char[] chs = new char[10];
		 
				
									
//		//2.chs �迭�� ���� 'A'�� ��� ä��ÿ�
		 	for(int i=0;i<10;i++)
		 		chs[i]= 'A';
		 	
//		
//		
//		
//		//3.chs �迭�� ����� ������ ��� ����Ͻÿ�, �� �����
//		//A A A A A A A A A
//			for(int i=0;i<10;i++)
//		 		System.out.printf("%c", chs[i]);
			
		
		
		/*A���� J���� ä��� �ڵ带 �ۼ��Ͻÿ�.
			for(int i=0;i<10;i++)
				chs[i] = (char) ('A'+i);*/
		 	
		
		// 4.J���� A���� ä��� �ڵ带 �ۼ��Ͻÿ�.
		//J I H G F E D C B A ���´ٸ� ����!
//		  	for(int i=0;i<10;i++)
//		 		chs[i] = (char) ('J'-i);
		 		
		 	
			
			
			//A�� J�� �ڸ��� �ٲ���
		 	//J I H G F E D C B A ���´ٸ� ����!
		 	
		 	int temp;
		 	
		 	for(int i =0;i<5;i++) {
		 		temp = chs[i];
			 	chs[i] = chs[9-i];
			 	chs[9-i] = temp;
			 	
		 		}	
		 	
		 			  
		 			  
		 			
		 	
		 	
			//A I H G F E D C B J 
			
			//A B C D E F G H I J 
		
//			1. [0] -> temp;
//			2. [9] -> [0];
//			3. temp ->[9]
			
			
		//�迭�� ����� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
			
			for(int i=0;i<10;i++)
				System.out.printf("%c", chs[i]);
			
		
	}

}
