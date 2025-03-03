package test;

public class AgeValidator {
public void CheckAge(int age) throws ValidAgeException,InvalidAgeException {
	if(age>=18) {
		ValidAgeException ve = new ValidAgeException("eligible");
		throw(ve);
	}
	else {
		InvalidAgeException iv = new InvalidAgeException("not eligible");
		throw(iv);
	}
}
}
