package transfo;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel2BPMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook;
		FileInputStream file;
		int ro = 0;
		try {
			file = new FileInputStream(new File("C:\\Users\\sdaclin-mallek\\git\\repository\\Excel2BPMN\\source\\TestGantt.xlsx"));
			workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();

					switch (cell.getCellType()) {
							case STRING:
								if (cell.getStringCellValue().equals("Consolidated task")) {
									ro = row.getRowNum();				
									System.out.print(cell.getStringCellValue() +  ";" );
								}
								if (cell.getStringCellValue().equals("ACT_PLAN")) {
									ro = row.getRowNum();				
									System.out.print(cell.getStringCellValue() +  ";" );
								}
								if (row.getRowNum() == ro) {
									System.out.print(cell.getStringCellValue() + ";" );
								}
							
							break;
							
							case NUMERIC:
								if (row.getRowNum() == ro) {
									System.out.print(cell.getNumericCellValue() + ";" );
								}
							break;
						
						default:
							break;
					}
					
			
				}
				
				
				String content = "Ceci est le contenu ajouté au fichier";
				System.out.println("test");

				   File fileBPMN = new File("C:\\Users\\sdaclin-mallek\\git\\repository\\Excel2BPMN\\source\\test.txt");

				   // créer le fichier s'il n'existe pas
				   if (!fileBPMN.exists()) {
				    fileBPMN.createNewFile();
				   }

				   FileWriter fw = new FileWriter(fileBPMN.getAbsoluteFile());
				   BufferedWriter bw = new BufferedWriter(fw);
				   bw.write(content);
				   bw.close();

				
				System.out.println("");
			}

			   System.out.println("Modification terminée!");
				
			file.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
