package by.jb29.mod1.les02;

//Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.


public class Task18 {

	public static void main(String[] args) {
		
		double dlinGran = 10.4;
		
		double squareGran = (double)Math.round(Math.pow(dlinGran, 2) * 100) / 100;
		
		double squarePolPov = squareGran * 6;
		
		double volKub = Math.pow(dlinGran, 3);
		
		System.out.println("Площадь грани куба: " + squareGran);
		System.out.println("Площадь полной поверхности куба: " + squarePolPov);
		System.out.println("Объем куба: " + volKub);
		

	}

}
