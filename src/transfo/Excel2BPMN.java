package transfo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.osgi.framework.util.FilePath;

public class Excel2BPMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ro = 0;

		try {
			// Création du fichier BPMN s'il n'éxiste pas
			File fileBPMN = new File("C:\\Users\\sdaclin-mallek\\eclipse-workspace\\Excel2BPMN\\source\\test.txt");
			if (!fileBPMN.exists()) {
				fileBPMN.createNewFile();
			}
			// Récupération du fichier Excel
			FileWriter fw = new FileWriter(fileBPMN.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			FilePath path = new FilePath("C:\\Users\\sdaclin-mallek\\eclipse-workspace\\Excel2BPMN\\source\\TestGantt2BPMN.xlsx");
			
			String NameProcess = path.getSegments()[path.getSegments().length-1].replace(".xlsx","");
			
			bw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + "<!-- origin at X=0.0 Y=0.0 -->\n"
					+ "<bpmn2:definitions xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:bpmn2=\"http://www.omg.org/spec/BPMN/20100524/MODEL\" xmlns:bpmndi=\"http://www.omg.org/spec/BPMN/20100524/DI\" xmlns:dc=\"http://www.omg.org/spec/DD/20100524/DC\" xmlns:di=\"http://www.omg.org/spec/DD/20100524/DI\" xmlns:ext=\"http://org.eclipse.bpmn2/ext\" id=\"Definitions_1\" exporter=\"org.eclipse.bpmn2.modeler.core\" exporterVersion=\"1.5.3.Final-v20210519-2007-B1\" targetNamespace=\"http://org.eclipse.bpmn2/default/process\">");
			bw.write("\n  <bpmn2:process id=\""+ NameProcess +"\" name=\"Default Process\" isExecutable=\"false\">");
			

			extractGantt(bw);
			
			bw.write("\n  </bpmn2:process>");
			
			bw.write("\n</bpmn2:definitions>");
			
			bw.close();

			System.out.println("bpmn créé");

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	private static void extractGantt(BufferedWriter bw) throws FileNotFoundException, IOException {
		XSSFWorkbook workbook;
		FileInputStream file;
		int ro = 0;
		int i = 0;
		file = new FileInputStream(
				new File("C:\\Users\\sdaclin-mallek\\eclipse-workspace\\Excel2BPMN\\source\\TestGantt2BPMN.xlsx"));
		workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next(); 
			//Récupération des lignes non vides
			if (row.getPhysicalNumberOfCells() != 0) {		
				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();
				i=i+1;
				
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();				
					switch (cell.getCellType()) {
						case STRING:
							
							if (cell.getStringCellValue().equals("Consolidated task")) {// Category
									ro = row.getRowNum();
									Cell cell1 = cellIterator.next();
									bw.write(extractCallActivity(i, cell1.toString()));
									//StringBuffer buffer=new StringBuffer();
									

							}
							if (cell.getStringCellValue().equals("ACT_PLAN")
									|| cell.getStringCellValue().equals("PICKED_ACT_PLAN")) {// Activity
									ro = row.getRowNum();
									Cell cell1 = cellIterator.next();
									bw.write(extractTask(i, cell1.toString()));
							}
							if (row.getRowNum() == ro && !(ro == 0)) {
								//bw.write(cell.getStringCellValue() + ";");
								 //System.out.print(cell.getStringCellValue() + ";" );
							}
						break;

						case NUMERIC:
							if (row.getRowNum() == ro) {
								// bw.write(cell.getNumericCellValue() + ";");
								//bw.write(cell.getDateCellValue() + ";");
								 System.out.print(cell.getNumericCellValue()+";"+ cell.getDateCellValue() + ";" );
							}
						break;

						default:
					break;
					}
				}

				bw.write("\r\n");
			}
		}
		workbook.close();
		file.close();
	}
	
	public static String extractCallActivity(int i, String name) {
		
		String callactivity = "<bpmn2:callActivity id=\"CallActivity_"+i+"\" name=\""+ name+"\" calledElement=\"Process_"+ i +"\">\r\n"
				+ "      <bpmn2:incoming>SequenceFlow_8</bpmn2:incoming>\r\n"
				+ "      <bpmn2:outgoing>SequenceFlow_9</bpmn2:outgoing>\r\n"
				+ "    </bpmn2:callActivity>";
		return callactivity;
	}
	
	public static String extractTask (int i, String name)  {
	
	String task = "<bpmn2:task id=\"Task_"+ i+"\" name=\""+ name+"\">\r\n"
			+ "      <bpmn2:incoming>SequenceFlow_4</bpmn2:incoming>\r\n"
			+ "      <bpmn2:outgoing>SequenceFlow_7</bpmn2:outgoing>\r\n"
			+ "    </bpmn2:task>";
	return task;
	}
	

}
