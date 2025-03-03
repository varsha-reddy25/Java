package test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int age;
	private String gender;
	private int year;
	private double salary;

	public Employee() {
		
	}

public Employee(int id,String name,int age,String gender,int year,double salary) {
	this.id=id;
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.year=year;
	this.salary=salary;
}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", year=" + year + ", salary="
				+ salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.id-o.id;
	}
}



public class Exp12 {
public static void main(String[] args) {
	List<Employee> emplist=new ArrayList<>();
	emplist.add(new Employee(5,"King",33,"male",2019,35000.0));
	emplist.add(new Employee(10,"Queen",30,"female",2021,3000.0));
	emplist.add(new Employee(3,"Rohith",39,"male",2020,13000.0));
	emplist.add(new Employee(4,"sheela",23,"female",2022,9000.0));
	emplist.add(new Employee(2,"sita",28,"female",2023,39000.0));
	emplist.add(new Employee(10,"Queen",30,"female",2021,3000.0));
	emplist.add(new Employee(8,"Dhoni",29,"male",2022,13000.0));
	emplist.add(new Employee(7,"Jaiswal",35,"male",2020,18000.0));
	emplist.add(new Employee(9,"swetha",26,"female",2022,19000.0));
	emplist.add(new Employee(1,"ram",25,"male",2023,79000.0));
	System.out.println("before sorting employee data");
	
	emplist.forEach(emp->System.out.println("ID : "+emp.getId()+" Name : "+emp.getName()+" Age : "+emp.getAge()+" Gender : "+emp.getGender()+" year : "+emp.getYear()+" salary :"+emp.getSalary()));
	System.out.println("after sorting the employee data");

	List<Employee> frmtData=emplist.stream().sorted(Comparator.comparing(Employee :: getId)).collect(Collectors.toList());
	frmtData.forEach(emp -> 
	System.out.println
	("ID : "+emp.getId()+" Name : "+emp.getName()+" Age : "+emp.getAge()+" Gender :"+emp.getGender()+" year :"+emp.getYear()+" salary :"+emp.getSalary()));
	emplist.stream()
	.filter(emp -> emp.getName().startsWith("s"))
	.forEach(dt -> System.out.println(dt));
	System.out.println("sorted after year 2020");
	emplist.stream()
	.filter(emp -> emp.getYear()>(2020)).
	forEach(dt -> System.out.println(dt));
	System.out.println("distinct rows");
	/*emplist.stream()
	.filter(emp -> emp.getName().startsWith("R")).distinct().
	forEach(dt -> System.out.println(dt));*/
	List<String> name=emplist.stream().filter(emp->emp.getName().length()>=5).map(emp->emp.getName()).toList();
name.stream().distinct().forEach(emp->System.out.println(emp));
System.out.println(emplist.stream().filter(emp->emp.getName().length()>=5).count());
}
}

