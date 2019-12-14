package ArrayListConsepts;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {

		// Employee Class object
		Employee e1 = new Employee("Mourya", 24, "QA");
		Employee e2 = new Employee("abf", 25, "Dev");
		
		// Add ArrayList
		ArrayList ar = new ArrayList();

		ar.add(e1);
		ar.add(e2);

		Iterator<Employee> it = ar.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.Dept);
			

			// addall()
			ArrayList<String> ar5 = new ArrayList<String>();
			ar5.add("hgjfg");
			ar5.add("jdgfj");

			ArrayList<String> ar6 = new ArrayList<String>();
			ar6.add("123");
			ar6.add("4566");

			System.out.println("**********");

			ar5.addAll(ar6);

			for (int all = 0; all < ar5.size(); all++) {
				System.out.println(ar5.get(all));
			}
			System.out.println("**********");

			// Removeall()
			ar5.removeAll(ar6);

			for (int all = 0; all < ar5.size(); all++) {
				System.out.println(ar5.get(all));
			}
			System.out.println("**********");

			//retainAll();
			ArrayList<String> ar7 = new ArrayList<String>();
			ar7.add("123");
			ar7.add("jdgfj");

			ArrayList<String> ar8 = new ArrayList<String>();
			ar8.add("123");
			ar8.add("4566");
			
			ar7.retainAll(ar8);
			for (int all = 0; all < ar7.size(); all++) {
				System.out.println(ar7.get(all));
			}
			
			

		}
	}

}
