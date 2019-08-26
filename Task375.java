package by.jb29.mod1.les02;

/*
 * —оставить линейную программу, печатающую значение true, если указанное
высказывание €вл€етс€ истинным, и false Ч в противном случае:
 вадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
 */


public class Task375 {

	public static void main(String[] args) {
		
		int chislo = 534;
		
		//получаем остаток от деление на 10 Ёто наша треть€ цифра.
		
		int a = chislo % 10;
		
		
		//Ёто наша втора€ цифра.
		
		int dvaZnak = chislo / 10; //получаем промежуточное трехзначное целое
		int b = dvaZnak % 10;
		
				
		//Ёто наша перва€ цифра.
		
		int c = chislo / 100;
		
		//куб суммы цифр
		
		double kubSum = (double)Math.pow(a + b + c, 3);
		
		//квадрат числа
		
		double kvadChislo = (double)Math.pow(chislo, 2);
		
		boolean sravn = (kvadChislo == kubSum);
		
		if(sravn) {
			System.out.println(sravn);
		}else {
			System.out.println(sravn);
		}

	}

}
