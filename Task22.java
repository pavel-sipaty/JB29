package by.jb29.mod1.les02;

/*
 * ���� ����������� ����� �, ������� ������������ ������������ ���������� ������� �
��������. ������� ������ �������� ������������ � �����, ������� � �������� � ���������
�����:
��� ����� SSc.
 */


public class Task22 {

	public static void main(String[] args) {
		
		int t = 3659;
		
		int hour = t / 3600; //���������� �����
		
		int ost1 = t - hour * 3600; //������������� ������� � ��������
		
		int minute = ost1 / 60; //���������� �����
		
		int ostSec = ost1 - minute*60; //���������� ���������� ������
		
		
		System.out.println(hour + "� " + minute + "��� " + ostSec + "c");
		 

	}

}
