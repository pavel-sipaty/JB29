package by.jb29.mod1.les02;

/*
 * ����� �����-���� ���� ���� ��������� ������������ ������������ ����� N �����
������� �����.
 */


public class Task377 {

	public static void main(String[] args) {
		
		int chislo = 101;
		
		//�������� ������� �� ������� �� 10. ��� ���� ������ �����.
		
		int a = chislo % 10;
		
		
		//��� ���� ������ �����.
		
		int dvaZnak = chislo / 10; //�������� ������������� ����������� �����
		int b = dvaZnak % 10;
		
				
		//��� ���� ������ �����.
		
		int c = chislo / 100;
		
		boolean srav1 = (a + b == c);
		boolean srav2 = (b + c == a);
		boolean srav3 = (c + a == b);
		
		if(srav1) {
			System.out.println(srav1);
		}else if(srav2) {
			System.out.println(srav2);
		}else if(srav3) {
			System.out.println(srav3);
		}else {
			System.out.println(srav1);
		}

	}

}
