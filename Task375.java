package by.jb29.mod1.les02;

/*
 * ��������� �������� ���������, ���������� �������� true, ���� ���������
������������ �������� ��������, � false � � ��������� ������:
������� ��������� ������������ ����� ����� ���� ����� ���� ����� �����.
 */


public class Task375 {

	public static void main(String[] args) {
		
		int chislo = 534;
		
		//�������� ������� �� ������� �� 10 ��� ���� ������ �����.
		
		int a = chislo % 10;
		
		
		//��� ���� ������ �����.
		
		int dvaZnak = chislo / 10; //�������� ������������� ����������� �����
		int b = dvaZnak % 10;
		
				
		//��� ���� ������ �����.
		
		int c = chislo / 100;
		
		//��� ����� ����
		
		double kubSum = (double)Math.pow(a + b + c, 3);
		
		//������� �����
		
		double kvadChislo = (double)Math.pow(chislo, 2);
		
		boolean sravn = (kvadChislo == kubSum);
		
		if(sravn) {
			System.out.println(sravn);
		}else {
			System.out.println(sravn);
		}

	}

}
