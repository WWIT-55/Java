//3/15 [8-1]2���� �迭 �ݺ���

package ex4.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) throws IOException {

		int count = 0;//1~79�ٱ���, ���� ������ �б����� ���
		String[][] rows;
		//���ڵ� ������ �˾Ƴ��� �ڵ�
		{
		
			FileInputStream fis = new FileInputStream("res/jeju.txt");
			Scanner fscan = new Scanner(fis);
			
		
			//while �ݺ��� �ϸ鼭 count++ �������Ѵ�. ������ ���� ����������.
			while(fscan.hasNextLine()) {
				fscan.nextLine();
				count++;
			}
			
			fscan.close();
			fis.close();
			count--;//ù��° �໩�ذ�
			System.out.printf("%d", count);
			
		
		}
		
		
		//���ڵ带 �ε��ϴ��ڵ�
		{
			
		//2���� �迭�� ��������
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
		//����ϴ� �ڵ�
		for(int j=0; j<count; j++) {
			for(int i=0; i<10; i++) {
				System.out.printf("%s", rows[j][i]);
				
				if(i < 9)
					System.out.printf(",");
		}
		System.out.println();
		
	
		}
		//--------------------------	
		//�˻������� �������� ��� �ڵ�
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
            