//0308 ���� 2����[break,break ��, switch, case]

package ex2.control;

import java.io.IOException;
import java.util.Scanner;

class ProgramSwich {
	public static void main(String[] args) {

		// �⺻���� : primitive type
		int kor, eng, math;
		int total;
		float avg;

		kor = 0;
		eng = 0;
		math = 0;

		boolean more = true;
		Scanner scan = new Scanner(System.in);

		EXIT: while (true) 
		{

			int menu;
			System.out.println("��������������������������������������������");
			System.out.println("��      �����θ޴�       ��");
			System.out.println("��������������������������������������������");

			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print(">");
			menu = Integer.parseInt(scan.nextLine());

			// ���࿡ �޴��� ���� 1�̶��
			switch (menu) 
			{
			case 1:
				System.out.println("����������������������������������������������������������");
				System.out.println("��           �����Է�           ��");
				System.out.println("����������������������������������������������������������");

				System.out.printf("���� : ");
				kor = Integer.parseInt(scan.nextLine());
				System.out.printf("���� : ");
				eng = Integer.parseInt(scan.nextLine());
				System.out.printf("���� : ");
				math = Integer.parseInt(scan.nextLine());
				break;

			// ���࿡ �޴��� ���� 2���
			case 2:
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
				break;

			case 3:
				// more = false;
				break EXIT;

			}

		}
		System.out.println("bye");
	}
}