package ex1.bit;
import java.io.FileInputStream;
import java.io.IOException;


public class program {

	public static void main(String[] args)  throws IOException {
		//1. 이미지 파일을 읽기 위한 파일 입력 스트림을 fis로 생성해주시오.
		FileInputStream fis = new FileInputStream("res/img.bmp");
		
		//숫자가 있는 파일에서 숫자를 읽기
		
		//앞에 2개를 버려줌
		int b;
		b = fis.read();
		b = fis.read();
		
		//fileSize(4바이트, 32바이트)
		int b1 = fis.read();
		int b2 = fis.read();
		int b3 = fis.read();
		int b4 = fis.read();
		
		//
		int fileSize = 0; //[][][][]; ->한칸당 8비트
		fileSize = b1;	  //[][][][b1];
		fileSize = b2;    //[][][][b2];
		fileSize = b3;	  //[][][][b3];
		fileSize = b4;	  //[][][][b4];*/
		
		/*fileSize = (b1<<8); 	  //[][][b1][]; ->한칸당 8비트
		fileSize = fileSize|b2;   //[][][b1][b2];
		fileSize = (fileSize<<8); //[][b1][b2][];
		fileSize = fileSize|b3;
		fileSize = (fileSize<<8);
		fileSize = fileSize|b4;*/
		
		//[b4][b3][b2][b1];
		//청소
		fileSize = (b4&0x000000ff) << 8*3 |
				   (b3&0x000000ff) << 8*2 |
				   (b2&0x000000ff) << 8*1 |
				   (b1&0x000000ff);
		
		
		
		//출력을 하려면 그대로 출력하기위해
		System.out.println(Integer.toBinaryString(b4));
		System.out.println(Integer.toBinaryString(b3));
		System.out.println(Integer.toBinaryString(b2));
		System.out.println(Integer.toBinaryString(b1));

		
		System.out.printf("file size: %d\n", fileSize );
				


		fis.close();		
	}

}
