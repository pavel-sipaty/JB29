package by.jb29.mod1.les02;

//Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N


public class Task35 {

	public static void main(String[] args) {
		
		double m, n;
		
		m = 165565849;
		
		n = 385653;
		
		double mn = (double)Math.round(m / n * 1000) / 1000;
		
		int tseloe = (int)mn;
		
		int mladTsel = tseloe % 10;
		
		int starshDrobnoe = (int)((mn - tseloe) * 10);
		
		
		System.out.println("Число M / N: " + mn);
		System.out.println("Младшая цифра из целой части: " + mladTsel);
		System.out.println("Старшая цифра из дробной части: " + starshDrobnoe);
		

	}

}
