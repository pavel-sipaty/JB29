package by.jb29.mod1.les02;

//Составить программу перевода радианной меры угла в градусы, минуты и секунды.

public class Task28 {

	public static void main(String[] args) {
		
		int rad = 3;
		
		double grad = Math.toDegrees(rad);
		
		int a = (int)grad; //целое кол-во градусов
		
		double min = (grad - (double)a) * 60;
		
		int b = (int)min; //целое кол-во минут
		
		double sec = Math.round((min - b) * 60);
		
		int c = (int)sec; //целое кол-во секунд
		
		System.out.println(rad + "рад = " + a + " градусов " + b + " минут " + c + " секунд.");
		

	}

}
