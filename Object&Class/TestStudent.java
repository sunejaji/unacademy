class Student{  
     int id;  
     String name;  
}  

//Creating another class TestStudent1 which contains the main method  
class TestStudent{  
     public static void main(String args[]){  
      Student s1=new Student(); 
 s1.id=1;
  s1.name="ajay";  
      System.out.println(s1.id);  
      System.out.println(s1.name);  
 }  
}  