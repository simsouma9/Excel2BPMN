package transfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Gantt2BPMN {

	public static void main(String[] args) {
		
		CSVReader reader;
		try {
			reader = new CSVReader(
					new FileReader("C:\\Users\\sdaclin-mallek\\eclipse-workspace\\Excel2BPMN\\source\\tableauTest.csv"));
			String[] nextLine;
			while ((nextLine = reader.readNext()) != null) {
				// nextLine[] is an array of values from the line
				System.out.println(nextLine[0] + nextLine[1] + "etc...");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
