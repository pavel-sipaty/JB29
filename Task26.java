package by.jb29.mod1.les02;


// Ќайти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у



public class Task26 {

	public static void main(String[] args) {
		
		double a, b, ugol;
		
		a = 10;
		b = 12;
		ugol = 90;
		
		double s = 1.0 / 2 * a * b * Math.sin(ugol);
		
		System.out.println(s);

		

	}

}
