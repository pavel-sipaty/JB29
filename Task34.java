package by.jb29.mod1.les02;

/*
 * ���� �������� �, ���������� ����� ���������� � ������. ��������� � � �����
������� ������� ��������� ����������.
 */

public class Task34 {

	public static void main(String[] args) {
		
		double a = 5124243434641d;
		
		double kiloA = a / 1000;
		
		double megaA = kiloA / 1000;
		
		double gigaA = megaA / 1000;
		
		System.out.printf("%.0f ���� �����:", a);
		System.out.println();
		System.out.println();
		System.out.printf("%.2f �����", kiloA);
		System.out.println();
		System.out.printf("%.2f �����", megaA);
		System.out.println();
		System.out.printf("%.2f �����", gigaA);
		
		

	}

}
