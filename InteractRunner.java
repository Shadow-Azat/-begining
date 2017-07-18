import java.util.*;

public class InteractRunner {

static double x;
	static double y;

	public static void main (String args[]) {

		Scanner reader = new Scanner(System.in);

			Calculator calc = new Calculator();
			String choose;
			question();
			choose = reader.next();
			 while(!choose.equals("5")){
				 
				 System.out.println("Enter the first argument: ");
				 String first = reader.next();
				 double x = Double.valueOf(first);
				 System.out.println("Enter the second argument: ");
				 String second = reader.next();
				 double y = Double.valueOf(second);
				 
				 switch(choose){
				
				 case "1":
					 calc.add(x, y);
					 System.out.println("\n Result is " + calc.getResult());
					 calc.cleanResult();
					 question();
					 choose = reader.next();
				break;
				 
				 case "2":
					 calc.sub(x, y);
					 System.out.println("\n Result is " + calc.getResult());
					 calc.cleanResult();
					 question();
					 choose = reader.next();
				break;
				 
				 case "3":
					 calc.mult(x, y);
					 System.out.println("\n Result is " + calc.getResult());
					 calc.cleanResult();
					 question();
					 choose = reader.next();
				break;
				 
				 case "4":
					 calc.div(x, y);
					 System.out.println("\n Result is " + calc.getResult());
					 calc.cleanResult();
					 question();
					 choose = reader.next();
				break;
				 
				 }
				 
				 			
			 }
			 System.out.println("\nSee you! ");
			reader.close();
			
}
public static void question(){
		 System.out.print("\nChoose your operation: ");
		 System.out.println("\n 1.addiction \n 2.subtraction \n 3.multiplicate \n 4.divide \n 5.exit ");
	}

}




				