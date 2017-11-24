package test.java;

public class TroisNov {

	public static void main(String[] args) {

		float somme = 0;
		int max = 0;
		int min = 20;

		int[] notes = { 2, 5, 6, 8, 12, 19, 16, 17, 20, 15 };
		for (int i = 0; i < notes.length; i++) {
			somme = somme + notes[i];

			if (max < notes[i])
				max = notes[i];
			if (min > notes[i])
				min = notes[i];
		}

		{
			System.out.println("Moyenne = " + somme / notes.length);
			System.out.println("La note minimal est : " + min);
			System.out.println("La note maximal est : " + max);
		}

	}
}
