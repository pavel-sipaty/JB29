package by.jb29.mod1.les02;

/*
 * ����� ������� ������������ ������ � �������� ���� ��������������� �����.
 */

public class Task36 {
	
	public static void main(String[] args) {
		
int chislo = 2546;
		
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
		
		
		double chet, neChet; //���������� ������������ ������ � �������� ����
		
		chet = 1;
		neChet = 1;
		
		if(d % 2 == 0) {
			
			chet = chet * d;
			
		} else {
			
			neChet = neChet * d;
			
		}
		
		
		if(c % 2 == 0) {
			
			chet = chet * c;
			
		} else {
			
			neChet = neChet * c;
			
		}
		
		
		if(b % 2 == 0) {
			
			chet = chet * b;
			
		} else {
			
			neChet = neChet * b;
			
		}
		
		
		
		if(a % 2 == 0) {
			
			chet = chet * a;
			
		} else {
			
			neChet = neChet * a;
			
		}
		
		
		//������ ������������ ������ � �������� ����
		
		double chastnoe = (double)Math.round((chet / neChet) * 100) / 100;
		
		System.out.println("�������� �����: " + chislo);
		System.out.println("������������ ������ ����:" + chet);
		System.out.println("������������ �������� ����: " + neChet);
		System.out.println("������� ������������ ������ � �������� ����: " + chastnoe);
		
		
		
	}

}
