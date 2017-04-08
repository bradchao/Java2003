package tw.org.iii.java2003;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad54 {

	public static void main(String[] args) {
		String data = "OK";
		File outFile = new File("./dir1/brad.txt");
		try {
			FileOutputStream fout = new FileOutputStream(outFile, true);
			fout.write(data.getBytes());
			fout.flush();
			fout.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
