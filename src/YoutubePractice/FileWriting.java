package YoutubePractice;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {

		try {
		FileWriter writer = new FileWriter("poem.txt");
		writer.write("Roses are red \nViolets are blue");
		writer.close();
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
