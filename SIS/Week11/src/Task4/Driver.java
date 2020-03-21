package Task4;

import java.util.Vector;

import folder.Time;

public class Driver {

	public static void main(String[] args) {
		sortTimes();
		System.out.println();
		sortChocolates();
	}
	
	static void sortTimes() {
		Time t1 = new Time(13, 25, 43);
		Time t2 = new Time(5, 15, 34 );
		Time t3 = new Time(5, 40, 43);
		Time [] times = new Time[3];
		times[0] = t1;
		times[1] = t2;
		times[2] = t3;
		System.out.println("Before sort: ");
		printArray(times);
		System.out.println("After sort: ");
		Sort.bubbleSort(times);
		printArray(times);
	}
	
	static void sortChocolates() {
		Chocolate twix = new Chocolate("Twix", 250);
		Chocolate kitkat = new Chocolate("Kit-Kat", 185);
		Chocolate bounty = new Chocolate("Bounty", 200);
		Chocolate[] array = new Chocolate[3];
		array[0] = twix;
		array[1] = kitkat;
		array[2] = bounty;
		System.out.println("Before sort: ");
		printArray(array);
		System.out.println("After sort: ");
		Sort.bubbleSort(array);
		printArray(array);
	}
	
	static <E> void printArray(E [] array) {
		for (E obj : array) {
			System.out.println(obj);
		}
	}
}
