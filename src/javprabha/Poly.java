package javprabha;

public class Poly {
	private void emp(int i,String s) {
		// TODO Auto-generated method stub
System.out.println(i+s);
	}
private void emp(String s,int i) {
	// TODO Auto-generated method stub
System.out.println(s+i);
}
public static void main(String[] args) {
	Poly p=new Poly();
	p.emp(2, "po");
	p.emp("pl", 0);
}
}
