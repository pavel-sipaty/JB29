package by.jb29.mod1.les02;

//�������� ����� ����������. ����� ������� �����, ������������� ���� �����������.


public class Task20 {

	public static void main(String[] args) {
		
		double dlinaOkr = 28.4;
		
		double squareOkr = Math.pow(dlinaOkr, 2) / (4 * Math.PI);
		
		System.out.println("������� �����: " + (double)Math.round(squareOkr * 100) / 100);

	}

}
