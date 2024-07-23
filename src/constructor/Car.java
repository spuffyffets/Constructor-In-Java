package constructor;

class Car2{
	String Carname;String model;int year;
	 
	 public Car2(String Carname,String model,int year) {
		 this.Carname=Carname;
		 this.model=model;
		 this. year=year;
		 
	 }
	public void display() {
		System.out.println("Carname:"+Carname); 
		System.out.println("model:"+model);
		System.out.println("year:"+year);
		
		
	}
}

