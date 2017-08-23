package javabyexample.basic;

public class SwapFirstNameLastName {

	public static void main(String[] args) {
		String name = "Will Smith";
		System.out.println("Name before Swap: " + name);
		String firstName = name.substring(0, name.indexOf(" ")); // beginning until you find space
		String lastName = name.substring(name.indexOf(" ")); // return location of where you have space until the end
		String swappedName = lastName + ", " + firstName;
		System.out.println("Swapped Name:" + swappedName);

	}

}
