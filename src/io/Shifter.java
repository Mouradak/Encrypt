package io;

public class Shifter {
	
	private static final int[] chain = {751521, 365465 , 4156 };
	
	public static String encrypt(String key) {
		String result = "";
		int length = key.length();
		char character;
		int CurrentKey=0;
		for(int i=0; i<length ;i++) {
			if(CurrentKey> chain.length-1) CurrentKey =0;
			character = key.charAt(i);
			character += chain[CurrentKey];			//Shifting by current key which is brought from chain -- Makes the shifting more complicated so as to not be easily decrypted
			result += character;
			CurrentKey++;
		}
		return result;
	}
	
	
	
	public static String decrypt(String key) {
		String result = "";
		int length = key.length();
		char character;
		int CurrentKey=0;
		for(int i=0; i<length ;i++) {
			if(CurrentKey> chain.length-1) CurrentKey =0;
			character = key.charAt(i);
			character -= chain[CurrentKey];			//Shifting by current key which is brought from chain -- Makes the shifting more complicated so as to not be easily decrypted
			result += character;
			CurrentKey++;
		}
		return result;
	}
}
