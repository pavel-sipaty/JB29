package by.jb29.mod1.les02;

//���� ����� ����� ����. ����� ������� �����, ������� ������ ����������� � ����� ����� ����.


public class Task18 {

	public static void main(String[] args) {
		
		double dlinGran = 10.4;
		
		double squareGran = (double)Math.round(Math.pow(dlinGran, 2) * 100) / 100;
		
		double squarePolPov = squareGran * 6;
		
		double volKub = Math.pow(dlinGran, 3);
		
		System.out.println("������� ����� ����: " + squareGran);
		System.out.println("������� ������ ����������� ����: " + squarePolPov);
		System.out.println("����� ����: " + volKub);
		

	}

}
