package e.io;

import static java.io.File.separator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManageTextFile {
	public static void main(String[] args) {
		ManageTextFile manager = new ManageTextFile();
		int numberCount = 10;
		String fullPath = separator + "java" + separator + "text" + separator + "number.txt";
		
//		manager.writeFile(fullPath, numberCount);
//		manager.readFile(fullPath);		
		manager.readFileWithScanner(fullPath);
	}
	
	public void writeFile(String fileName, int numberCount) {
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter(fileName);
			bufferedWriter = new BufferedWriter(fileWriter);

			for(int loop = 0; loop<=numberCount; loop++) {
				bufferedWriter.write(Integer.toString(loop));
				bufferedWriter.newLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
			if(fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}

	public void readFile(String fileName) {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);
			
			String data;
			while((data = bufferedReader.readLine()) != null) {
				System.out.println(data);
			}
			System.out.println("Read success !!!");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
			if(fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}
	
	public void readFileWithScanner(String fileName) {
		File file = new File(fileName);
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException	fnfe) {
			fnfe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(scanner != null) {
				scanner.close();
			}
		}
	}

}
