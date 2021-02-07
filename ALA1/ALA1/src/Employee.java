
public class Employee extends Person// subclass Employee from base class Person

{
	// set parameter for additional variables
	private int ID;
	private String title;
	private String anual_salary;
	
	// default constructors
	public Employee()
	{ super ();
		ID=0;
		title="none";
		anual_salary="none";
		
	}
	// second constructors
	public Employee (String name, String address, String phone, String email,int ID, String title, String anual_salary) {
		super(name,address,phone,email);
		this.ID=ID;
		this.title= title;
		this.anual_salary =anual_salary;
		}
		//getter
		public int getID() {
			return ID;
			
		}
		public String getTitle() {
			return title;
			
		}
		public String getAS() {
			return anual_salary;
			
		}
		// setter
		public void setID(int ID) {
			this.ID= ID;
		}
		public void setTitle (String title) {
			this.title=title;
		}
		public void setAS(String anual_salary) {
			this.anual_salary=anual_salary;
		}
		
		public String toString() {
			String out= super.toString();
			String employee=String.format("ID: "+ID+"\n"
					+ "Title: "+title+"\n"
					+ "Annual Salary: "+anual_salary+"\n"
					);
			
			return out+employee;
			
		
		}
		 

		}

	
		

