//0309

package ex3.control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyProgram {

	public static void main(String[] args) throws IOException {
		//1.res/img.bmp 파일을 읽기 위한 FileInputStream 객체 fis를 생성하고
		//	res/img_copy.bmp. 파일로 쓰기 위한 FileOutputSteam 객체 fos를 생성한다.
		
		FileInputStream fis = new FileInputStream("res/img.bmp");
		FileOutputStream fos = new FileOutputStream("res/img_copy.bmp");
		
		
		//2.fis를 통해서 1 바이트를 읽어서 byte 변수 b에 담는다.
		// 	그 값이 -1(파일의 끝)이 아니라면
		//  b의 값을 fos를 통해서 출력한다.
		//	그것을 반복한다.
				
		int size = 0;
		
		byte[]buf = new byte[1000];
		
		while((size = fis.read(buf)) !=-1)
			fos.write(buf);

		fis.close();
		fos.close();
		//모든 스트림 객체를 닫는다.
		
		System.out.println("복사완료");
	}

}
