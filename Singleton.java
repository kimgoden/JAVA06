package project07;

public class Singleton {
private Singleton () {}
	private static Singleton s = new Singleton ();
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
	private String field;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	
	
}