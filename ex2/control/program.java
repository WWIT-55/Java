package ex2.control;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
public class program {
	
		public static void main(String[] args) throws IOException {
			
			//�⺻���� : primitive type
			int kor, eng, math;
			int total; 
			float avg;
			
			Scanner scan = new Scanner(System.in);
			kor = 0;
			eng = 0;
			math = 0;
			//------�����Էºκ�----------
		  
			
			//1.���� �Է� ��Ʈ�� ��ü�� fis��� �̸����� ������ ��
			FileInputStream fis = new FileInputStream("D:\\2021.02\\workspase\\Javaprj\\deta.txt");
			//2.fis�� Scanner�� �����ؼ� ����غ�~
			Scanner scan1 = new Scanner(fis);
			kor = scan1.nextInt();
			eng = scan1.nextInt();
			math = scan1.nextInt();
			scan1.close();
			fis.close();
			
			FileOutputStream fos = new FileOutputStream("D:\\2021.02\\workspase\\Javaprj\\deta.txt");
			PrintStream fout = new PrintStream(fos);//���ڿ��� �ѹ��� ����ϱ����ؼ� ����Ʈ ��Ʈ���� ��
			kor = kor + 1;
			eng = eng + 1;
			
			fout.printf("%d %d %d", kor, eng, math);
			fout.close();
			fos.close();
			
			
			

			
		
			
			//--------------������ºκ�----------
			
			total = kor + eng + math;
			avg = total / 3.0f;
					
			System.out.println("����������������������������������������������������������"); 
			System.out.println("��           �������           ��");
			System.out.println("����������������������������������������������������������");
			
		
			System.out.printf("���� : %d\n", kor);
			System.out.printf("���� : %d\n", eng);
			System.out.printf("���� : %d\n", math);
			
			System.out.printf("���� : %2d\n", total);
			System.out.printf("��� : %26.2f\n", avg);
	}

}
