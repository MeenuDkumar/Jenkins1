package encapsulation;

public class Employee {
	private String Name,Desigination;
	private int Salary;
	public void setter(String Name,String Desigination,int Salary)
	{
		this.Name=Name;
		this.Desigination=Desigination;
		this.Salary=Salary;
		
	}
	public void getter()
	{
	System.out.println(Name);	
	System.out.println(Desigination);
	System.out.println(Salary);
	}
}
