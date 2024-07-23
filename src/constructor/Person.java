package constructor;

public class Person {
    private String name;
    private int age;

    
    public Person(String name, int age) {
         
          this.name = name;
         
           this.age = age; 
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        
        Person person1 = new Person("suchit", 21);
        
        
          person1.display();

        
        Person person2 = new Person("mohit", 21);
              person2.display();
    }
}