package ex5.fcn;

public class Program {

	int power(int x) {
		return (x + 3) * (x + 3);
	}

	static int add(int x, int y) {
		return x + y;
	}

	static void print(int x) {
		System.out.println(x);
	}
//----------------------------------------
	// printSum(x, length)
	// x :2, length:3 -> 2+3+4
	// x :5, length:2 -> 5+6
	// x :2, length:5 -> 2+3+4+5+6
	// 출력 결과는 x가 2이고 length가 5일때 다음 문자열처럼 나와야함
	// "2+3+4+5+6 = 20"
	static void printSum(int x, int length) {
		if(length <=0) {
			System.out.println("length에 잘못된 값을 입력했습니다.");
			return;
		}
		int sum = 0;
		
		for(int i=0; i<length; i++) 
			sum += x+i;
			
		for(int i=0; i<length; i++) {
			System.out.printf("%d\n", i+1);
			
			if(i<length-1)
				System.out.print("+");
		 
		}
		
		System.out.print("=");
		System.out.printf("%d\n", sum);
	}
	//------------------------------------------------------
	public static void main(String[] args) {
		//power(x) = (x+3)*(x+3);
		//add(x,y) = x+y;
		int z = add(3, 4);
				
		System.out.println(z);
		System.out.println(add(5,6));
		
		//print(x) = out: x;
		print(30);
	//------------------------------------------------
		printSum(2,5);
		
		

		 
	 }
		
}

