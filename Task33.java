package by.jb29.mod1.les02;

//Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.


public class Task33 {

	public static void main(String[] args) {
		
		char symbol = '9';
		
		int c = symbol; //присваиваем инту символ, чтобы узнать порядковый номер
		
		int nextSymbol = c + 1; 	//узнаем порядковый номер последующего символа
		int beforeSymbol = c - 1; //узнаем порядковый номер предыдущего символа
		
		char next = (char)nextSymbol; 		//переводим порядковый номер в переменную
		char before = (char)beforeSymbol;  //переводим порядковый номер в переменную
		
		System.out.println("Заданный символ: " + symbol);
		System.out.println("Последующий символ: " + next);
		System.out.println("Предыдущий символ: " + before);
		
		

	}

}
