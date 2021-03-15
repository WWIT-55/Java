import java.io.IOException;
import java.util.Scanner;
// 0308 수업 1교시
class Hello {
	public static void main(String[] args) throws IOException {

		// 기본형식 : primitive type
		int kor, eng, math;
		int total;
		float avg;

		kor = 0;
		eng = 0;
		math = 0;

		
		
		boolean more = true;
		
		
		Scanner scan = new Scanner(System.in);
		
		while (more) {
			// ------성적입력부분----------
		
			int menu;
			System.out.println("┌────────────────────┐");
			System.out.println("│      　메인메뉴       │");
			System.out.println("└────────────────────┘");
			
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.종료");
			System.out.print(">");
			menu = Integer.parseInt(scan.nextLine());
			
			//만약에 메뉴의 값이 1이라면
			if(menu == 1) 
			{
				System.out.println("┌───────────────────────────┐");
				System.out.println("│           성적입력           │");
				System.out.println("└───────────────────────────┘");

				System.out.printf("국어 : ");
				kor = Integer.parseInt(scan.nextLine());
				System.out.printf("영어 : ");
				eng = Integer.parseInt(scan.nextLine());
				System.out.printf("수학 : ");
				math = Integer.parseInt(scan.nextLine());
			}
			//만약에 메뉴의 값이 2라면
			else if(menu == 2)
			{
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

			//
			else if(menu == 3)
			{
				more = false;
			}

		}
		System.out.println("bye");

	}
}