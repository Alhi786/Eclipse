package basics;

class Person
{
	public void getFirstname()
	{
		
	}
	public void getLastname()
	{
		
	}
}
class Employeee extends Person
{
	public void getEmployeeId()
	{
		
	}
	@Override
	public void getLastname() 
	{
		String employeejob="Tester";
		System.out.println("Employee job title is : "+employeejob);
	}
	
}

public class Persondetails {

	public static void main(String[] args) 
	{
		Employeee em=new Employeee();
		em.getLastname();

	}

}
