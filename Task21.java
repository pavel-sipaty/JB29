package by.jb29.mod1.les02;

/*
 * ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � �����
������). �������� ������� ������� � ����� ����� ����� � ������� ���������� ��������
�����.
 */


public class Task21 {

	public static void main(String[] args) {
		
		double r = 458.254;
		
		int a = (int)r; //�����
		
		int o = (int)Math.round((r - a) * 1000); //������� ����� � ���� ������
		
		double rez = (double)(o * 1000 + a) / 1000;
		
		
		
		System.out.println(rez);
			
		
		
		
	}

}
