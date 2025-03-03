package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int age;
	public Student() {
		
	}
	public Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		return this.id-o.id;
	}
	
	
}
public class Exp5 {
	
public static void main(String[] args) {
	List<Student> stdlist=new ArrayList<>();
	stdlist.add(new Student(5,"King",33));
	stdlist.add(new Student(3,"Rohith",35));
	stdlist.add(new Student(4,"Rahul",29));
	stdlist.add(new Student(1,"Rinku",21));
	stdlist.add(new Student(2,"Jaiswal",19));
	System.out.println("before sorting student data");
	stdlist.forEach(std->System.out.println("ID : "+std.getId()+" Name : "+std.getName()+" Age : "+std.getAge()));
	
//java 8 new features stream API
	List<Student> frmtData=stdlist.stream().sorted(Comparator.comparing(Student :: getName)).collect(Collectors.toList());
	System.out.println("after sorting the data");
	//System.out.println(frmtData);
	frmtData.forEach(std->System.out.println("ID : "+std.getId()+" Name : "+std.getName()+" Age : "+std.getAge()));
	stdlist.stream()
	.filter(cst -> cst.getName().startsWith("R"))
	.forEach(dt -> System.out.println(dt));
	

		/*Student std=new Student();
		std.getId();*/
	
	
}
}
