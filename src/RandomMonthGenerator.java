
public class RandomMonthGenerator {

	public static void main(String[] args) {
		
		int randNum = (int)(Math.ceil(Math.random()*12));
		String month = "";
		
		System.out.println("The random number generated is: " + randNum);
		
		switch(randNum) {
		case 1:  month = "January"; 
				 break;
		case 2:  month = "February"; 
				 break;
		case 3:  month = "March"; 
				 break;
		case 4:  month = "April"; 
				 break;
		case 5:  month = "May";
				 break;
		case 6:  month = "June";
				 break;
		case 7:  month = "July";
				 break;
		case 8:  month = "August";
				 break;
		case 9:  month = "September";
				 break;
		case 10: month = "October";
				 break;
		case 11: month = "November";
				 break;
		case 12: month = "December";	
				 break;
		}
		
		System.out.println("The month corresponding to that is " + month);
	}

}
