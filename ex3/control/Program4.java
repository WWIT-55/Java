//<03/10>array test2

package ex3.control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) throws Exception {
		
		//1. ���� 10��¥�� names  �迭�� �����Ѵ�.
		//
		String[] names = new String[10];
		
		//2. ���Ͽ��� �̸����� �о�ͼ� names  �迭�� �����Ѵ�.
		FileInputStream fis = new FileInputStream("res/names.txt");
		Scanner fscan = new Scanner(fis);
		
		int i = 0;
		while(fscan.hasNextLine()) {
			String name = fscan.nextLine();
			names[i++] = name;
			
		
		
		}
		
		fscan.close();
		fis.close();
		
		
		//3. names �迭�� �̸��� ����ó�� �ֿܼ�  ����Ѵ�.
		//ȫ�浿,��浿,��ȣ��,���缮
				
		for(int j=0;j<i;j++) {
				System.out.printf("%s", names[i]);
				
				if(j<i-1)
					System.out.print(",");
		}		
		
		
	}

}
         