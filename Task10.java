package by.jb29.mod1.les02;

/*
 * ��������� �������� ��������� �� ������� (��� ���������� ���������
�������������� ��������):
 */


public class Task10 {

	public static void main(String[] args) {
		
		double x = 45;
		double y = 60;
		
		double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		
		System.out.print("�������� ��������� ����� " + z);

	}

}
