package by.jb29.mod1.les02;

/*
 * Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна
третьей цифре.
 */


public class Task377 {

	public static void main(String[] args) {
		
		int chislo = 101;
		
		//получаем остаток от деление на 10. Это наша третья цифра.
		
		int a = chislo % 10;
		
		
		//Это наша вторая цифра.
		
		int dvaZnak = chislo / 10; //получаем промежуточное трехзначное целое
		int b = dvaZnak % 10;
		
				
		//Это наша первая цифра.
		
		int c = chislo / 100;
		
		boolean srav1 = (a + b == c);
		boolean srav2 = (b + c == a);
		boolean srav3 = (c + a == b);
		
		if(srav1) {
			System.out.println(srav1);
		}else if(srav2) {
			System.out.println(srav2);
		}else if(srav3) {
			System.out.println(srav3);
		}else {
			System.out.println(srav1);
		}

	}

}
