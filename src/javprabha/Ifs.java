package javprabha;

public class Ifs {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("sql");
		
		StringBuffer s2=new StringBuffer("sql");
		
		 StringBuffer append = s1.append(s2);
		System.out.println(append);
		int i = System.identityHashCode(append);
		System.out.println(i);
		

}}