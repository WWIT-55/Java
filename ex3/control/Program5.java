//3월11일수업 11시

package ex3.control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		String[] names = new String[] {"강호동","유재석","하하","김지호", "김현준","김태희","박민정"};
		
		String n1 = "홍길동";
		String n2 = "홍길동";
		String n3 = new String("홍길동");
		String n4 = new String("홍길동");
		
		System.out.println(n1 == n2);
		System.out.println(n1.equals(n2));		
		System.out.println(n3 == n4);
		System.out.println(n3.equals(n4));
		
		String fileName = "photo.jpg";
		System.out.println(fileName.length());
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.substring(3));		
		System.out.println(fileName.substring(0,3));
				
		int pos = fileName.indexOf(".");
		System.out.println(fileName.substring(0,pos));
		
		System.out.println(fileName.compareTo("paoto.jpg"));
		
		
		
		
		
	
		Random rand = new Random();
		
		
		for(int i =0; i<100; i++) {
			int idx1 = rand.nextInt(7);
			int idx2 = rand.nextInt(7);
			//System.out.printf("idx1:%d, idx2:%d", idx1, idx2);
		
		
			//두 인덱스 위치의 값을 바꿔라
			//{1,2,3,4,5,6,7,8,9,10}
			String temp;
			temp = names[idx1];
			names[idx1] = names[idx2];
			names[idx2] = temp;
		}
		
		
		//정렬
		
		for(int j=0; j<7; j++) // 0~5
			for(int i =0; i<7-1-j; i++)//-j를 써주는 이유.. 컴퓨터성능때문! j를 써주면 하하를 제외한 나머지 값들만 비교를하게 됨->하하는 자리를 찾았으니까 더이상 비교를 안해도 되니까!!
					if(names[i].compareTo(names[i+1]) > 0 ) {
					String temp;
					temp = names[i];
					names[i] = names[i+1];
					names[i+1] = temp;
					
				}//버블정렬: 앞에거랑 뒤에거랑 비교해서 큰거를 뒤로 보낸다..
				//양수일때 앞에있는게 더 크다.(음수일때 앞에 있는 값이 작다.)
				//동일하면 0을 반환
				
				
		for(int i =0;i<7;i++) {
			System.out.printf("\"%s\"", names[i]);
			
			//예외항목
			if(i<7-1)
				System.out.print(",");
		}
		System.out.println();
	}
		
		
}
         