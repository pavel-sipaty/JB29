package by.jb29.mod1.les02;

//���� ��� �����. ����� ������� �������������� ����� ���� ����� � ������� �������������� ������� ���� �����.

public class Task17 {
	
	public static void main(String[] args) {
		
		double a = 3;
		double b = 2;
		
		//������� ��������������
		
		double sredArif = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		
		//������� ��������������
		
		double sredGeom = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("������� �������������� �����: " + (double)Math.round(sredArif * 100) / 100);
		System.out.println("������� �������������� �������: " + (double)Math.round(sredGeom * 100) / 100);
		
		
	}

}
