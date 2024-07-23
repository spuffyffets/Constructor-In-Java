package constructor;

public class std1 {

	private int rollno;
    private String name;
    private String address;
    
    public std1 ( int rollno, String name, String address) {
    	 this.rollno=rollno;
    	 this.name=name;
    	 this.address=address;
    	 }
    public void dispalyinfo() {
    	System.out.println(rollno);
    	System.out.println(name);
    	System.out.println(address); 
    	System.out.println();
    }
    

}
