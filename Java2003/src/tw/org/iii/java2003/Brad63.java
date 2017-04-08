package tw.org.iii.java2003;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Brad63 {

	public static void main(String[] args) {
		// UDP / TCP
		String data = "Hello, Brad";
		byte[] sendData = data.getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(sendData, sendData.length, 
					InetAddress.getByName("127.0.0.1"), 8888);
			socket.send(packet);
			socket.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
