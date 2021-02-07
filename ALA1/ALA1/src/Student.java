
public class Student extends Person // subclass Student from Person

{
	// set parameter for additional variables
	private int ID;
	private String major;
	private double gpa;
	
	// default constructors
	public Student()
	{ super ();// get variable from base class
		ID=0; 
		major="none";
		gpa=0.0;
		
	}
	//second constructors
	public Student (String name, String address, String phone, String email,int ID, String major, double gpa) {
		super(name,address,phone,email); 
		this.ID=ID;
		this.major= major;
		this.gpa =gpa;
		}
		//getter
		public int getID() {
			return ID;
			
		}
		public String getMajor() {
			return major;
			
		}
		public double getGPA() {
			return gpa;
			
		}
		// setter
		public void setID(int ID) {
			this.ID=ID;
		}
		public void setMajor (String major) {
			this.major=major;
		}
		public void setGPA(double GPA) {
			this.gpa=gpa;
		}
		
		// toString
		public String toString() {
			String out= super.toString();
			String student=String.format("ID: "+ID +"\n"
					+ "Major: "+major +"\n"
					+ "GPA: "+gpa+"\n"
					);
			
			return out+student;
		}

		}

	
		

