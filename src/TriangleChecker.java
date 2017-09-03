import java.util.Scanner;

public class TriangleChecker {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		double x_A, y_A, x_B,y_B, x_C, y_C; // Variables to hold coordinates.
		double side_AB, side_BC, side_CA;
		
		System.out.println("Enter the coordinates of three points A, B, and C to determine if they form a triangle.");
		System.out.print("\nEnter X and Y coordinate for Point A, separated by a space: ");
		x_A = cin.nextDouble();
		y_A = cin.nextDouble();
		System.out.print("Enter X and Y coordinate for Point B, separated by a space: ");
		x_B = cin.nextDouble();
		y_B = cin.nextDouble();
		System.out.print("Enter X and Y coordinate for Point C, separated by a space: ");
		x_C = cin.nextDouble();
		y_C = cin.nextDouble();
		
		side_AB = Math.sqrt(Math.pow((x_B-x_A),2) + Math.pow((y_B-y_A),2));
		side_BC = Math.sqrt(Math.pow((x_C-x_B),2) + Math.pow((y_C-y_B),2));
		side_CA = Math.sqrt(Math.pow((x_A-x_C),2) + Math.pow((y_A-y_C),2));
		
		if(side_AB + side_BC > side_CA && side_BC + side_CA > side_AB && side_CA + side_AB > side_BC)
			System.out.println("\nThe points A, B, C form a triangle!");
		else
			System.out.println("\nThe points A, B, C DON'T form a triangle.");
		}

}
