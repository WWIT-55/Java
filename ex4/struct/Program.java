///----0319
package ex4.struct;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		int count = 0;
		// ---------------------------------------------------------
		// Covid19를 알아내는 코드
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
		}
		
		Covid19[] list = new Covid19[count];// count숫자만큼 covid19[]형 list생성
		// --------------------------------------------------------
		// Covid19를 로드하는 코드

		{
			FileInputStream fis = new FileInputStream("res/jeju.txt");
			Scanner fscan = new Scanner(fis);

			String line;

			fscan.nextLine();
			System.out.print(count);
			for (int i = 0; i < count; i++) {
				line = fscan.nextLine();
				String[] tokens = line.split(",");

				Covid19 covid = new Covid19();
				covid.date = tokens[0];
				covid.cases = Integer.parseInt(tokens[1]);
				covid.deaths = Integer.parseInt(tokens[2]);
				covid.test = Integer.parseInt(tokens[3]);
				covid.selfQuarantine = Integer.parseInt(tokens[4]);
				covid.release = Integer.parseInt(tokens[5]);
				covid.recover = Integer.parseInt(tokens[6]);
				covid.selfQuarantineDoestic = Integer.parseInt(tokens[7]);
				covid.selfQuarantineImported = Integer.parseInt(tokens[8]);
				covid.pubDate = tokens[9];

				list[i] = covid;

			}

			fscan.close();
			fis.close();
		}
		// -----------------------------
		// 레코드를 출력하는 코드
		{
			System.out.println("레코드를 출력하는 코드");
			// Covid 한줄을 출력하자

			for (int j = 0; j < count; j++) {
				
				 Covid19 covid = list[j];	
				 
				 System.out.printf("%s, %d, %d, %d, %d, %d, %d, %d, %d, %s\n",
					covid.date,				
					covid.cases,
					covid.deaths, 
					covid.test, 
					covid.selfQuarantine, 
					covid.release , 
					covid.recover, 
					covid.selfQuarantineDoestic,
					covid.selfQuarantineImported,
					covid.pubDate);
					 
					 
				 }
				 

			}
			System.out.println();
		}

//		      String[] row1 = new String[3];
//		      row1[0] = "2020-10-01";
//		      row1[2] = "30";
//		      row1[1] = "30";
//		      row1[3] = "23";
//		      
//		      Covid19 row2 = new Covid19();
//		      row2.date = "2020-10-01";
//		      row2.deaths = 30;
//		      row2.cases = 30;
//		      row2.tests = 23;
//		      
//		      Covid19[] list = new Covid19[10];
//		      //---------------------------------
//		      list[0] = new Covid19();
//		      list[0].date = "";
//		      list[0].deaths = 12;
//		      //---------------------------------
//		      list[1] = new Covid19();
//		      list[1].date = "";
//		      list[1].deaths = 12;
//		            
//		      Covid19 row;
//		      //---------------------------------
//		      row = new Covid19();
//		      row.date = "2020";
//		      row.deaths = 20;
//		      
//		      list[0] = row;
//		      //----------------------------------
//		      row = new Covid19();
//		      row.date = "2020";
//		      row.deaths = 20;
//		      
//		      list[1] = row;

	}


