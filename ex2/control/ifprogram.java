package ex2.control;

import java.util.Scanner;

public class ifprogram {

	public static void main(String[] args) {
		//1.사용자로부터 정수 값을 입력 받아서 변수 x에 저장한다.
		Scanner scan = new Scanner(System.in);		
		System.out.print("x: ");
		int x = scan.nextInt();
		
		
		
		
		//2.만약에 그 값이 3보다 크면 "큰값"이라는 문자열을 출력한다.
		//2-1.
		
		/*2.if(x > 3)
			  System.out.println("큰 값");
			*/
		if(x%2 == 0) {
			 System.out.println("짝수 값");
		
	    }
		else 
		{
		
			System.out.print("홀수");
			System.out.println( " 값 ");
		
		}
		
		
		System.out.println("프로그램 끝!");
		

	}

}
