package test;
import java.util.Scanner;
public class TestException {
public static void main(String[] args) throws Exception{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter age");
	int age=sc.nextInt();
	AgeValidator obj =new AgeValidator();
	obj.CheckAge(age);
	Thread t1 =new Thread();
	t1.setDaemon(true);
}
}
