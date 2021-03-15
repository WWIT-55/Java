//0309 배열 혼자 해보기

package ex3.control;

public class ex3array3 {

	public static void main(String[] args) {
		//반목문을 사용하는 것에 초점을 두고 연습
		//1. 문자 10개를 저장하기 위한 문자배열 chs를 만드시오
		 char[] chs = new char[10];
		 
				
									
//		//2.chs 배열에 문자 'A'를 모두 채우시오
		 	for(int i=0;i<10;i++)
		 		chs[i]= 'A';
		 	
//		
//		
//		
//		//3.chs 배열에 담겨진 값들을 모두 출력하시오, 단 모양은
//		//A A A A A A A A A
//			for(int i=0;i<10;i++)
//		 		System.out.printf("%c", chs[i]);
			
		
		
		/*A부터 J까지 채우는 코드를 작성하시오.
			for(int i=0;i<10;i++)
				chs[i] = (char) ('A'+i);*/
		 	
		
		// 4.J부터 A까지 채우는 코드를 작성하시오.
		//J I H G F E D C B A 나온다면 성공!
//		  	for(int i=0;i<10;i++)
//		 		chs[i] = (char) ('J'-i);
		 		
		 	
			
			
			//A와 J의 자리를 바꾸자
		 	//J I H G F E D C B A 나온다면 성공!
		 	
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
			
			
		//배열에 담겨진 값을 출력하는 코드를 작성하시오.
			
			for(int i=0;i<10;i++)
				System.out.printf("%c", chs[i]);
			
		
	}

}
