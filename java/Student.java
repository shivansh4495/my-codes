// constructor program for Student class

public class Student {  
    //instance variables of the class  
     int id;  
     String name;  
      
     Student(){  
     System.out.println("this a default constructor");  
     }  
      
     Student(int i, String n){  
     id = i;  
     name = n;  
     }  
      
    public static void main(String[] args) {  
    //object creation  
     Student s = new Student();  
     System.out.println("\nDefault Constructor values: \n");  
     System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name); 
     System.out.println("\nParameterized Constructor values: \n");  
     Student s1 = new Student(10, "David");  
     System.out.println("Student Id : "+s1.id + "\nStudent Name : "+s1.name);  
    } 
}  
