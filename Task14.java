package by.jb29.mod1.les02;

//��������� ����� ���������� � ������� ����� ������ � ���� �� ��������� ������� R.

import static java.lang.Math.PI;


public class Task14 {

	public static void main(String[] args) {
		
		//������ �����
		
		double r = 3.2;
		
		//����� ����������
		
		double dlinaOkr = PI * (r * 2);
		
		//������� �����
		
		double squareKruga = PI * Math.pow(r, 2);
		
		System.out.println("����� ����������: " + (double)Math.round(dlinaOkr * 100) / 100);
		System.out.println("������� �����: " + (double)Math.round(squareKruga * 100) / 100);
		
	}

}
