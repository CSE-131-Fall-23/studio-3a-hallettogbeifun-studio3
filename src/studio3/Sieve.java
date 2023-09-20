package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number you would like to sieve up to");
		int n = in.nextInt();
		Boolean[] arrayA = new Boolean[n];
		for (int i = 0; i < n; i++) {
			arrayA[i] = true;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (arrayA[i] == true) {
				for (int j = (int) Math.pow((double) i,2.0); j < n; j = j + i) {
					arrayA[j] = false;
				}
			}
		}
		for (int i = 2; i < n; i++) {
			if (arrayA[i] == true) {
				System.out.println(i + " ");
			}
		}
	}

}
