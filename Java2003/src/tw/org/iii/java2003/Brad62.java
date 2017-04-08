package tw.org.iii.java2003;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class Brad62 {

	public static void main(String[] args) {
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.hinet.net.dddd");
			for (InetAddress ip : ips){
				System.out.println(ip.getHostAddress());
			}
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
		}
	}

}
