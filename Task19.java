package by.jb29.mod1.les02;

/*
 * ���� ������� ��������������� ������������. ����� ������� ����� ������������, ���
������, ������� ��������� � ��������� �����������.
 */


public class Task19 {

	public static void main(String[] args) {
		
		double storona = 4;
		
		double s = (Math.pow(storona, 2) * Math.sqrt(3)) / 4;  //������� ������������
		
		double h = (storona * Math.sqrt(3)) / 2;  //������ ������������
		
		double rVpis = storona / (2 * Math.sqrt(3));  //������ ��������� ����������
		
		double rOpis = storona / Math.sqrt(3); //������ ��������� ����������
		
		System.out.println("������� ��������������� ������������: " + (double)Math.round(s * 100) / 100);
		System.out.println("������ ������������: " + (double)Math.round(h * 100) / 100);
		System.out.println("������ ��������� ����������: " + (double)Math.round(rVpis * 100) / 100);
		System.out.println("������ ��������� ����������: " + (double)Math.round(rOpis * 100) / 100);
		
		

	}

}
