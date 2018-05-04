package io;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word or sentence you wish to encrypt:");
		String phrase = scan.nextLine();
		
		DataWriter.write(Shifter.encrypt(phrase));
	}
}