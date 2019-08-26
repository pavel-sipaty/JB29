package by.jb29.mod1.les02;

//Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

public class Task17 {
	
	public static void main(String[] args) {
		
		double a = 3;
		double b = 2;
		
		//среднее арифметическое
		
		double sredArif = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		
		//среднее геометрическое
		
		double sredGeom = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("Среднее арифметическое кубов: " + (double)Math.round(sredArif * 100) / 100);
		System.out.println("Среднее геометрическое модулей: " + (double)Math.round(sredGeom * 100) / 100);
		
		
	}

}
