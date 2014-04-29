import java.util.*;

class methods {

	public static void main(String[] args) {
		int menu = 0;
		
		Scanner Keyboard = new Scanner(System.in);
			System.out.println("Welcome, please the shape you wish to find the area of: ");
			System.out.println("[1]. Circle [2]. Triangle  [3]. Quadilateral ");
			
			
				menu = Keyboard.nextInt();
				switch (menu)
				 
				{
				case 1 :
				System.out.println(" Please enter the radious of the circle");
				circle();
				break;
				
				case 2 :
				System.out.println(" Please enter the height and then the base of the triangle");
				triangle();
					break;
				case 3 :
				System.out.println(" Please enter the length then tha with of the quadilateral");
				quadilateral();
					break;	
				default:
					System.out.println("We are sorry we did not get that." + "\n Thank you for using Jorge Gomez's Java Convertion machine.");
				}
			}
		




public static void triangle()
{
	double a;
	double b;
	double h;
	Scanner Keyboard = new Scanner(System.in);
	b = Keyboard.nextInt();
	h = Keyboard.nextInt();
	a = b*h*.5;
	System.out.println(a);
}

public static void circle()
{
	double a;
	double r;
	Scanner Keyboard = new Scanner(System.in);
	r = Keyboard.nextInt();
	a = 3.1415*r*r;
	System.out.println(a);

}

public static void quadilateral()
{
	double a;
	double b;
	double h;
	Scanner Keyboard = new Scanner(System.in);
	b = Keyboard.nextInt();
	h = Keyboard.nextInt();
	a = b*h;
	System.out.println(a);
}

}

