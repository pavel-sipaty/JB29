package by.jb29.mod1.les02;


/*
 * ��������� �������� ���������, ���������� �������� true, ���� ���������
������������ �������� ��������, � false � � ��������� ������:
����������� �� ��������� �,b,� �������� ��������������.
 */




public class Task376 {

	public static void main(String[] args) {

		int a, b, c;
		
		a = 3;
		b = 5;
		c = 4;
		
		if(a == b & a != c & b != c) {
			System.out.println("true");
		}else if(b == c & b != a & c != a) {
			System.out.println("true");
		}else if(c == a & c != b & a != b) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
