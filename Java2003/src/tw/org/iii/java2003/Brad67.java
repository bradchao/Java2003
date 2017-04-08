package tw.org.iii.java2003;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad67 {

	public static void main(String[] args) {
		try {
			File sendFile = new File("./dir1/brad.jpg");
			byte[] buf = new byte[(int)sendFile.length()];
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(sendFile));
			bin.read(buf);
			bin.close();
			
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
			
			OutputStream out = socket.getOutputStream();
			out.write(buf);
			out.flush();
			out.close();
			
			socket.close();
		} catch (Exception e) {
			//System.out.println();
		}
	}

}
