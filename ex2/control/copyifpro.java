import java.io.IOException;
import java.util.Scanner;
// 0308 ���� 1����
class Hello {
	public static void main(String[] args) throws IOException {

		// �⺻���� : primitive type
		int kor, eng, math;
		int total;
		float avg;

		kor = 0;
		eng = 0;
		math = 0;

		
		
		boolean more = true;
		
		
		Scanner scan = new Scanner(System.in);
		
		while (more) {
			// ------�����Էºκ�----------
		
			int menu;
			System.out.println("��������������������������������������������");
			System.out.println("��      �����θ޴�       ��");
			System.out.println("��������������������������������������������");
			
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print(">");
			menu = Integer.parseInt(scan.nextLine());
			
			//���࿡ �޴��� ���� 1�̶��
			if(menu == 1) 
			{
				System.out.println("����������������������������������������������������������");
				System.out.println("��           �����Է�           ��");
				System.out.println("����������������������������������������������������������");

				System.out.printf("���� : ");
				kor = Integer.parseInt(scan.nextLine());
				System.out.printf("���� : ");
				eng = Integer.parseInt(scan.nextLine());
				System.out.printf("���� : ");
				math = Integer.parseInt(scan.nextLine());
			}
			//���࿡ �޴��� ���� 2���
			else if(menu == 2)
			{
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

			//
			else if(menu == 3)
			{
				more = false;
			}

		}
		System.out.println("bye");

	}
}