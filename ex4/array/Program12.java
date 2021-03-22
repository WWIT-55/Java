//0317 내 코드

package ex4.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) throws IOException {
		int count = 0;// 1~79줄까지, 행의 갯수를 읽기위해 사용
		String[][] rows;
		// 레코드 개수를 알아내는 코드
		{

			FileInputStream fis = new FileInputStream("res/jeju.txt");
			Scanner fscan = new Scanner(fis);

			// while 반복을 하면서 count++ 연산을한다. 마지막 줄을 만날때까지.
			while (fscan.hasNextLine()) {
				fscan.nextLine();
				count++;
			}

			fscan.close();
			fis.close();
			count--;// 첫번째 행빼준것
			System.out.printf("%d", count);

		}

		// 레코드를 로드하는코드
		{

			// 2차원 배열을 만들기시작
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
			// 출력하는 코드
			for (int j = 0; j < count; j++) {
				for (int i = 0; i < 10; i++) {
					System.out.printf("%s", rows[j][i]);

					if (i < 9)
						System.out.printf(",");
				}
				System.out.println();

			}

			// 제주 확진자 수가 59명인 배열은 몇개인가?
			//배열 만들기
			
			int mall = 0;
			int current =0;
			//1~77전체 줄불러오기
			for(int i=0; i<count; i++) {
				
				current = Integer.parseInt(rows[1][i]);
				//만약에 mall값이 59면 그 값들을 저장하고 그값을 저장한다.
				if(mall == 59);
					count++;
				//저장된 값을 출력
			}
		}
	}
}
