package by.jb29.mod1.les02;

/*
 * Вычислить значение выражения по формуле (все переменные принимают
действительные значения):
 */


public class Task10 {

	public static void main(String[] args) {
		
		double x = 45;
		double y = 60;
		
		double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		
		System.out.print("Значение выражения равно " + z);

	}

}
