
public class Faculty extends Employee // subclass faulty from base class Employee

{
	// set parameter
	private String rank;
	
	// default constructors
	public Faculty()
	{ super ();
		rank="none";
		
		
	}
	// second constructors
	public Faculty (String name, String address, String phone, String email,int ID, String title, String anual_salary,String rank) {
		super(name,address,phone,email,ID,title,anual_salary);
		this.rank=rank;
		
		}
		//getter
		public String getRank() {
			return rank;
			
		}
		
		// setter
		public void setRank(String rank) {
			this.rank=rank;
		}
		
		public String toString() {
			String out= super.toString();
			String faculty=String.format("Rank: "+rank+"\n");
			
			return out+faculty;
			
		}
}
