package by.jb29.mod1.les02;

/*
 * «аданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Ќайти его
периметр и площадь.
 */


public class Task13 {

	public static void main(String[] args) {
		// координаты первой точки A
		
		int x1 = 3;
		int y1 = 4;
				
		//координаты второй точки B
			
		int x2 = 5;
		int y2 = -2;
		
		//координаты третьей точки C
		
		int x3 = -6;
		int y3 = 2;
				
		//поиск рассто€ние r1 между двум€ точками AB
				
		double r1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));
		
		
		//поиск рассто€ние r2 между двум€ точками BC
		
		double r2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3-y2), 2));
		
		//поиск рассто€ние r3 между двум€ точками CA
		
		double r3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1-y3), 2));
		
		//периметр треугольника
		
		double per = r1 + r2 + r3;
		
		double polPer = per / 2; //полупериметр
		
		//площадь треугольник
		
		double square = Math.sqrt(polPer * (polPer - r1) * (polPer - r2) * (polPer - r3));
		
		System.out.println("ѕериметр треугольника равен: " + (double)Math.round(per * 100) / 100);
		System.out.println("ѕлощадь треугольника равна: " + (double)Math.round(square * 100) / 100);
		

	}

}
