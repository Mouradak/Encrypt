package io;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataWriter{
	public static void write(String thing) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("output.txt")));
			writer.write(thing);
			writer.flush();
			writer.close();
			System.out.println("Complete");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}