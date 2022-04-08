package javprabha;

public class Encaps {
	private int id;
	private String n;
	public void setId(int id) {
		this.id = id;
	}
	public void setN(String n) {
		this.n = n;
	}
	public int getId() {
		return id;
	}
	public String getN() {
		return n;
	}
	public static void main(String[] args) {
		Encaps e=new Encaps();
		e.setId(100);
		e.setN("hai");
		e.getId();
		e.getN();
		System.out.println(e.getId());
		System.out.println(e.getN());
	
	}

}
