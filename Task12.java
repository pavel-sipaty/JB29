package by.jb29.mod1.les02;

//Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2)

public class Task12 {

	public static void main(String[] args) {
		
		// координаты первой точки
		
		int x1 = 7;
		int y1 = 4;
		
		//координаты второй точки
		
		int x2 = 9;
		int y2 = -2;
		
		//поиск расстояние между двумя точками
		
		double rast = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));
		
		System.out.print("Расстояние между двумя точками равно " + (double)Math.round(rast * 100) / 100);

	}

}
