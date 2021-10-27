package project07;

public class Exam02Main {
public static void main(String[] args) {
	project07.Exam02 ex1= new project07.Exam02();
	project07.dto.Exam02 ex2 = new project07.dto.Exam02();
	
	System.out.println("public" + ex1.field1);
	System.out.println("public" + ex1.field2);
	System.out.println("public" + ex1.field3);
	
	ex1.method1();
	ex1.method2();
    ex1.method3();
    
    System.out.println("public" + ex2.field1);
	System.out.println("public" + ex2.field2);
	System.out.println("public" + ex2.field3);
	
	ex2.method1();
	ex2.method2();
    ex2.method3();
}
}
