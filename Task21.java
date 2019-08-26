package by.jb29.mod1.les02;

/*
 * ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и целой
част€х). ѕомен€ть местами дробную и целую части числа и вывести полученное значение
числа.
 */


public class Task21 {

	public static void main(String[] args) {
		
		double r = 458.254;
		
		int a = (int)r; //целое
		
		int o = (int)Math.round((r - a) * 1000); //дробна€ часть в виде целого
		
		double rez = (double)(o * 1000 + a) / 1000;
		
		
		
		System.out.println(rez);
			
		
		
		
	}

}
