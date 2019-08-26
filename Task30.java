package by.jb29.mod1.les02;

//Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.


public class Task30 {

	public static void main(String[] args) {
		
		double r1, r2, r3;
		
		r1 = 30;
		r2 = 40;
		r3 = 50;
		
		double rrr = 1 / ((1 / r1) + (1 / r2) + (1 / r3));
		
		System.out.printf("Сопротивление соединения: %.2f Ом", rrr);
		
		
	}

}
