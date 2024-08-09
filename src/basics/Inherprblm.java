package basics;

class Member
{
	String name;
	int age;
	long phoneno;
	String address;
	long salary;
	
	public void printdetails()
	{
		System.out.println("name"+name);
		System.out.println("age"+age);
		System.out.println("phoneno"+phoneno);
		System.out.println("address"+address);
		System.out.println("salary"+salary);
	}
}
class Employee extends Member
{
	String specialization;
}
class Manager extends Member
{
	String department;
}
public class Inherprblm {

	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.name="abcde");
		System.out.println(e.age=27);
		System.out.println(e.phoneno=98779900);
		System.out.println(e.address="kochi");
		System.out.println(e.salary=40000);
		System.out.println(e.specialization="tester");
		Manager m=new Manager();
		System.out.println(m.department="IT");
		

	}

}
