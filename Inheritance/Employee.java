class Address{
int pinCode;
String city;
String country;

public Address(int pinCode,String city,String country){
this.pinCode=pinCode;
this.city=city;
this.country=country;
}
}
class Employee
{
int id;
String name;
Address adr;  //Entity Refernce 
public Employee(int id,String name,Address adr){
this.id=id;
this.name=name;
this.adr=adr;
}
void display(){
	System.out.println("Id"+id+"Name"+name+"Pin Code"+adr.pinCode+"City"+adr.city);
}

public static void main(String ar[]){
Address adr=new Address(110044,"New Delhi","India");
Employee emp1=new Employee(1,"Ajay Suneja",adr);
emp1.display();
}
}