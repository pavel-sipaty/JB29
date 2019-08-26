package by.jb29.mod1.les02;

/*
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в
секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей
форме:
ННч ММмин SSc.
 */


public class Task22 {

	public static void main(String[] args) {
		
		int t = 3659;
		
		int hour = t / 3600; //количество часов
		
		int ost1 = t - hour * 3600; //промежуточный остаток в секундах
		
		int minute = ost1 / 60; //количество минут
		
		int ostSec = ost1 - minute*60; //количество оставшихся секунд
		
		
		System.out.println(hour + "ч " + minute + "мин " + ostSec + "c");
		 

	}

}
