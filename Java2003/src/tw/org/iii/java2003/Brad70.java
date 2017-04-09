package tw.org.iii.java2003;

public class Brad70 {
	public static void main(String[] args) {
	}
}
interface Brad701 {
	public void m1();
}
interface Brad702 {
	public void m2();
}
interface Brad703 extends Brad701 {
	public void m1(int a);
	public void m3();
}
interface Brad704 extends Brad701, Brad702 {
	public void m3();
}
class Brad705 implements Brad703 {
	public void m1(){}
	public void m1(int a){}
	public void m3(){}
}
class Brad706 implements Brad704 {
	public void m1(){}
	public void m2(){}
	public void m3(){}
}
class Brad707 extends Brad705 {
	public void m1(){}
}


