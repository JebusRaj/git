import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Wwe{
	//list without generics
	public void list() {
			List<Object> list = new ArrayList<Object>();
			list.add("ROCK");
			list.add("STONE COLD");
			list.add(10);
			list.add(true);
			int num = 10;
			list.add(num);
			String wrestler =  (String) list.get(1);
			System.out.println(wrestler);
			Iterator i = list.iterator();
			while(i.hasNext()) {
				 System.out.println("WRESTLERS:" +i.next());
			}

	}
	//list using generics
	public void genericsList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(22);
		System.out.println(list);
	}
	//set without generics
	public void set() {
		Set number = new HashSet();
		number.add(1);
		number.add(1);
		System.out.println(number);
		
	}
	//set with generics
	public void genericSet() {
		Set<String> number = new HashSet<String>();
		number.add("JEBUS");
		number.add("JEBUS");
		System.out.println(number);
	}
	//map 
	public void map() {
		Map<Integer,String> number =new HashMap<Integer,String>();
		number.put(1,"JEBUS");
		number.put(2,"RAJ");
		number.put(3,"JEBUS");
		System.out.println(number);
		
	}
	
	

}
