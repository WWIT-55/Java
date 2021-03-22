

package ex4.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program10 {

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
		//---------------------------------------
		// ���ڵ带 �ε��ϴ��ڵ�
		{

			// 2���� �迭�� ��������
			rows = new String[count][];

			FileInputStream fis = new FileInputStream("res/jeju.txt");
			Scanner fscan = new Scanner(fis);

			String line; //="";

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
			// --------------------------
			// �˻������� �������� ��� �ڵ�
			{
				int total = 0;

				for (int i = 0; i < count; i++)
					total += Integer.parseInt(rows[i][3]);

				System.out.println(total);
				System.out.println();

//			total += rows[0][3];
//			total += rows[1][3];
//			total += rows[2][3];
//			total += rows[3][3];
//			total += rows[4][3];
//					...
//			
//			total += rows[78][3];
			}

			// -0316 ȭ���� ����---------------------------------
			// �˻�������� ���� ������ ��¥��?
			{
				int small = 123456798; // �ּҰ������� Ǯ���� ���� ū ������ �ʱ�ȭ ���ش�. 0���� �������ָ� ���� 0�������ϱ�

				String date = "";
				int current = 0;

				for (int i = 0; i < count; i++)// ù�ٺ��� �������ٱ����ݺ�
				{
					current = Integer.parseInt(rows[i][3]);
					if (current < small) {
						// ���� �������� ī��Ʈ������ �������
						// �������� ī��Ʈ ���� �����Ѵ�
						small = current;

					}

				}

				// small�� ���° �ٿ� �ִ��� ã��?
				int idxs = 0;
				{
					for (int i = 0; i < count; i++) {
						// small�� Int~~~rows[][]�� ���ٸ�
						if (small == Integer.parseInt(rows[i][3])) {

							// idxs�� i�� ������ ��
							idxs = i;
							break;
						}
					}
					// ----�������������
					System.out.print(small);
					System.out.println();
					// ---���� �������� ��¥ ����غ���(=[0]��� )
					System.out.printf("%s", rows[idxs][0]);
					System.out.println();
				}
			}

			// �Ϻ� ���� ���� �˻�������� ���Դϱ�?
			// �˻�������� ���� ���Ҵ� ��¥��?
			{
				int max = 0;
				int current;

				String date = ""; // �ʱ�ȭ

				int idx = 0;

				for (int i = 0; i < count; i++) {
					current = Integer.parseInt(rows[i][3]);
					if (current > max) {
						max = current;
//						idx = i;
					}
					// ù�ٺ��� ���ٱ��� �ݺ�
					// Ŀ��Ʈ�� i�� 3��°[]���� ����
					// ���� Ŀ��Ʈ�� �ƽ����� Ŭ���
					// �ƽ��� Ŀ��Ʈ�� �����Ѵ�

					// max�� ���°�ٿ� �ִ��� ã��

				}

				for (int i = 0; i < count; i++)
					if (max == Integer.parseInt(rows[i][3])) {
						idx = i;
						break;
						// ���࿡ max�� Integer.parseInt(rows[j][3])������ idx�� j�� �����Ѵ� =>�� �������ִ°���?
						// idx�� max��
						// if���� false�̸� ���� for���� �������´�.

					}

				System.out.println(max);
				System.out.println();

				System.out.printf("%s", rows[idx][0]);
				System.out.println();

			}
			// Ȯ���� ���� �þ ��¥�� ���� ����Ͻÿ�.
			

			{
				String date = "";
				int diff = 0;

				int old = 0;// ��ȭ�� =���� Ȯ���� ��
				int index = 0;// Ȯ���ڰ� �þ ���� ������ ���ϱ����� ��
				for (int i = 0; i < count; i++) {

					int current = Integer.parseInt(rows[i][1]);// �� �ʱ�ȭ�� 0���� ���ϰ� integer~~���ϴ���?
					// old�� current�� ����������
					if (old != current) {
						// Ŀ��Ʈ���� �õ带 �� ���� diff�� ����
						diff = current - old;/*	 ���⵵ ���ؾȉ�.Ŀ��Ʈ�� �����ǹ̤� �õ�� ���� Ȯ���ڼ����ǹ� 
												�׷��� ���ٿ��� ���� Ȯ���ڼ��� ���ִ��ǹ��ΰǰ�?
												 */
						// date�� rows[][]�� ����
						date = rows[i][0];
						// old�� current���� �������ش�.
						old = current;//���⼭ current���� ����?
						System.out.printf("%d : %s,%d\n", index++ +1, date, diff);//index+++1����������?

						

					}
				}
				System.out.print(index);
			}
			// ------0317 ����--------------
			// Ȯ���� ���� �þ ��¥�� ���� ������ �迭�� ����ֽÿ�.
			String[][] results;
			int reusltCount = 0;

			{

				// Ȯ���� ���� �޶��������� reusltCount ���� ��Ŵ���ν� �����Ǵ� ���ڿ� ���� ���Ͻÿ�
				int old = 0;

				for (int i = 0; i < count; i++) {
					// i��° Ȯ������ �� //�� Ŀ��Ʈ�� 0���� �ʱ�ȭ�� �����ִ°�?
					int current = Integer.parseInt(rows[i][1]);
					// i��° Ȯ����(current)�� ���� Ȯ���ڼ� (old)�� �ٸ��ٸ�
					if (old != current) {

						// Ȯ���� ���� �޶����� ������ ���� ����
						reusltCount++;
						old = current;
					}
				}

				// =>Ȯ���� ���� ��¥�� ���߰�
				// =>reuslt ��� �迭�� ��ƾ��Ѵ�.

				results = new String[reusltCount][];// ������������� �迭�� ������ٷ���

				String date = "";
				int diff = 0;

				old = 0;// ��ȭ�� =���� Ȯ���� ��

				int index = 0;
				for (int i = 0; i < count; i++) {
					int current = Integer.parseInt(rows[i][1]);

					if (old != current) {

						diff = current - old;
						date = rows[i][0];

						String[] row = new String[2];
						row[0] = date; // date
						row[1] = String.valueOf(2);// diff

						results[index++] = row;
						old = current;

					}

				}
				System.out.println("�۾��Ϸ�");
			}

		}

	}
}
