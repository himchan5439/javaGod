package e.io;

import java.io.File;
import java.io.IOException;

public class FileManageClass {
	public static void main(String[] args) {
		FileManageClass sample = new FileManageClass();
		String pathName = File.separator + "java" + File.separator + "text";
		String fileName = "test.txt";
		
		sample.checkFile(pathName, fileName);
	}
	
	public void checkFile(String pathName, String fileName) {
		File file = new File(pathName, fileName);
		try {
			System.out.println("Create result = " + file.createNewFile());
			getFileInfo(file);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void getFileInfo(File file) throws IOException {
		System.out.println("Absolute path = " + file.getAbsolutePath());
		System.out.println("Absolute file = " + file.getAbsoluteFile());
		System.out.println("canonical path = " + file.getCanonicalPath());
		System.out.println("Canonical file = " + file.getCanonicalFile());
		
		System.out.println("Parent = " + file.getParent());
		
		System.out.println("Name = " + file.getName());
		System.out.println("Patn = " + file.getPath());
	}
}
