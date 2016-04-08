import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Term term=new Term();
		
	
		LinkedList Polynomial1 = new LinkedList(3,2,1,1,4,0);
		LinkedList Polynomial2 = new LinkedList();
		
		LinkedList list1=new LinkedList();
		LinkedList list2=new LinkedList();
		LinkedList addedlist=new LinkedList();
		LinkedList subtractlist=new LinkedList();
		LinkedList multiplylist=new LinkedList();
		
		list1=Polynomial1.Hardcoded();
		System.out.println("Polynomial 1: ");
		Polynomial1.print(list1, 0);
		
		System.out.println("Please enter the term Cooficient,Exponent of the 2nd polynomial(Seprated by Commas no spaces ))");
		list2 = term.initiate();
		System.out.print("\nPolynomial 2: ");
	      Polynomial2.print(list2, 0);
	      
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("\nEnter an integer value for variable  X  to evaluate the resulting polynomial: ");
	      int x = scanner.nextInt();
	      

		
		System.out.println("Polynomial1+Polynomial2:");
		addedlist=Polynomial1.Add(list1, list2);
		Polynomial1.print(addedlist, 5);
		
		System.out.println("Polynomial1-Polynomial2:");
		subtractlist=Polynomial1.subtract(list1, list2);
		Polynomial2.print(subtractlist, 8);
		
		System.out.println("Polynomial1*Polynomial2:");
		multiplylist=Polynomial1.multiply(list1, list2);
		Polynomial2.print(multiplylist, 2);
		
	}

}
