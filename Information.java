
public class Information {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("Arish Khan");
		e1.setDesg("Java FullStack");
		e1.setSalary(1200000);
		System.out.println("Employee Id : "+e1.getId());
		System.out.println("Employee Name : "+e1.getName());
		System.out.println("Employee Designation : "+e1.getDesg());
		System.out.println("Employee Salary : "+e1.getSalary());
	}
}
