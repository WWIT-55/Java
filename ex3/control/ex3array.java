//0309 �迭 

package ex3.control;

import java.util.Random;

public class ex3array {

	public static void main(String[] args) {
		//Random ��ü�� rand��� �̸����� �����
		Random rand = new Random();
		System.out.println(rand.nextInt(45));//0-45������ ��� ->1~45
		
		
		//1. kor�̶�� �̸��� ���� 6��¥�� �迭�� �������ֽÿ�.
		int[]kors = new int[6];
		//2.kors�� 3��° �濡 36�� ��� �ʹ�.
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
