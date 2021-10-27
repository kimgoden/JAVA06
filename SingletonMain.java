package project07;

public class SingletonMain {
public static void main(String[] args) {
	//Singleton s= new Singleton();
	Singleton s = Singleton.getInstance();
	
	s.setField("æ»≥Á«œººø‰");
	
	
	System.out.println(s.getField());
	Singleton s2 = Singleton.getInstance();
	System.out.println(s2.getField());
}
}
