package by.jb29.mod1.les02;

//Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.


public class Task20 {

	public static void main(String[] args) {
		
		double dlinaOkr = 28.4;
		
		double squareOkr = Math.pow(dlinaOkr, 2) / (4 * Math.PI);
		
		System.out.println("Площадь круга: " + (double)Math.round(squareOkr * 100) / 100);

	}

}
