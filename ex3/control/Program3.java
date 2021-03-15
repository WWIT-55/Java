//array test2

package ex3.control;

import java.util.Random;

public class Program3 {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		
		
		 
		
		//랜덤값을 얻어서 섞는다.
		
		Random rand = new Random();
		
		
		for(int i =0; i<100; i++) {
			int idx1 = rand.nextInt(10);
			int idx2 = rand.nextInt(10);
			System.out.printf("idx1:%d, idx2:%d", idx1, idx2);
		
		
		//두 인덱스 위치의 값을 바꿔라
		//{1,2,3,4,5,6,7,8,9,10}
			
		int temp;
		temp = num[idx1];
		num[idx1] = num[idx2];
		num[idx2] = temp;
		}
		//13~20줄 100번 반복
	
			
		
		//num 출력하는 코드를 작성한다.
		
		for(int i =0;i<10;i++) {
			 System.out.printf("%d", num[i]);
		 
			 if(i<9)
				 	System.out.print(",");
		
	}
		
		System.out.println();
		//정렬(버블정렬/선택정렬/퀵정렬..)
		
		
		//집계
		//제일 큰놈을 찾아서 맨 뒤로 밀어내기
		//1.만약에 num의 0번째 값이 1번째 값보다 크다면
		//	두 위치의 값을 바꾸시오
		//[][][][][] -> 5-1번 반복으로 비교해서 조건에 맞으면 교체
		

	 	
			
			
		//2.만약에 num의 1번째 값이 2번째 값조다 크다면
		//	두 위치의 값을 바꾸시오
		
	 	for(int j =0; j<10-1; j++) 
	 		for(int i =0; i<10-1-j; i++)
		 		if(num[i] > num[i+1]){	 
				int temp1;
		 		temp1 = num[i];
		 		num[i] = num[i+1];
		 		num[i+1] = temp1;
		 	
	 		}	
		
		//3.만약에 num의 2번째 값이 3번째 값조다 크다면
		//	두 위치의 값을 바꾸시오
		
		
		for(int i =0;i<10;i++) {
			 System.out.printf("%d", num[i]);
		 
			 if(i<9)
				 	System.out.print(",");
		
			
			
		
		
		
		
		}
		
		System.out.println();
		
	}
		
}
            