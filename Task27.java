package by.jb29.mod1.les02;

/*
 * Дано значение a. Не используя никаких функций и никаких операций, кроме
умножения, получить значение а8 за три операции и а10 за четыре операции.
 */


public class Task27 {

	public static void main(String[] args) {
		
		double a, a8, a10;
		
		a = 2;
		
		a8 = a * Math.pow(a, 2) * Math.pow(a, 5);
		a10 = Math.pow(a, 2) * Math.pow(a, 3) * Math.pow(a, 5);
		
		System.out.println("a8 = " + a8);
		System.out.println("a101 = " + a10);

	}

}
