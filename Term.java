// this class makes polynomialterms

import java.util.Scanner;
import java.util.StringTokenizer;
public class Term {

	
	protected int Exponent;
	protected int Cooficient;
    int size=0;
	
    public Term()//default Construtor
    {
    	
    }
	public Term(int c,int e,int s)   //constructor that accepts exponent and cooficient and size
	{
		Exponent=e;
		Cooficient=c;
		size=s;
	}
	
	public LinkedList initiate()
	{
		
	   LinkedList userInput= new LinkedList();
	   int size=0;
	   Scanner input = new Scanner(System.in); //user input for the second polynomial
	   String line=input.nextLine();
	
     	//tokenize the string using the delimeter
	   StringTokenizer tokenizer=new StringTokenizer(line, ",");
	   String token=tokenizer.nextToken();
	   Cooficient=Integer.parseInt(token);
	
	    token=tokenizer.nextToken();
	    Exponent=Integer.parseInt(token);
	    userInput.Append(Cooficient, Exponent, size);
         size++;
         while(tokenizer.hasMoreTokens()) {    
             
             token = tokenizer.nextToken();
             Cooficient = Integer.parseInt(token);
          
             token = tokenizer.nextToken();
             Exponent = Integer.parseInt(token);
          
             userInput.Append(Cooficient, Exponent, size);
             size++;
       }
       
       return userInput;
    }

	//getters and setters for cooficient and exponent
	
	public int getExponent() {    
		return Exponent;
	}

	public void setExponent(int exponent) {
		Exponent = exponent;
	}

	public int getCooficient() {
		return Cooficient;
	}

	public void setCooficient(int cooficient) {
		Cooficient = cooficient;
	}


	public String toString()  //return cooficient and exponent of the term
	{
		if(getExponent()>0)
		{
		   return Cooficient+"x"+"^"+Exponent;
		}
		else
		{
			return Cooficient+" ";
		}
	}
	
}
