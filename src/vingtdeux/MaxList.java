package vingtdeux;

import java.util.ArrayList;

public class MaxList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> max = new ArrayList<>();
		max.add(40);
		max.add(95);
		max.add(10);
		max.add(-5);
		max.add(12);
		max.add(50);
		max.add(-1);
		max.add(11);
		max.add(19);
		max.add(-135);

		Integer bigger = new Integer(0);
		Integer lower = new Integer(0);
		Integer swap = new Integer(0);

		for (Integer imax : max) {
			bigger = bigger < imax ? imax : bigger; // Ternaire max
			lower = lower > imax ? imax : lower; // Ternaire min

			// if (imax.intValue() > bigger) {
			// bigger = imax.intValue();
			// }
		}
		System.out.println("Le plus grand : " + bigger + " & le plus petit : " + lower);
	}

}
