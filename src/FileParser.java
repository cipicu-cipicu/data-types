import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader;
		
		try {
			reader = new BufferedReader(new FileReader("C:\\home\\eclipse-workspace\\datatypes1\\data\\sample.txt"));
			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
