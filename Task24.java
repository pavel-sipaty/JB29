package by.jb29.mod1.les02;

//Ќайти площадь равнобедренной трапеции с основани€ми а и b и углом "альфа" при большем основании а.

public class Task24 {

	public static void main(String[] args) {
		
		double a, b, ugol, s;
		
		a = 3;
		b = 6;
		ugol = 45;
		
		s = (a + b) / 2 * (b - a) / 2 * Math.tan(ugol);
		
		System.out.printf("ѕлощадь равна: %.2f", s);
	}

}
