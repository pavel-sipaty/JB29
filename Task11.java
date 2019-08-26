package by.jb29.mod1.les02;

/*
 * Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух
катетов.
 */


public class Task11 {

	public static void main(String[] args) {
		
		//длина первого катета		
		double a = 3.2;
		
		//длина второго катета
		double b = 7.4;
		
		//длина гипотенузы
		
		double gip = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		//периметр прямоугольного треугольника
		double per = a + b + gip;
		
		//площадь прямоугольного треугольника
		double square = (a * b) / 2;
		
		System.out.println("Длина первого катета: " + a);
		System.out.println("Длина второго катета: " + b);
		System.out.println("Длина гипотенузы: " + (double)Math.round(gip * 100) / 100);
		System.out.println("Периметр треугольника: " + (double)Math.round(per * 100) / 100);
		System.out.println("Площадь треугольника: " + (double)Math.round(square * 100) / 100);

	}

}
