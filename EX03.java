package project07;

public class EX03 {
private EX03() {}
	private String id;
	private int pwd;
	private String name;
	private int number;
	
	EX03 (String id, String name, int pwd, int number) {
		this.id =id;
		this.name = name;
		this.number = number;
		this.pwd = pwd;
	}
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getPwd() {
		return pwd;
	}


	public void setPwd(int pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	
	


	public void info() {
		System.out.println("이름 : "+this.name);
		System.out.println("전화번호 : "+this.number);
	
		
	}

	
}	
