package ex2.control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyProgram {

	public static void main(String[] args) throws IOException {
		//1.res/img.bmp ������ �б� ���� FileInputStream ��ü fis�� �����ϰ�
		//	res/img_copy.bmp. ���Ϸ� ���� ���� FileOutputSteam ��ü fos�� �����Ѵ�.
		
		FileInputStream fis = new FileInputStream("res/img.bmp");
		FileOutputStream fos = new FileOutputStream("res/img_copy.bmp");
		
		
		//2.fis�� ���ؼ� 1 ����Ʈ�� �о byte ���� b�� ��´�.
		// 	�� ���� -1(������ ��)�� �ƴ϶��
		//  b�� ���� fos�� ���ؼ� ����Ѵ�.
		//	�װ��� �ݺ��Ѵ�.
				
		int b = 0;
		while((b = fis.read()) !=-1)
			fos.write(b);

		fis.close();
		fos.close();
		//��� ��Ʈ�� ��ü�� �ݴ´�.
		
		System.out.println("����Ϸ�");
	}

}
