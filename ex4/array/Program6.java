//3/12 1����

package ex4.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = new FileInputStream("res/jeju.txt");
		Scanner fscan = new Scanner(fis);
		
		
		
		int total = 0;
		
		String line = fscan.nextLine();//ù��°�� �ҷ���
		//CSV
		//2020-10-01,59,0,28,0,0,58....
		line = fscan.nextLine();//�ι�°�ٺҷ���..
		
		//["2020-10-01","59","0","28","0","0","58",....]
		String[] cols = line.split(",");
		
		
		System.out.println(cols[3]); //�� ������ 3��°�� ���
	
		
		line = fscan.nextLine();//3��°�� �ҷ���..
		
		
		//["2020-10-01","59","0","28","0","0","58","8","230","2020-12-14"]	
		cols = line.split(",");
		
		System.out.println(cols[3]);
		
		
			
		
		//���ø�
		//4��° �����͸� �� ������ ��ȯ�ϰ�
		
		//10��1�Ϻ��� 14�ϱ����� ���� �˻� �����:32123
//		while(fscan.hasNextLine()) {
//			
//			
//		}
		
	
	
		fis.close();
		fscan.close();
	}
		
}
            