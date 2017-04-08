package tw.org.iii.java2003;

import java.io.Serializable;

public class Student implements Serializable {
	private int ch, math, eng;
	private String name;
	public Student(String name, int ch, int math, int eng){
		this.name = name; this.ch = ch; this.math = math; this.eng = eng;
	}
	double sum(){return ch + math + eng;}
	double avg(){return sum()/3;}
}
