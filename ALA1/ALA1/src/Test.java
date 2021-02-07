
public class Test
{

	public static void main(String[] args) // main method 
	{
		Person[] object =new Person[4];// creating 4 objects
		object[0]=new Person("Helen Brown",
				"22 10th Street, Bethlehem",
				"(610)334-2288",
				"hbrown@gmail.com"); // setting information for person
		
		
		object[1]=new Student("Gary Leister",
		          "972 4th Street, Emmaus",
		          "(202)331-7177",
		          "gleister@gmail.com",
		         12345,"CSE",3.50); // setting information for student
		
		
		object[2]=new Employee("Beth Down","234 Main Street, Philadelphia","(610)222-4433","bdown@gmail.com",33442,"Systems Administrator","$75000.00");
		// setting information for employee
	
		object[3]=new Faculty("Mark Jones","21 Orchid Street, Bethlehem","(610)333-2211","mjones@gmail.com",22222,"Faculty","$90000.00","Professor");
		// setting information for faculty
		
		printArray(object);
		object=selectionSort(object);
		printArray(object);
		
	}
	// print 
	public static void printArray(Person[]list) {
		for (int q=0; q<list.length;q++) {
		
		System.out.println(list[q].toString());
	}
	
	}
	// sorting
	public static Person[] selectionSort(Person[]list) {
		for(int i=0;i<list.length-1;i++) {
			int minIndex=i;
			String minName = list [i].getName();
			for (int j=i+1;j<list.length;j++) {
				if (list[j].getName().compareTo(minName)<0) {
					minName=list[j].getName();
					minIndex=j;
				}
			}
			// swap
			Person t =list[i];
			list [i]=list[minIndex];
			list[minIndex]=t;
		}
		// print after sorting 
		System.out.println("\n"+"After sorting");
		return list;
	}
	


}

