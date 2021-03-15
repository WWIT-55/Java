
import java.io.IOException;
import java.util.Scanner;

class Hello {
	public static void main(String[] args) throws IOException {
		
			
		
		//기본형식 : primitive type
		int kor, eng, math;
		int total; 
		float avg;
		
		
		kor = 0;
		eng = 0;
		math = 0;
		
		
		boolean more = true; 
		while(more) {
		//------성적입력부분----------
		Scanner scan = new Scanner(System.in);
	  
		System.out.println("┌────────────────────┐");
        System.out.println("│      　성적 입력      │");
        System.out.println("└────────────────────┘");
         
         
         
         System.out.printf("국어 : "); 
         kor = Integer.parseInt(scan.nextLine());
         System.out.printf("영어 : "); 
         eng = Integer.parseInt(scan.nextLine());
         System.out.printf("수학 : "); 
         math = Integer.parseInt(scan.nextLine());

		
		
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
		
		
		//
		more = scan.nextBoolean();
		System.out.print("계속할까요?(true/falae) : ");
	
		}
		System.out.println("bye");
		
		/*
		
		Scanner scan = new Scanner(System.in);
		System.out.print("국어성적을 입력하세요:");
		String line =scan.next(); 
		System.out.printf("line = %s\n", line);
		
		
/*		line = scan.next();
		System.out.printf("line = %s\n", line);
		
		kor = scan.nextInt();
		System.out.printf("kor = %d\n",kor);
		
		
		int code1 = System.in.read();
		
		System.out.printf("code is %d\n",code1-48);
		System.out.printf("code is %c\n",code1);
		
		int code2 = System.in.read();
		
		System.out.printf("code is %d\n",code2-48);
		System.out.printf("code is %c\n",code2);
		
*/
		
		
	}
}