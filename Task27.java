package by.jb29.mod1.les02;

/*
 * ���� �������� a. �� ��������� ������� ������� � ������� ��������, �����
���������, �������� �������� �8 �� ��� �������� � �10 �� ������ ��������.
 */


public class Task27 {

	public static void main(String[] args) {
		
		double a, a8, a10;
		
		a = 2;
		
		a8 = a * Math.pow(a, 2) * Math.pow(a, 5);
		a10 = Math.pow(a, 2) * Math.pow(a, 3) * Math.pow(a, 5);
		
		System.out.println("a8 = " + a8);
		System.out.println("a101 = " + a10);

	}

}
