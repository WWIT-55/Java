package ex1.bit;
import java.io.FileInputStream;
import java.io.IOException;


public class program {

	public static void main(String[] args)  throws IOException {
		//1. �̹��� ������ �б� ���� ���� �Է� ��Ʈ���� fis�� �������ֽÿ�.
		FileInputStream fis = new FileInputStream("res/img.bmp");
		
		//���ڰ� �ִ� ���Ͽ��� ���ڸ� �б�
		
		//�տ� 2���� ������
		int b;
		b = fis.read();
		b = fis.read();
		
		//fileSize(4����Ʈ, 32����Ʈ)
		int b1 = fis.read();
		int b2 = fis.read();
		int b3 = fis.read();
		int b4 = fis.read();
		
		//
		int fileSize = 0; //[][][][]; ->��ĭ�� 8��Ʈ
		fileSize = b1;	  //[][][][b1];
		fileSize = b2;    //[][][][b2];
		fileSize = b3;	  //[][][][b3];
		fileSize = b4;	  //[][][][b4];*/
		
		/*fileSize = (b1<<8); 	  //[][][b1][]; ->��ĭ�� 8��Ʈ
		fileSize = fileSize|b2;   //[][][b1][b2];
		fileSize = (fileSize<<8); //[][b1][b2][];
		fileSize = fileSize|b3;
		fileSize = (fileSize<<8);
		fileSize = fileSize|b4;*/
		
		//[b4][b3][b2][b1];
		//û��
		fileSize = (b4&0x000000ff) << 8*3 |
				   (b3&0x000000ff) << 8*2 |
				   (b2&0x000000ff) << 8*1 |
				   (b1&0x000000ff);
		
		
		
		//����� �Ϸ��� �״�� ����ϱ�����
		System.out.println(Integer.toBinaryString(b4));
		System.out.println(Integer.toBinaryString(b3));
		System.out.println(Integer.toBinaryString(b2));
		System.out.println(Integer.toBinaryString(b1));

		
		System.out.printf("file size: %d\n", fileSize );
				


		fis.close();		
	}

}
