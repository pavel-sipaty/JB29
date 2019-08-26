package by.jb29.mod1.les02;

/*
 * Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и
частное.
 */

public class Task01 {
	public static void main(String[] args) {
		int x;
		int y;
		
		x = 149;
		y = 345;
		
		int a = x + y;
		int b = x - y;
		int c = x * y;
		double d = (double)x / y;
		
		System.out.println("Сумма a и b равна " + a);
		System.out.println("Разность a и b равна " + b);
		System.out.println("Произведение a и b равно " + c);
		System.out.println("Частное от деления a на b равно " + d);
	}

}
