package by.jb29.mod1.les02;

/*
 * ��������� �������� ���������, ���������� �������� true, ���� ���������
������������ �������� ��������, � false � � ��������� ������:
����� ���� ������� ������������ ����� N �������� ������ ������
 */



public class Task373 {

	public static void main(String[] args) {
		int chislo = 534;
		
		//�������� ������� �� ������� �� 10 ��� ���� ������ �����.
		
		int a = chislo % 10;
		
		
		//��� ���� ������ �����.
		
		int dvaZnak = chislo / 10; //�������� ������������� ����������� �����
		int b = dvaZnak % 10;
		
				
		//��� ���� ������ �����.
		
		int c = chislo / 100;
		
		//����� ����
		
		int sum = a + b + c;
		
		boolean chet = (sum % 2 == 0);
		
		if(chet) {
			System.out.println("����� ���� ����� " + chislo + " ����� " + sum + " � �������� ������ ������: " + chet);
		}else {
			System.out.println("����� ���� ����� " + chislo + " ����� " + sum + " � �������� ������ ������: " + chet);
		}
		

	}

}
