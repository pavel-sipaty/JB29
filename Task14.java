package by.jb29.mod1.les02;

//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

import static java.lang.Math.PI;


public class Task14 {

	public static void main(String[] args) {
		
		//радиус круга
		
		double r = 3.2;
		
		//длина окружности
		
		double dlinaOkr = PI * (r * 2);
		
		//площадь круга
		
		double squareKruga = PI * Math.pow(r, 2);
		
		System.out.println("Длина окружности: " + (double)Math.round(dlinaOkr * 100) / 100);
		System.out.println("Площадь круга: " + (double)Math.round(squareKruga * 100) / 100);
		
	}

}
