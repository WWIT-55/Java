//0308 수업 2교시[break,break 라벨, switch, case]

package ex2.control;

import java.io.IOException;
import java.util.Scanner;

class ProgramSwich2 {
	public static void main(String[] args) {

		// 기본형식 : primitive type
		int kor, eng, math;
		int total;
		float avg;

		kor = 0;
		eng = 0;
		math = 0;

		boolean more = true;
		Scanner scan = new Scanner(System.in);

		EXIT:
		while (true) 
		{

			int menu;
			System.out.println("┌────────────────────┐");
			System.out.println("│      　메인메뉴       │");
			System.out.println("└────────────────────┘");

			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.종료");
			System.out.print(">");
			menu = Integer.parseInt(scan.nextLine());

			// 만약에 메뉴의 값이 1이라면
			switch (menu) 
			{
			case 1:
				System.out.println("┌───────────────────────────┐");
				System.out.println("│           성적입력           │");
				System.out.println("└───────────────────────────┘");

				System.out.printf("국어 : ");
				kor = Integer.parseInt(scan.nextLine());
				
				
				//1.kor의 값이 유효범위내에 있지않다면							
				//		"입력범위 : 0~100 값만 입력할 수 있습니다"를 출력
				//2.다시 국어 성적을 입력받는다.
				do {
					System.out.println("입력범위 : 0~100 값만 입력할 수 있습니다");
					
					System.out.printf("국어 : ");
					kor = Integer.parseInt(scan.nextLine());
				
				}
				while(!(0<=kor && kor <=100));
					
				System.out.printf("영어 : ");
				eng = Integer.parseInt(scan.nextLine());
				System.out.printf("수학 : ");
				math = Integer.parseInt(scan.nextLine());
				break;

			// 만약에 메뉴의 값이 2라면
			case 2:
				total = kor + eng + math;
				avg = total / 3.0f;

				System.out.println("┌───────────────────────────┐");
				System.out.println("│           성적출력           │");
				System.out.println("└───────────────────────────┘");
				
				
				for(int i = 0; i<3; i++)
				{
					System.out.printf("국어 : %d\n", kor);
					System.out.printf("영어 : %d\n", eng);
					System.out.printf("수학 : %d\n", math);
	
					System.out.printf("총점 : %2d\n", total);
					System.out.printf("평균 : %26.2f\n", avg);
					System.out.println("-----------------------------");
				
				}
				//위에 있는 for문과 결과는 동일하게 나온다
				/*int i =0;
				while(i<3)
				{
					System.out.printf("국어 : %d\n", kor);
					System.out.printf("영어 : %d\n", eng);
					System.out.printf("수학 : %d\n", math);
	
					System.out.printf("총점 : %2d\n", total);
					System.out.printf("평균 : %26.2f\n", avg);
					System.out.println("-----------------------------");
					
					i++
				
				}
				
				*/
				break;

			case 3:
				// more = false;
				break EXIT;

			}

		}
		System.out.println("bye");
	}
}