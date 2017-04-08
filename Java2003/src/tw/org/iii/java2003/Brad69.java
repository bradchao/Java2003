package tw.org.iii.java2003;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Brad69 {

	public static void main(String[] args) {
		try{
			URL url = new URL(
					"https://s1.yimg.com/uu/api/res/1.2/Z5HMZLArFKQoOqUsMX_Dzw--/Zmk9dWxjcm9wO2N3PTY0MDtkeD0wO2NoPTM2MDtkeT0wO3c9MzkyO2g9MzA4O2NyPTE7YXBwaWQ9eXRhY2h5b24-/https://s.yimg.com/os/creatr-images/GLB/2017-04-08/835a03b0-1c2d-11e7-b10b-854e696bbcc8_download-8-.png");
			URLConnection conn = url.openConnection();
			conn.connect();
			InputStream in = conn.getInputStream();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.png"));
			BufferedInputStream bin = new BufferedInputStream(in);
			byte[] buf = new byte[4096]; int len;
			while ( (len = bin.read(buf)) != -1){
				bout.write(buf, 0, len);
			}
			bin.close();
			bout.flush();
			bout.close();

			System.out.println("OK");
			
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}

}
