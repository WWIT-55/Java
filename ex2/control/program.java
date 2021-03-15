package ex2.control;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
public class program {
	
		public static void main(String[] args) throws IOException {
			
			//기본형식 : primitive type
			int kor, eng, math;
			int total; 
			float avg;
			
			Scanner scan = new Scanner(System.in);
			kor = 0;
			eng = 0;
			math = 0;
			//------성적입력부분----------
		  
			
			//1.파일 입력 스트림 객체를 fis라는 이름으로 만들어야 해
			FileInputStream fis = new FileInputStream("D:\\2021.02\\workspase\\Javaprj\\deta.txt");
			//2.fis를 Scanner로 포장해서 사용해봐~
			Scanner scan1 = new Scanner(fis);
			kor = scan1.nextInt();
			eng = scan1.nextInt();
			math = scan1.nextInt();
			scan1.close();
			fis.close();
			
			FileOutputStream fos = new FileOutputStream("D:\\2021.02\\workspase\\Javaprj\\deta.txt");
			PrintStream fout = new PrintStream(fos);//문자열로 한번에 출력하기위해서 프린트 스트림을 씀
			kor = kor + 1;
			eng = eng + 1;
			
			fout.printf("%d %d %d", kor, eng, math);
			fout.close();
			fos.close();
			
			
			

			
		
			
			//--------------성적출력부분----------
			
			total = kor + eng + math;
			avg = total / 3.0f;
					
			System.out.println("┌───────────────────────────┐"); 
			System.out.println("│           성적출력           │");
			System.out.println("└───────────────────────────┘");
			
		
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("수학 : %d\n", math);
			
			System.out.printf("총점 : %2d\n", total);
			System.out.printf("평균 : %26.2f\n", avg);
	}

}
