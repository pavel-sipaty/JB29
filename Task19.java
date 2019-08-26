package by.jb29.mod1.les02;

/*
 * Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его
высоту, радиусы вписанной и описанной окружностей.
 */


public class Task19 {

	public static void main(String[] args) {
		
		double storona = 4;
		
		double s = (Math.pow(storona, 2) * Math.sqrt(3)) / 4;  //площадь треугольника
		
		double h = (storona * Math.sqrt(3)) / 2;  //высота треугольника
		
		double rVpis = storona / (2 * Math.sqrt(3));  //радиус вписанной окружности
		
		double rOpis = storona / Math.sqrt(3); //радиус описанной окружности
		
		System.out.println("Площадь равностороннего треугольника: " + (double)Math.round(s * 100) / 100);
		System.out.println("Высота треугольника: " + (double)Math.round(h * 100) / 100);
		System.out.println("Радиус вписанной окружности: " + (double)Math.round(rVpis * 100) / 100);
		System.out.println("Радиус описанной окружности: " + (double)Math.round(rOpis * 100) / 100);
		
		

	}

}
