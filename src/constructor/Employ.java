package constructor;

public class Employ {
	String name;
	int id;
	int age;
	float salary;
	long contact_no ;
	
	public Employ(String name,int id,int age,float salary,long contact_no ) {
	
	this. name=name;
	this. id=id;
	this .age=age;
	this. salary=salary;
	this. contact_no =contact_no;
}
	public void display() {
		System.out.println(name); 
		System.out.println(id);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(contact_no);
	System.out.println();
}

}
