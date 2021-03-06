package tw.org.iii.java2003;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad68 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			Socket socket  = server.accept();
			
			System.out.println(socket.getInetAddress().getHostAddress());
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.jpg"));
			BufferedInputStream bin = new BufferedInputStream(socket.getInputStream());
			byte[] buf = new byte[4096]; int len;
			while ( (len = bin.read(buf)) != -1){
				bout.write(buf, 0, len);
			}
			bin.close();
			bout.flush();
			bout.close();
			server.close();
			System.out.println("Receive OK");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
