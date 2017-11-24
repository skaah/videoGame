package test.java;

public class RectVide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 20; j++) {
				if (i == 0 || i == 5 - 1 || j == 0 || j == 20 - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}

}
