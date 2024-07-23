package constructor;

public class student2 {
public static void main(String[] args) {
	student s =new student("suchit",10001,10,56,45,78);
	student s1 =new student("mohit",10234,10,59,70,58);
	student s2 =new student("papa ki pari",19803,10,96,65,88);
	
	
	
	
	System.out.println("suchit  Total Marks: " + s.total());
    
	System.out.println("suchit Percentage: " + s.percent());
 
    
    
    System.out.println("mohit Total Marks: " + s1.total());
    
    System.out.println("mohit Percentage: " + s1.percent());

    
    
    System.out.println("papa ki pari Total Marks: " + s2.total());
    
    System.out.println("papa ki pari Percentage: " + s2.percent());


	
}
}
