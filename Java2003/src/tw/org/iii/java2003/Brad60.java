package tw.org.iii.java2003;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Brad60 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir1/brad.object"));
			Object obj1 = oin.readObject();
			oin.close();
			Student s1 = (Student)obj1;
			System.out.println(s1.sum());
			System.out.println(s1.avg());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
