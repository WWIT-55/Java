//3/15 [8-1]2차원 배열 반복문

package ex4.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) throws IOException {

		int count = 0;//1~79줄까지, 행의 갯수를 읽기위해 사용
		String[][] rows;
		//레코드 개수를 알아내는 코드
		{
		
			FileInputStream fis = new FileInputStream("res/jeju.txt");
			Scanner fscan = new Scanner(fis);
			
		
			//while 반복을 하면서 count++ 연산을한다. 마지막 줄을 만날때까지.
			while(fscan.hasNextLine()) {
				fscan.nextLine();
				count++;
			}
			
			fscan.close();
			fis.close();
			count--;//첫번째 행빼준것
			System.out.printf("%d", count);
			
		
		}
		
		
		//레코드를 로드하는코드
		{
			
		//2차원 배열을 만들기시작
		rows = new String[count][];
		
		FileInputStream fis = new FileInputStream("res/jeju.txt");
		Scanner fscan = new Scanner(fis);
		
		
		String line;
		
		fscan.nextLine();
		
		for(int i=0; i<count; i++) {
			line = fscan.nextLine();
			rows[i] = line.split(",");
			
			//
		}
		
		
	
		fscan.close();
		fis.close();
		
		}
		//----------------------------
		//출력하는 코드
		for(int j=0; j<count; j++) {
			for(int i=0; i<10; i++) {
				System.out.printf("%s", rows[j][i]);
				
				if(i < 9)
					System.out.printf(",");
		}
		System.out.println();
		
	
		}
		//--------------------------	
		//검사진행자 누적수를 얻는 코드
		{
			int total =0;
			
			for(int i =0; i<count; i++)
				total += Integer.parseInt(rows[i][3]);
			
			System.out.println(total);
			
//			total += rows[0][3];
//			total += rows[1][3];
//			total += rows[2][3];
//			total += rows[3][3];
//			total += rows[4][3];
//					...
//			
//			total += rows[78][3];
//		
			
				
		}
	}
		
}
            