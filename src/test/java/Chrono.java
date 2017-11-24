package test.java;

public class Chrono {

	public static void main(String[] args) throws InterruptedException {
		
		Integer minute = new Integer(0);
		Integer seconde = new Integer(0);

		while (minute != 60) {
			for (int i = 0; i <= 59; i++) {
				Thread.sleep(100);

				seconde = new Integer(i);
				System.out.printf("%02d:%02d %n", minute, seconde);
				if (seconde == 59) {

					minute = new Integer(minute + 1);
					seconde = new Integer(0);
				}
			}
		}
	}
}
