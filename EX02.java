package project07;

public class EX02 {
private EX02() {}

private int number;
private static EX02 s = new EX02 ();
public static EX02 getInstance() {

	
	return s;
}
public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

}
