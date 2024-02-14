package project1_meena;

import java.util.Random;

public class RandomNumberGeneration {
	public static void main(String[] args) {
		// print any random number in the range of 0 to 9
		//Random r = new Random();
		//System.out.println(r.nextInt(9));

		// Random phonennumber generation
		System.out.println(getphonenumberString());

	}

	public static String getphonenumberString() {
		String mobileChars = "1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();

		while (salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * mobileChars.length());
			salt.append(mobileChars.charAt(index));

		}
		String saltStr = salt.toString();
		return saltStr;
	}

}
