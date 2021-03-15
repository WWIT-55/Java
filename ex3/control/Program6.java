//Program3[3월11일 수업!오후12시]

package ex3.control;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("res/names.txt");
		Scanner fscan = new Scanner(fis);
		
		String line = fscan.nextLine();
		
		String[] names =line.split(",");
		
		System.out.println(names[5]);
		
		fscan.close();
		fis.close();
		
	
		
	}
		
}
            