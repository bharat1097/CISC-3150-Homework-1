import java.util.Scanner;

public class CompareTwoCircles {

	public static void main(String[] args) {
		double x1,y1,x2,y2,r1,r2,d;
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Enter center coordinates and radius for Circle 1, separated by a space: ");
		x1 = cin.nextDouble();
		y1 = cin.nextDouble();
		r1 = cin.nextDouble();
		System.out.print("Enter center coordinates and radius for Circle 2, separated by a space: ");
		x2 = cin.nextDouble();
		y2 = cin.nextDouble();
		r2 = cin.nextDouble();
				
		d = Math.pow((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1), 0.5);
		
		System.out.println("Distance between centers, d = " + d);
		System.out.println("r1 + r2 = " + (r1+r2));
		
		if (d > (r1+r2))
			System.out.println("The circles DON'T overlap.");
		else if (d ==(r1+r2))
			System.out.println("The circles touch each other.");
		else if (r1 > r2 && d <= (r1-r2))	
			System.out.println("Circle 2 is inside Circle 1.");
		else if (r2 > r1 && d <= (r2-r1))
			System.out.println("Circle 1 is inside Circle 2");
		else
			System.out.println("There's an overlap between the circles.");
	}

}
