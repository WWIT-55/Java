//<03/10>array test2

package ex3.control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) throws Exception {
		
		//1. 정수 10개짜리 names  배열을 생성한다.
		//
		String[] names = new String[10];
		
		//2. 파일에서 이름들을 읽어와서 names  배열에 대입한다.
		FileInputStream fis = new FileInputStream("res/names.txt");
		Scanner fscan = new Scanner(fis);
		
		int i = 0;
		while(fscan.hasNextLine()) {
			String name = fscan.nextLine();
			names[i++] = name;
			
		
		
		}
		
		fscan.close();
		fis.close();
		
		
		//3. names 배열의 이름을 다음처럼 콘솔에  출력한다.
		//홍길동,김길동,강호동,유재석
				
		for(int j=0;j<i;j++) {
				System.out.printf("%s", names[i]);
				
				if(j<i-1)
					System.out.print(",");
		}		
		
		
	}

}
         