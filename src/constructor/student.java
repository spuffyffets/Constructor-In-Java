package constructor;

class student {
	String name;
	int id; 
	int std, sub1, sub2,sub3;
	
	public student(String name,int id,int std,  int sub1, int sub2, int sub3) {
		this.name=name;
		this.id=id;
		this.std=std;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		 
	}
	public int total() {
		int t=sub1+sub2+sub3;
		return t;
	}
	public double percent() {
		
		return(total()/3.0);
		
		
		
	}

}
