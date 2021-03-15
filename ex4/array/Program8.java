//3/15 [7-1]2차원 배열

package ex4.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) throws IOException {
		
		String[][] rows = new String[2][];
		
		FileInputStream fis = new FileInputStream("res/jeju.txt");
		Scanner fscan = new Scanner(fis);
		
		//String line = fscan.nextLine();이랑 다른건지?
		String line;
		fscan.nextLine();
		
		line = fscan.nextLine();
		rows[0] = line.split(",");
		
		line = fscan.nextLine();
		rows[1] = line.split(",");
		
		fscan.close();
		fis.close();
		
		
		//for(row1의 열들)
		for(int i=0; i<10; i++) {
			System.out.printf("%s", rows[0][i]);
			
			if(i < 9)
				System.out.printf(",");
		}
		System.out.println();
		
		//for(row2의 열들)
		for(int i=0; i<10; i++) {
			System.out.printf("%s", rows[1][i]);
			
			if(i < 9)
				System.out.printf(",");
		}
				
	}
		
}
            