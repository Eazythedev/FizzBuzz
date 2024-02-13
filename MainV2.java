package Main;

public class Main {
	public static void main(String[] args) {
		main(); // Now main wants to work?!
	}
	
	public static void main() {
	int i = 1; {
	while (i < 100){
		System.out.println(i);
		i++;
		
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
  }
}
