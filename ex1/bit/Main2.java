//0308 복습
package ex1.bit;



public class Main2 {

	public static void main(String[] args) {
		//1. 문자 10개를 저장하기 위한 문자배열 chs를 만드시오
		char[] chs = new char[10];
		
		//J부터 A까지 채우는 코드를 작성하시오.
		for (int i = 0; i < 10; i++)
			chs[i] = (char) ('J' - i);
		
		//A B C D E F G H I J 
		char temp;
		for (int i = 0; i < 10; i++) {
			temp = chs[i];
			chs[i] = chs[9 - i];
			chs[9 - i] = temp;
			
			temp = chs[0];
			chs[9] = chs[8];
			chs[8] = temp;

		}

		// 배열에 담겨진 값을 출력하는 코드를 작성하시오.
		for (int i = 0; i < 10; i++)
			System.out.printf("%c ", chs[i]);

	}

}
