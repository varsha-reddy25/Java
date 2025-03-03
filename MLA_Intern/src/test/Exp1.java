package test;
class Dog{
	public Dog(){
		System.out.println("default");
	}
	public Dog(String msg) {
		System.out.println("single string msg");
	}
}
class Fox extends Dog{
	public Fox() {
		super("Hello");
	
		System.out.println("hello");
	}
}
public class Exp1 {
public static void main(String[] args) {
	Fox obj =new Fox();
	
}
}
