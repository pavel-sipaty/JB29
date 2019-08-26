package by.jb29.mod1.les02;

/*
 * Дана величина А, выражающая объем информации в байтах. Перевести А в более
крупные единицы измерения информации.
 */

public class Task34 {

	public static void main(String[] args) {
		
		double a = 5124243434641d;
		
		double kiloA = a / 1000;
		
		double megaA = kiloA / 1000;
		
		double gigaA = megaA / 1000;
		
		System.out.printf("%.0f байт равны:", a);
		System.out.println();
		System.out.println();
		System.out.printf("%.2f кбайт", kiloA);
		System.out.println();
		System.out.printf("%.2f мбайт", megaA);
		System.out.println();
		System.out.printf("%.2f гбайт", gigaA);
		
		

	}

}
