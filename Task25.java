package by.jb29.mod1.les02;

/*
 * Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами
a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).
 */


public class Task25 {

	public static void main(String[] args) {
		
		int a = 1, b = 1, c = 1;
		
				
		double d = Math.pow(b, 2) - 4 * a * c;
		
		if(d > 0) {
			
			double x1 = (-b + Math.pow(d, 2)) / (2 * a);
			double x2 = (-b - Math.pow(d, 2)) / (2 * a);
			
			System.out.println("Корни уравнения:");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
			
		}else if(d < 0) {
			
			System.out.println("Корней нет.");
			
		}else {
			double x = (-b + Math.pow(d, 2)) / (2 * a);
			System.out.println("Корень уравнения х равен " + x);
		}
		

	}

}
