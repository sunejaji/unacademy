class Employee{
int id;
String name;
double salary;
void getdata(int i,String n,double s)
{
	id=i;
	name=n;
	salary=s;
}
void displaySalary(){
	System.out.println("Id"+id+"Name"+name+"salary"+salary);
}
}
class NIIT
{
  public static void main(String ar[])
  { 
  Employee obj1=new Employee();
  obj1.getdata(1,"Ajay Suneja",90000);  // Calling 1 
  obj1.displaySalary();  // Calling 2
  }
}