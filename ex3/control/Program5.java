//3��11�ϼ��� 11��

package ex3.control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		String[] names = new String[] {"��ȣ��","���缮","����","����ȣ", "������","������","�ڹ���"};
		
		String n1 = "ȫ�浿";
		String n2 = "ȫ�浿";
		String n3 = new String("ȫ�浿");
		String n4 = new String("ȫ�浿");
		
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
		
		
			//�� �ε��� ��ġ�� ���� �ٲ��
			//{1,2,3,4,5,6,7,8,9,10}
			String temp;
			temp = names[idx1];
			names[idx1] = names[idx2];
			names[idx2] = temp;
		}
		
		
		//����
		
		for(int j=0; j<7; j++) // 0~5
			for(int i =0; i<7-1-j; i++)//-j�� ���ִ� ����.. ��ǻ�ͼ��ɶ���! j�� ���ָ� ���ϸ� ������ ������ ���鸸 �񱳸��ϰ� ��->���ϴ� �ڸ��� ã�����ϱ� ���̻� �񱳸� ���ص� �Ǵϱ�!!
					if(names[i].compareTo(names[i+1]) > 0 ) {
					String temp;
					temp = names[i];
					names[i] = names[i+1];
					names[i+1] = temp;
					
				}//��������: �տ��Ŷ� �ڿ��Ŷ� ���ؼ� ū�Ÿ� �ڷ� ������..
				//����϶� �տ��ִ°� �� ũ��.(�����϶� �տ� �ִ� ���� �۴�.)
				//�����ϸ� 0�� ��ȯ
				
				
		for(int i =0;i<7;i++) {
			System.out.printf("\"%s\"", names[i]);
			
			//�����׸�
			if(i<7-1)
				System.out.print(",");
		}
		System.out.println();
	}
		
		
}
         