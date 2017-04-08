package tw.org.iii.java2003;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad65 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
			
			OutputStream out = socket.getOutputStream();
			out.write("Hello, World".getBytes());
			out.flush();
			out.close();
			
			socket.close();
		} catch (Exception e) {
			//System.out.println();
		}
	}

}
