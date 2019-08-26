package by.jb29.mod1.les02;

//Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r)


public class Task23 {

	public static void main(String[] args) {
		
		double rMal, rBol, squareKolca;
		
		rMal = 2; //радиус меньшей окружности
		rBol = 5; //радиус большей окружности
		
		if(rBol > rMal) {
			
			squareKolca = Math.PI * (Math.pow(rBol, 2) - Math.pow(rMal, 2));
			System.out.println("Площадь кольца равна: " + (double)Math.round(squareKolca * 100) / 100);
			
		} else {
			
			System.out.println("Радиус меньшей окружности должен быть меньше радиуса большей окружности!");
			
		}
		
		
		

	}

}
