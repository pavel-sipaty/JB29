package by.jb29.mod1.les02;

//������ ����� ������ � ���������� ��� ���������� �����, � ����� ������� ���������� � ����������� �������.


public class Task33 {

	public static void main(String[] args) {
		
		char symbol = '9';
		
		int c = symbol; //����������� ���� ������, ����� ������ ���������� �����
		
		int nextSymbol = c + 1; 	//������ ���������� ����� ������������ �������
		int beforeSymbol = c - 1; //������ ���������� ����� ����������� �������
		
		char next = (char)nextSymbol; 		//��������� ���������� ����� � ����������
		char before = (char)beforeSymbol;  //��������� ���������� ����� � ����������
		
		System.out.println("�������� ������: " + symbol);
		System.out.println("����������� ������: " + next);
		System.out.println("���������� ������: " + before);
		
		

	}

}
