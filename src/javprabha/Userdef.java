package javprabha;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Userdef {
	public static void main(String[] args) {
		Encaps e=new Encaps();
		e.setId(200);
		e.setN("hello");
		
		Encaps e1=new Encaps();
		e1.setId(300);
		e1.setN("welcome");
		List<Encaps> li=new ArrayList<Encaps>();
		li.add(e);
		li.add(e1);
		System.out.println(li.get(0).getN());
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i).getId());
			System.out.println(li.get(i).getN());
			}
		Set<Encaps> s=new HashSet<Encaps>();
		s.add(e);
		s.add(e1);;
		for (Encaps encaps : s) {
			System.out.println(encaps.getId());
			System.out.println(encaps.getN());
		}
		Map<Integer,Encaps> m=new Hashtable<Integer,Encaps>();
		m.put(1, e);
		m.put(2, e1);
		Set<Entry<Integer, Encaps>> entry = m.entrySet();
		for (Entry<Integer, Encaps> entry2 : entry) {
			System.out.println(entry2.getKey());
			System.out.println(entry2.getValue().getId());
			System.out.println(entry2.getValue().getN());
			
		}
		
	}

}
