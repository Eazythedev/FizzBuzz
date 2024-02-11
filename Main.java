package Main;
/*
public class Main{
	public static void main(String[] args) {
		System.out.println("Konichiwa");
		
	}
}*/

/* I need to:
1. declare a variable for the number 2. use if statements and modulo opp. to check if number is divisble by 3, 5 or both.
3. Use a loop to go through 1 - 100 4. Make it output "Fizz", "Buzz" or "FizzBuzz" depending on the number 5. Organize program
*/

public class Main {
	public static void main(String[] args) {
		// Main2(); (cut) entry point method should be 'main'
		main(); // Now main wants to work?!
	}
	
	public static void main() {
	int i = 1; {
	while (i < 100){
		System.out.println(i);
		i++;
		
		// else if i % 3 == 0; (cut)
		// if number % divisor equals 0
		// else if (i % 3 == 0) && (i % 5 == 0); (cut)
		
		/* This condition needs to come first b/c if it comes last, it wont be executed! */
		if (i % 3 == 0 && i % 5 == 0) {
			System.out.println("Fa Shizzle my Bizzle"); 
		}
		else if (i % 3 == 0) { // Stop putting semicolons on if statements!
			System.out.println("Fizzle");
		}
		else if (i % 5 == 0) {
			System.out.println("Bizzle");
		}
		// else if (i % 3 == 0) && (i % 5 == 0); (cut)
		else if (i % 3 == 0 && i % 5 == 0) {
			System.out.println("Fa Shizzle my Bizzle"); {
			}}
			else {
				System.out.println(i);
			}
			}
		}
	
	{
		// Hope this works
	}
}
	}
