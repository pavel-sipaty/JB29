package by.jb29.mod1.les02;

//��������� ��������� �������� ��������� ���� ���� � �������, ������ � �������.

public class Task28 {

	public static void main(String[] args) {
		
		int rad = 3;
		
		double grad = Math.toDegrees(rad);
		
		int a = (int)grad; //����� ���-�� ��������
		
		double min = (grad - (double)a) * 60;
		
		int b = (int)min; //����� ���-�� �����
		
		double sec = Math.round((min - b) * 60);
		
		int c = (int)sec; //����� ���-�� ������
		
		System.out.println(rad + "��� = " + a + " �������� " + b + " ����� " + c + " ������.");
		

	}

}
