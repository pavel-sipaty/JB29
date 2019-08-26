package by.jb29.mod1.les02;

import java.util.Random;

/*
 * Текущее показание электронных часов: m ч (0 ≤ т ≤23) n мин (0 ≤ п ≤59) k с (0 ≤к ≤59).
Какое время будут показывать часы через р ч q мин r с?
 */


public class Task32 {

	public static void main(String[] args) {
		
		int m, n, k;
		
		Random hour = new Random();
		
		m = hour.nextInt(24); //случайный час
		
	
		Random minute = new Random();
		
		n = minute.nextInt(60); //случайная минута
		
		
		Random sec = new Random ();
		
		k = sec.nextInt(60);  //случайная секунда
		
		
		//переводим текущее время в секунды
		
		int secTek = m * 3600 + n * 60 + k;
		
		//вводим новые переменные часов, минут и секунд
		
		int p, q, r;
		
		p = 3; //часы
		q = 25; //минуты
		r = 48; //секунды
		
		//переводим их в секунды
		
		int secNew = p * 3600 + q * 60 + r;
		
		//прибавляем это к текущему времени
		
		int secPlus = secTek + secNew;
		
		// вычленяем часы, минуты и секунды нового времени
		
		int hourNext = secPlus / 3600;
		int minNext = (secPlus - hourNext * 3600) / 60;
		int secNext = secPlus - hourNext * 3600 - minNext * 60;
		
		
		System.out.println("Текущее время на часах: " + m + "ч " + n + "мин " + k + "сек");
		System.out.println();
		System.out.println("Через " + p + "ч " + q + "мин " + r + "сек");
		System.out.println();
		System.out.println("Часы будут показывать " + hourNext + "ч " + minNext + "мин " + secNext + "с");
		
		
		
		
		
		

	}

}
