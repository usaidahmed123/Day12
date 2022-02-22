package day12;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st example
		String n = "Welcome";
		System.out.println("Print n :\t"+n);
		
		
		//2nd ex:
		String ne = new String("Greetings\n");
		System.out.println("Print ne :\t"+ne);
		
		
		//3rd ex:
		String O = "Smile";
		String M = "Smile";
		if (M==n)
		{
			System.out.println("Comparing M and n :\t");
			System.out.println("it is same");
		}
		else
		{
			System.out.println("Comparing M and n :\t");
			System.out.println("u r different\n");
		}
		
		
		if (M==O)
		{
			System.out.println("Comparing M and O :\t");
			System.out.println("it is same\n");
		}
		else
		{
			System.out.println("u r different\n");
		}
		
		
		
		//another method for comparing
		System.out.println("Comparing M and O :\t\n"+M.equals(O));
		
		
		
		
		//concatenating two words
		String a = "hello";
		String b = "boss";
		System.out.println("\nConcat two strings a and b : "+a.concat(b));
		
		
	}

}
