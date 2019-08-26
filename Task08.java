package by.jb29.mod1.les02;

/*
 * Вычислить значение выражения по формуле (все переменные принимают
действительные значения):
 */

public class Task08 {

	public static void main(String[] args) {
		
		double a = 1;
		double b = 2;
		double c = 3;
		double z;
		
		z = (b + (Math.sqrt(Math.pow(b, 2.0) + 4 * a * c))) / (2 * a) - Math.pow(a, 3.0) * c + Math.pow(b, -2.0);
		
		System.out.println(z);
		

	}

}
