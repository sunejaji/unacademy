class Employee{  // class 1
 float salary=90000;  
}  
class Programmer extends Employee{    // class 2
 int bonus=15000;  
 public static void main(String args[]){  
   Programmer p=new Programmer();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}  