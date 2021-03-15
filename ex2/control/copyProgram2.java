//0308 수업.

package ex2.control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyProgram2 {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("res/img.bmp");
		FileOutputStream fos = new FileOutputStream("res/img_copy.bmp");
		
		
		
		//int b = 0;
//		while((b = fis.read()) !=-1)
//			fos.write(b);
		int b;
		do {
			b = fis.read();
			 if(! (b == -1))
				fos.write(b);
		}
		while(! (b == -1));
			
		fis.close();
		fos.close();
		
		
		System.out.println("복사완료");
	}

}
