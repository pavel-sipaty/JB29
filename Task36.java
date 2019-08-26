package by.jb29.mod1.les02;

/*
 * Найти частное произведений четных и нечетных цифр четырехзначного числа.
 */

public class Task36 {
	
	public static void main(String[] args) {
		
int chislo = 2546;
		
		//получаем остаток от деление на 10 Это наша четвертая цифра.
		
		int a = chislo % 10;
		
		
		//Это наша третья цифра.
		
		int triZnak = chislo / 10; //получаем промежуточное трехзначное целое
		int b = triZnak % 10;
		
				
		//Это наша вторая цифра.
		
		int dvaZnak = triZnak / 10; //получаем промежуточное двухзначное число
		int c = dvaZnak % 10;
		
		
		//получаем целое число от деления на 1000. Это наша первая цифра
		int d = chislo / 1000;
		
		
		double chet, neChet; //переменные произведения четных и нечетных цифр
		
		chet = 1;
		neChet = 1;
		
		if(d % 2 == 0) {
			
			chet = chet * d;
			
		} else {
			
			neChet = neChet * d;
			
		}
		
		
		if(c % 2 == 0) {
			
			chet = chet * c;
			
		} else {
			
			neChet = neChet * c;
			
		}
		
		
		if(b % 2 == 0) {
			
			chet = chet * b;
			
		} else {
			
			neChet = neChet * b;
			
		}
		
		
		
		if(a % 2 == 0) {
			
			chet = chet * a;
			
		} else {
			
			neChet = neChet * a;
			
		}
		
		
		//частое произведений четных и нечетных цифр
		
		double chastnoe = (double)Math.round((chet / neChet) * 100) / 100;
		
		System.out.println("Заданное число: " + chislo);
		System.out.println("Произведение четных цифр:" + chet);
		System.out.println("Произведение нечетных цифр: " + neChet);
		System.out.println("Частное произведений четных и нечетных цифр: " + chastnoe);
		
		
		
	}

}
