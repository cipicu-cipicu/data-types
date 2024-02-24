import java.io.BufferedReader;
import java.io.FileReader;

public class RegExExample {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader("data\\regex.txt"));
		
		String line = reader.readLine();
		while (line != null) {
			if (isWholeNumber(line)) {
				System.out.println("I found an integer: " + line);
			}

			line = reader.readLine();
		}
		
		reader.close();
	}

	public static boolean isWholeNumber(String line) {
		boolean lineIsWholeNumber = false;
		//if (line.matches("[0-9]+")) {
		if (line.matches("\\d+")) {
			lineIsWholeNumber = true;
		}
		return lineIsWholeNumber;
	}
	
}
