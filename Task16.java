package by.jb29.mod1.les02;

//Найти произведение цифр заданного четырехзначного числа.

public class Task16 {

	public static void main(String[] args) {
		
		int chislo = 4321;
		
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
		
		
		//произведение цифр четырехзначного числа
		
		int rez = a * b * c * d;
		
		
		System.out.println("Произведение цифр числа " + chislo + " равно " + rez);

	}

}
