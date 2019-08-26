package by.jb29.mod1.les02;

/*
 * Составить линейную программу, печатающую значение true, если указанное
высказывание является истинным, и false — в противном случае:
Сумма цифр данного трехзначного числа N является четным числом
 */



public class Task373 {

	public static void main(String[] args) {
		int chislo = 534;
		
		//получаем остаток от деление на 10 Это наша третья цифра.
		
		int a = chislo % 10;
		
		
		//Это наша вторая цифра.
		
		int dvaZnak = chislo / 10; //получаем промежуточное трехзначное целое
		int b = dvaZnak % 10;
		
				
		//Это наша первая цифра.
		
		int c = chislo / 100;
		
		//сумма цифр
		
		int sum = a + b + c;
		
		boolean chet = (sum % 2 == 0);
		
		if(chet) {
			System.out.println("Сумма цифр числа " + chislo + " равна " + sum + " и является четным числом: " + chet);
		}else {
			System.out.println("Сумма цифр числа " + chislo + " равна " + sum + " и является четным числом: " + chet);
		}
		

	}

}
