package by.jb29.mod1.les02;

/*
 * ��������� �������� � ������� �������������� ������������ �� ������ � � b ����
�������.
 */


public class Task11 {

	public static void main(String[] args) {
		
		//����� ������� ������		
		double a = 3.2;
		
		//����� ������� ������
		double b = 7.4;
		
		//����� ����������
		
		double gip = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		//�������� �������������� ������������
		double per = a + b + gip;
		
		//������� �������������� ������������
		double square = (a * b) / 2;
		
		System.out.println("����� ������� ������: " + a);
		System.out.println("����� ������� ������: " + b);
		System.out.println("����� ����������: " + (double)Math.round(gip * 100) / 100);
		System.out.println("�������� ������������: " + (double)Math.round(per * 100) / 100);
		System.out.println("������� ������������: " + (double)Math.round(square * 100) / 100);

	}

}
