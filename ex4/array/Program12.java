//0317 �� �ڵ�

package ex4.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) throws IOException {
		int count = 0;// 1~79�ٱ���, ���� ������ �б����� ���
		String[][] rows;
		// ���ڵ� ������ �˾Ƴ��� �ڵ�
		{

			FileInputStream fis = new FileInputStream("res/jeju.txt");
			Scanner fscan = new Scanner(fis);

			// while �ݺ��� �ϸ鼭 count++ �������Ѵ�. ������ ���� ����������.
			while (fscan.hasNextLine()) {
				fscan.nextLine();
				count++;
			}

			fscan.close();
			fis.close();
			count--;// ù��° �໩�ذ�
			System.out.printf("%d", count);

		}

		// ���ڵ带 �ε��ϴ��ڵ�
		{

			// 2���� �迭�� ��������
			rows = new String[count][];

			FileInputStream fis = new FileInputStream("res/jeju.txt");
			Scanner fscan = new Scanner(fis);

			String line; // ="";

			fscan.nextLine();

			for (int i = 0; i < count; i++) {
				line = fscan.nextLine();
				// rows[2] = {2020-10-02,59,0,35,0,0,58,7,230,2020-12-14}
				rows[i] = line.split(",");
				// rows[2] = [2020-10-02][59]...[2020-12-14]

			}

			fscan.close();
			fis.close();

			// ----------------------------
			// ����ϴ� �ڵ�
			for (int j = 0; j < count; j++) {
				for (int i = 0; i < 10; i++) {
					System.out.printf("%s", rows[j][i]);

					if (i < 9)
						System.out.printf(",");
				}
				System.out.println();

			}

			// ���� Ȯ���� ���� 59���� �迭�� ��ΰ�?
			//�迭 �����
			
			int mall = 0;
			int current =0;
			//1~77��ü �ٺҷ�����
			for(int i=0; i<count; i++) {
				
				current = Integer.parseInt(rows[1][i]);
				//���࿡ mall���� 59�� �� ������ �����ϰ� �װ��� �����Ѵ�.
				if(mall == 59);
					count++;
				//����� ���� ���
			}
		}
	}
}
