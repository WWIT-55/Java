//-------3/18---------

package ex4.struct;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program10 {

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
		//---------------------------------------
		Covid19[] list; 
		// 레코드를 로드하는코드
		{

			// 2차원 배열을 만들기시작
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
			// 레코드를 출력하는 코드
			for (int j = 0; j < count; j++) {
				for (int i = 0; i < 10; i++) {
					System.out.printf("%s", rows[j][i]);

					if (i < 9)
						System.out.printf(",");
				}
				System.out.println();

			}
			// --------------------------
			// 검사진행자 누적수를 얻는 코드
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

			// -0316 화요일 문제---------------------------------
			// 검사진행수가 가장 적었던 날짜는?
			{
				int small = 123456798; // 최소값문제를 풀때는 제일 큰 값으로 초기화 해준다. 0으로 설정해주면 값은 0만있으니까

				String date = "";
				int current = 0;

				for (int i = 0; i < count; i++)// 첫줄부터 마지막줄까지반복
				{
					current = Integer.parseInt(rows[i][3]);
					if (current < small) {
						// 만약 스몰값이 카운트값보다 작을경우
						// 스몰값에 카운트 값을 대입한다
						small = current;

					}

				}

				// small가 몇번째 줄에 있는지 찾기?
				int idxs = 0;
				{
					for (int i = 0; i < count; i++) {
						// small과 Int~~~rows[][]가 같다면
						if (small == Integer.parseInt(rows[i][3])) {

							// idxs에 i를 대입해 줘
							idxs = i;
							break;
						}
					}
					// ----제일작은값출력
					System.out.print(small);
					System.out.println();
					// ---제일 작은값의 날짜 출력해보기(=[0]출력 )
					System.out.printf("%s", rows[idxs][0]);
					System.out.println();
				}
			}

			// 일별 가장 많은 검사진행수는 몇입니까?
			// 검사진행수가 가장 많았던 날짜는?
			{
				int max = 0;
				int current;

				String date = ""; // 초기화

				int idx = 0;

				for (int i = 0; i < count; i++) {
					current = Integer.parseInt(rows[i][3]);
					if (current > max) {
						max = current;
//						idx = i;
					}
					// 첫줄부터 막줄까지 반복
					// 커런트는 i행 3번째[]임을 대입
					// 만약 커런트가 맥스보다 클경우
					// 맥스는 커런트에 대입한다

					// max가 몇번째줄에 있는지 찾기

				}

				for (int i = 0; i < count; i++)
					if (max == Integer.parseInt(rows[i][3])) {
						idx = i;
						break;
						// 만약에 max가 Integer.parseInt(rows[j][3])같으면 idx는 j에 대입한다 =>왜 대입해주는거지?
						// idx가 max의
						// if문이 false이면 여기 for문을 빠져나온다.

					}

				System.out.println(max);
				System.out.println();

				System.out.printf("%s", rows[idx][0]);
				System.out.println();

			}
			// 확진자 수가 늘어난 날짜와 수를 출력하시오.
			

			{
				String date = "";
				int diff = 0;

				int old = 0;// 변화량 =현재 확진자 수
				int index = 0;// 확진자가 늘어난 날의 갯수를 구하기위해 씀
				for (int i = 0; i < count; i++) {

					int current = Integer.parseInt(rows[i][1]);// 왜 초기화를 0으로 안하고 integer~~로하는지?
					// old와 current가 같지않으면
					if (old != current) {
						// 커런트에서 올드를 뺀 값을 diff에 대입
						diff = current - old;/*	 여기도 이해안됌.커런트는 줄을의미ㅡ 올드는 현재 확진자수를의미 
												그러면 한줄에서 현재 확진자수를 빼주는의미인건가?
												 */
						// date에 rows[][]를 대입
						date = rows[i][0];
						// old에 current값을 대입해준다.
						old = current;//여기서 current값은 뭘까?
						System.out.printf("%d : %s,%d\n", index++ +1, date, diff);//index+++1을해준이유?

						

					}
				}
				System.out.print(index);
			}
			// ------0317 수업--------------
			// 확진자 수가 늘어난 날짜와 수를 다음에 배열에 담아주시오.
			String[][] results;
			int reusltCount = 0;

			{

				// 확진자 수가 달라질때마다 reusltCount 증가 시킴으로써 증가되는 일자와 수를 구하시오
				int old = 0;

				for (int i = 0; i < count; i++) {
					// i번째 확진자의 수 //왜 커런트는 0으로 초기화를 안해주는가?
					int current = Integer.parseInt(rows[i][1]);
					// i번째 확진자(current)와 이전 확진자수 (old)가 다르다면
					if (old != current) {

						// 확진자 수가 달라지는 일자의 수를 증가
						reusltCount++;
						old = current;
					}
				}

				// =>확진자 수와 날짜를 구했고
				// =>reuslt 라는 배열에 담아야한다.

				results = new String[reusltCount][];// 만들어준이유는 배열을 만들어줄려고

				String date = "";
				int diff = 0;

				old = 0;// 변화량 =현재 확진자 수

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
				System.out.println("작업완료");
			}

		}

	}
}
