package tw.org.iii.java2003;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad58 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File readFile = new File("./dir1/brad.jpg");
		File saveFile = new File("./dir2/brad.jpg");
		
		try {
			byte[] b = new byte[(int)readFile.length()];
			FileInputStream fin = new FileInputStream(readFile);
			fin.read(b);
			fin.close();
			
			FileOutputStream fout = new FileOutputStream(saveFile);
			fout.write(b);
			fout.flush();
			fout.close();
			System.out.println("Finish");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis()-start);
		
		
	}

}
