package by.jb29.mod1.les02;

//����� ������� ������, ���������� ������ �������� ����� r, � ������� � R (R> r)


public class Task23 {

	public static void main(String[] args) {
		
		double rMal, rBol, squareKolca;
		
		rMal = 2; //������ ������� ����������
		rBol = 5; //������ ������� ����������
		
		if(rBol > rMal) {
			
			squareKolca = Math.PI * (Math.pow(rBol, 2) - Math.pow(rMal, 2));
			System.out.println("������� ������ �����: " + (double)Math.round(squareKolca * 100) / 100);
			
		} else {
			
			System.out.println("������ ������� ���������� ������ ���� ������ ������� ������� ����������!");
			
		}
		
		
		

	}

}
