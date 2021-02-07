
public class Person // base class
{
	//set parameter
private String name;
private String address;
private String phone;
private String email;

// constructors
public Person() {
	name="none";
	address="none";
	phone="none";
	email="none";
	
}
public Person(String name, String address, String phone, String email ) {
this.name=name;
this.address= address;
this.phone= phone;
this.email=email;

}
//getter
public String getName() {
	return name;
	
}
public String getAddress() {
	return address;
	
}public String getPhone() {
	return address;
	
}public String getEmail() {
	return email;
	
}
// setter
public void setName(String name) {
	this.name=name;
}
public void setPhone(String phone) {
	this.phone=phone;
}
public void setAddress(String address) {
	this.address=address;
}
public void setEmail(String email) {
	this.email=email;
}
// toString
public String toString() {
	String out;
	out="Name: "+name ;
	out+="Address: "+address+"\n" ;
	out+="Phone: "+phone+"\n" ;
	out+="Email: "+email +"\n";
	return out;
}

}
