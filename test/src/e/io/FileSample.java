package e.io;

import java.io.File;
import java.util.Date;

public class FileSample {
	public static void main(String[] args) {
		FileSample sample = new FileSample();
		String pathName = "C:\\java\\text";
//		sample.checkPath(pathName);
//		sample.makeDir(pathName);
//		sample.checkFileMethods(pathName);
//		sample.canFileMethods(pathName);
//		sample.lastModified(pathName);
//		sample.deleteFile(pathName);
	}
	
	public void checkPath(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " is exists? = " + file.exists());
	}
	
	public void makeDir(String pathName) {
		File file = new File(pathName);
		System.out.println("make " + pathName + " result = " + file.mkdir());
	}
	
	public void checkFileMethods(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " is directory? = " + file.isDirectory());
		System.out.println(pathName + "is file? = " + file.isFile());
		System.out.println(pathName + "is indden? = " + file.isHidden());
	}
	
	public void canFileMethods(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " can read? = " + file.canRead());
		System.out.println(pathName + " can write? = " + file.canWrite());
		System.out.println(pathName + " can execute? = " + file.canExecute());
	}
	
	public void lastModified(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " last modified = " + new Date(file.lastModified()));
	}
	
	public void deleteFile(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " delete file = " + file.delete());
	}
}
