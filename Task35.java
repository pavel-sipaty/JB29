package by.jb29.mod1.les02;

//���� ����������� ����� � � N. ������� ������� ����� ������� ����� � ������� ����� ����� ����� ����� M/N


public class Task35 {

	public static void main(String[] args) {
		
		double m, n;
		
		m = 165565849;
		
		n = 385653;
		
		double mn = (double)Math.round(m / n * 1000) / 1000;
		
		int tseloe = (int)mn;
		
		int mladTsel = tseloe % 10;
		
		int starshDrobnoe = (int)((mn - tseloe) * 10);
		
		
		System.out.println("����� M / N: " + mn);
		System.out.println("������� ����� �� ����� �����: " + mladTsel);
		System.out.println("������� ����� �� ������� �����: " + starshDrobnoe);
		

	}

}
