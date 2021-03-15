//0311 복습
package ex1.bit;



public class Main3 {

	public static void main(String[] args) {
		String[] names = new String[] {"A","F","G","B","C", "D","E",};
		
		for(int j=0; j<7; j++) // 7번 반복
			for(int i =0; i<7-1-j; i++)//-j를 써주는 이유.. 컴퓨터성능때문! j를 써주면 하하를 제외한 나머지 값들만 비교를하게 됨->하하는 자리를 찾았으니까 더이상 비교를 안해도 되니까!!
					if(names[i].compareTo(names[i+1]) < 0 ) {
					String temp;
					temp = names[i];
					names[i] = names[i+1];
					names[i+1] = temp;
					
				}//버블정렬: 앞에거랑 뒤에거랑 비교해서 큰값을 뒤로 보낸다..
				//양수일때 앞에있는게 더 크다.(음수일때 앞에 있는 값이 작다.)
				//동일하면 0을 반환
				
				
		for(int i =0;i<7;i++) {
			System.out.printf("\"%s\"", names[i]);
			
			//예외항목
			if(i<7-1)
				System.out.print(",");
		
	}

	}
}
		
