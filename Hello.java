
import java.io.IOException;
import java.util.Scanner;

class Hello {
	public static void main(String[] args) throws IOException {
		
			
		
		//�⺻���� : primitive type
		int kor, eng, math;
		int total; 
		float avg;
		
		
		kor = 0;
		eng = 0;
		math = 0;
		
		
		boolean more = true; 
		while(more) {
		//------�����Էºκ�----------
		Scanner scan = new Scanner(System.in);
	  
		System.out.println("��������������������������������������������");
        System.out.println("��      ������ �Է�      ��");
        System.out.println("��������������������������������������������");
         
         
         
         System.out.printf("���� : "); 
         kor = Integer.parseInt(scan.nextLine());
         System.out.printf("���� : "); 
         eng = Integer.parseInt(scan.nextLine());
         System.out.printf("���� : "); 
         math = Integer.parseInt(scan.nextLine());

		
		
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
		
		
		//
		more = scan.nextBoolean();
		System.out.print("����ұ��?(true/falae) : ");
	
		}
		System.out.println("bye");
		
		/*
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������� �Է��ϼ���:");
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