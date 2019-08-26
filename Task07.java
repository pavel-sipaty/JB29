package by.jb29.mod1.les02;

/*Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь
прямоугольника
*/

public class Task07 {

	public static void main(String[] args) {
		
		//ширина прямоугольника
		double a = 10.5;
		

		//длина прямоугольника;
		double b = 2 * a;
		
		//площадь прямоугольника
		double square = a * b;
		
		System.out.print("Площадь прямоугольника при ширине " + a + "см и длине " + b + "см равна " + square + " квадратных см.");
		
	}

}
