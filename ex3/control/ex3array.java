//0309 배열 

package ex3.control;

import java.util.Random;

public class ex3array {

	public static void main(String[] args) {
		//Random 객체를 rand라는 이름으로 만들기
		Random rand = new Random();
		System.out.println(rand.nextInt(45));//0-45까지만 출력됌 ->1~45
		
		
		//1. kor이라는 이름의 정수 6개짜리 배열을 생성해주시오.
		int[]kors = new int[6];
		//2.kors의 3번째 방에 36을 담고 싶다.
		//kors[2] = 36;
		
		
		for(int i=0; i<6; i++)
			kors[i]=rand.nextInt(45)+1;
		
			/*
			kors[0]=rand.nextInt(45)+1;
			kors[1]=rand.nextInt(45)+1;
			kors[2]=rand.nextInt(45)+1;
			kors[3]=rand.nextInt(45)+1;
			kors[4]=rand.nextInt(45)+1;
			kors[5]=rand.nextInt(45)+1;*/
			
		
		for(int i=0; i<6; i++)
			System.out.printf("%d ", kors[i]);
		/*System.out.printf("%d ", kors[0]);
		System.out.printf("%d ", kors[1]);
		System.out.printf("%d ", kors[2]);
		System.out.printf("%d ", kors[3]);
		System.out.printf("%d ", kors[4]);
		System.out.printf("%d ", kors[5]);
*/
		

	}

}
