
// author: Brennan Mitchell
import java.util.Scanner;

public class TrainDepartures {

	/*
	 * This program reads two train departure time inputs from the user given in
	 * standard military time. The program then finds the difference between the two
	 * times and displays it for the user. There are no parameters, and user inputs
	 * are assumed to be valid.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Train A Departs at: ");
		int trainA = scanner.nextInt();
		System.out.print("Train B Departs at: ");
		int trainB = scanner.nextInt();
		System.out.println();
		int max = Math.max(trainA, trainB);
		int min = Math.min(trainA, trainB);
		int difference = max - min;
		int hours = difference / 100;
		int maxMinutes = max % 100;
		int minMinutes = min % 100;
		int minutes = maxMinutes - minMinutes;
		if (minutes >= 60) {
			hours += 1;
			minutes = maxMinutes - minMinutes;
		}
		if (minutes < 0)
			minutes = 60 + maxMinutes - minMinutes;
		System.out.print("Difference: " + hours + " hours and " + minutes + " minutes");
	}

}
