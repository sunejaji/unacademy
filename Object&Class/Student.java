 //Defining a Student class.  
class Student{  
 //defining fields  
  int id;//field or data member or instance variable  
  String name;  
 //creating main method inside the Student class  
  public static void main(String args[]){  
   //Creating an object or instance  
  Student obj=new Student();//creating an object of Student  
  //Printing values of the object  
  obj.id=1;
  obj.name="ajay";
   System.out.println(obj.id);//accessing member through reference variable  
   System.out.println(obj.name);  
}  
}  