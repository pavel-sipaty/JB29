package by.jb29.mod1.les02;

//����� ������������ ���� ��������� ��������������� �����.

public class Task16 {

	public static void main(String[] args) {
		
		int chislo = 4321;
		
		//�������� ������� �� ������� �� 10 ��� ���� ��������� �����.
		
		int a = chislo % 10;
		
		
		//��� ���� ������ �����.
		
		int triZnak = chislo / 10; //�������� ������������� ����������� �����
		int b = triZnak % 10;
		
				
		//��� ���� ������ �����.
		
		int dvaZnak = triZnak / 10; //�������� ������������� ����������� �����
		int c = dvaZnak % 10;
		
		
		//�������� ����� ����� �� ������� �� 1000. ��� ���� ������ �����
		int d = chislo / 1000;
		
		
		//������������ ���� ��������������� �����
		
		int rez = a * b * c * d;
		
		
		System.out.println("������������ ���� ����� " + chislo + " ����� " + rez);

	}

}
