package by.jb29.mod1.les02;

//��������� ���������� ����� ����� ������� � ������� ������������ (�1, �1)� (x2, �2)

public class Task12 {

	public static void main(String[] args) {
		
		// ���������� ������ �����
		
		int x1 = 7;
		int y1 = 4;
		
		//���������� ������ �����
		
		int x2 = 9;
		int y2 = -2;
		
		//����� ���������� ����� ����� �������
		
		double rast = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));
		
		System.out.print("���������� ����� ����� ������� ����� " + (double)Math.round(rast * 100) / 100);

	}

}
