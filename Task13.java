package by.jb29.mod1.les02;

/*
 * ������ ���������� ���� ������ ������������ (�1 �2),(�2, �2) ),(�3, �3). ����� ���
�������� � �������.
 */


public class Task13 {

	public static void main(String[] args) {
		// ���������� ������ ����� A
		
		int x1 = 3;
		int y1 = 4;
				
		//���������� ������ ����� B
			
		int x2 = 5;
		int y2 = -2;
		
		//���������� ������� ����� C
		
		int x3 = -6;
		int y3 = 2;
				
		//����� ���������� r1 ����� ����� ������� AB
				
		double r1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));
		
		
		//����� ���������� r2 ����� ����� ������� BC
		
		double r2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3-y2), 2));
		
		//����� ���������� r3 ����� ����� ������� CA
		
		double r3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1-y3), 2));
		
		//�������� ������������
		
		double per = r1 + r2 + r3;
		
		double polPer = per / 2; //������������
		
		//������� �����������
		
		double square = Math.sqrt(polPer * (polPer - r1) * (polPer - r2) * (polPer - r3));
		
		System.out.println("�������� ������������ �����: " + (double)Math.round(per * 100) / 100);
		System.out.println("������� ������������ �����: " + (double)Math.round(square * 100) / 100);
		

	}

}
