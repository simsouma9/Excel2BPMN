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

import excel2BPMN.Column;

public class Excel2BPMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		try {
			// Récupération du fichier Excel
			FilePath path = new FilePath("C:\\Users\\sdaclin-mallek\\eclipse-workspace\\Excel2BPMN\\source\\TestGantt2BPMN.xlsx");
			String NameProcess = path.getSegments()[path.getSegments().length-1].replace(".xlsx","");
			
			// Création du fichier BPMN s'il n'éxiste pas
			File fileBPMN = new File("C:\\Users\\sdaclin-mallek\\eclipse-workspace\\Excel2BPMN\\source\\"+NameProcess+".bpmn");
			if (!fileBPMN.exists()) {
				fileBPMN.createNewFile();
			}
			
			FileWriter fw = new FileWriter(fileBPMN.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			
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
		int colIdentifier = 0;
		int identifier = 0;
		int colPredecessor = 0;
		int colSuccessor = 0;
		String name = null;
		String predecessor = null;
		String successor = null;
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
					int column = cell.getColumnIndex();
					switch (cell.getCellType()) {
						case STRING:
							if (cell.getStringCellValue().equals("Line identifier")) {
								colIdentifier = column; 
							
							}
							if (cell.getStringCellValue().equals("Predecessor")) {
								colPredecessor = column; 
								
							}
							if (cell.getStringCellValue().equals("Successor")) {
								colSuccessor = column; 
								
							}
							if (cell.getStringCellValue().equals("Consolidated task")) {// Category
									//ro = row.getRowNum();
									name = cellIterator.next().toString();
									//bw.write(extractCallActivity(identifier, name));
									
									//StringBuffer buffer=new StringBuffer();
									

							}
							if (cell.getStringCellValue().equals("ACT_PLAN")
									|| cell.getStringCellValue().equals("PICKED_ACT_PLAN")) {// Activity
									ro = row.getRowNum();
									name = cellIterator.next().toString();
									
							}

							if (cell.getColumnIndex() == colPredecessor) {
									predecessor = cell.getStringCellValue();
									
									if (predecessor.endsWith("FS")) {
										predecessor = predecessor.replace("FS", "");	

									}	
							}
							if (cell.getColumnIndex() == colSuccessor) {
								successor = cell.getStringCellValue();
								if (successor.endsWith("FS")) {
									successor = successor.replace("FS", "");
									//System.out.print("indentifier = " + identifier +"; name = " + name +"; pred ="+ predecessor+ "; succ ="+ successor+ ";\n");

								}	
							}
							
							if (row.getRowNum() == ro && !(ro == 0)) {
								
								//bw.write(cell.getStringCellValue() + ";");
								// System.out.print(cell.getStringCellValue() + ";\n" );
							} 
							
						
						break;

						case NUMERIC:
						
							if (cell.getColumnIndex() == colIdentifier) {
								identifier = (int) cell.getNumericCellValue();
							}
							
							
							if (row.getRowNum() == ro) {
								//System.out.print(cell.getLocalDateTimeCellValue()+";\n" );
							}
							
						break;

						default:
					break;
					}
				}
				
				
				 if(name !=null  && name.contains("Activitie")) {
					
					 if (successor.isEmpty() && row.getRowNum() == ro) {
					
					//System.out.print("indentifier = " + identifier +"; name = " + name +"; pred ="+ predecessor+ "; succ ="+ successor+ ";\n");

					bw.write(extractEndEvent(i));
					
					bw.write(extractTask(identifier, ""+i, name));
						
					} else {
					 bw.write(extractTask(identifier, successor, name));
					}
					if (predecessor.isEmpty() && row.getRowNum() == ro) {
						
						bw.write(extractStartEvent(identifier));
						
					} else {
						//écrire les sequence flow et gateway
						if (predecessor.contains(";")) {
							System.out.print("indentifier = " + identifier +"; name = " + name +"; pred ="+ predecessor+ "; succ ="+ successor+ ";\n");
							bw.write(extractParallelGateway(identifier));
						}

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
	
	public static String extractTask (int i, String successor, String name)  {
	
	String task = "<bpmn2:task id=\"Task_"+ i+"\" name=\""+ name+"\">\r\n"
			+ "      <bpmn2:incoming>SequenceFlow_"+ i+"</bpmn2:incoming>\r\n"
			+ "      <bpmn2:outgoing>SequenceFlow_"+ successor+"</bpmn2:outgoing>\r\n"
			+ "    </bpmn2:task>\r\n";
	return task;
	}
	public static String extractStartEvent (int i)  {
		
		String startEvent = "<bpmn2:startEvent id=\"StartEvent_"+i+"\" name=\"Start Event "+i+"\">\r\n"
				+ "      <bpmn2:outgoing>SequenceFlow_"+i+"</bpmn2:outgoing>\r\n"
				+ "    </bpmn2:startEvent>\r\n";
		return startEvent;
	}
public static String extractEndEvent (int i)  {
		
		String startEvent = "<bpmn2:endEvent id=\"EndEvent_"+i+"\" name=\"End Event 1\">\r\n"
				+ "      <bpmn2:incoming>SequenceFlow_"+i+"</bpmn2:incoming>\r\n"
				+ "    </bpmn2:endEvent>";
		return startEvent;
	}
public static String extractParallelGateway (int i) {
	String parallelGateway = "<bpmn2:parallelGateway id=\"ParallelGateway_1\" name=\"Parallel Gateway 1\" gatewayDirection=\"Diverging\">\r\n"
			+ "      <bpmn2:incoming>SequenceFlow_1</bpmn2:incoming>\r\n"
			+ "      <bpmn2:outgoing>SequenceFlow_2</bpmn2:outgoing>\r\n"
			+ "      <bpmn2:outgoing>SequenceFlow_3</bpmn2:outgoing>\r\n"
			+ "      <bpmn2:outgoing>SequenceFlow_4</bpmn2:outgoing>\r\n"
			+ "    </bpmn2:parallelGateway>";
	return parallelGateway;
}

}
