//3/12 1교시

package ex4.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = new FileInputStream("res/jeju.txt");
		Scanner fscan = new Scanner(fis);
		
		
		
		int total = 0;
		
		String line = fscan.nextLine();//첫번째줄 불러옴
		//CSV
		//2020-10-01,59,0,28,0,0,58....
		line = fscan.nextLine();//두번째줄불러옴..
		
		//["2020-10-01","59","0","28","0","0","58",....]
		String[] cols = line.split(",");
		
		
		System.out.println(cols[3]); //저 라인의 3번째를 출력
	
		
		line = fscan.nextLine();//3번째줄 불러옴..
		
		
		//["2020-10-01","59","0","28","0","0","58","8","230","2020-12-14"]	
		cols = line.split(",");
		
		System.out.println(cols[3]);
		
		
			
		
		//스플릿
		//4번째 데이터를 얻어서 정수로 변환하고
		
		//10월1일부터 14일까지의 누적 검사 진행수:32123
//		while(fscan.hasNextLine()) {
//			
//			
//		}
		
	
	
		fis.close();
		fscan.close();
	}
		
}
            