
public class StringExamples {

	public static void main(String[] args) {
		
		// -----------------------------------------------------------------------------
		// Constructing a new String
		String string1 = "Hello";
		String string2 = new String("Hello");
		
		// -----------------------------------------------------------------------------
		// Concatenation - Java allows us to use the + operator on Strings
		String string3 = string1 + " everyone!";
		//System.out.println(string3);
		
		// other types are implicitly converted to strings during string concatenation
		int age = 13;
		String rating = "PG" + age;
		//System.out.println("rating = " + rating);
		
		// This is sometimes done in debug statements
		//System.out.println("age = " + age);
		
		// String.join
		String string4 = String.join("-", "Java", "is", "cool");
		//System.out.println(string4);
		
		// -----------------------------------------------------------------------------
		// Checking of strings are equals - we use equals method instead of ==
		/*
		System.out.println("string1 == string2: " + (string1 == string2));
		System.out.println("string1.equals(string2): " + string1.equals(string2));
		*/
		
		String string5 = "Hello";
		System.out.println("string1 == string5: " + (string1 == string5));
		
		// we can also ignore case (upper case/lower case)
		String string6 = "hello";
		System.out.println("string5.equals(string6): " + string5.equals(string6));
		System.out.println("string5.equalsIgnoreCase(string6): " + string5.equalsIgnoreCase(string6));
		
		// -----------------------------------------------------------------------------
		// The String API (methods) - String has more than 50 methods
		// Here are some common ones used:
		//  length(); startsWith(); endsWith(); indexOf(); lastIndexOf(); substring();
		//  toLowerCase(); toUpperCase(); trim();
		
		
	}

}
