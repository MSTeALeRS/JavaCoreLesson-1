package ua.lviv.lgs;

public class Excpt extends Exception {
	String name;
	
	public Excpt(String name) {
		super(name);
		this.name=name;
	}
	
}
