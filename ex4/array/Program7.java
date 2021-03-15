//3/15 

package ex4.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) throws IOException {
		
		String[] row1;
		String[] row2;
		
		FileInputStream fis = new FileInputStream("res/jeju.txt");
		Scanner fscan = new Scanner(fis);
		
		//String line = fscan.nextLine();이랑 다른건지?
		String line;
		fscan.nextLine();
		
		line = fscan.nextLine();
		row1 = line.split(",");
		
		line = fscan.nextLine();
		row2 = line.split(",");
		
		fscan.close();
		fis.close();
		
		
		//for(row1의 열들)
		for(int i=0; i<10; i++) {
			System.out.printf("%s", row1[i]);
			
			if(i < 9)
				System.out.printf(",");
		}
		System.out.println();
		//for(row2의 열들)
		for(int i=0; i<10; i++) {
			System.out.printf("%s", row2[i]);
			
			if(i < 9)
				System.out.printf(",");
		}
				
	}
		
}
            