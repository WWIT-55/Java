package ex2.control;

import java.util.Scanner;

public class ifprogram {

	public static void main(String[] args) {
		//1.����ڷκ��� ���� ���� �Է� �޾Ƽ� ���� x�� �����Ѵ�.
		Scanner scan = new Scanner(System.in);		
		System.out.print("x: ");
		int x = scan.nextInt();
		
		
		
		
		//2.���࿡ �� ���� 3���� ũ�� "ū��"�̶�� ���ڿ��� ����Ѵ�.
		//2-1.
		
		/*2.if(x > 3)
			  System.out.println("ū ��");
			*/
		if(x%2 == 0) {
			 System.out.println("¦�� ��");
		
	    }
		else 
		{
		
			System.out.print("Ȧ��");
			System.out.println( " �� ");
		
		}
		
		
		System.out.println("���α׷� ��!");
		

	}

}
