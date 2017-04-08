package tw.org.iii.java2003;

public class OCJP048 {

	public static void main(String[] args) {
		int[] x = {1,2,3};
		int y[] = {4,5,6};
		new OCJP048().go(x,y);
	}

	void go(int[] ... z){
		// z => int[]  [] => {{1,2,3},{4,5,6}}
		for (int[] a : z){
			System.out.println(a[0]);
		}
	}
}
