//0311 ����
package ex1.bit;



public class Main3 {

	public static void main(String[] args) {
		String[] names = new String[] {"A","F","G","B","C", "D","E",};
		
		for(int j=0; j<7; j++) // 7�� �ݺ�
			for(int i =0; i<7-1-j; i++)//-j�� ���ִ� ����.. ��ǻ�ͼ��ɶ���! j�� ���ָ� ���ϸ� ������ ������ ���鸸 �񱳸��ϰ� ��->���ϴ� �ڸ��� ã�����ϱ� ���̻� �񱳸� ���ص� �Ǵϱ�!!
					if(names[i].compareTo(names[i+1]) < 0 ) {
					String temp;
					temp = names[i];
					names[i] = names[i+1];
					names[i+1] = temp;
					
				}//��������: �տ��Ŷ� �ڿ��Ŷ� ���ؼ� ū���� �ڷ� ������..
				//����϶� �տ��ִ°� �� ũ��.(�����϶� �տ� �ִ� ���� �۴�.)
				//�����ϸ� 0�� ��ȯ
				
				
		for(int i =0;i<7;i++) {
			System.out.printf("\"%s\"", names[i]);
			
			//�����׸�
			if(i<7-1)
				System.out.print(",");
		
	}

	}
}
		
