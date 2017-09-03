import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {

		Scanner rad = new Scanner(System.in);
		double radius=0.0;
		
		while(true) {
			
		System.out.print("Enter the radius: ");
		if(rad.hasNext())
			radius = rad.nextDouble();
		else System.exit(0);

		double area = Math.PI * Math.pow(radius, 2);

		System.out.println("Area of circle of radius " + radius + " is " + area);
		 
		} 
	}
}
