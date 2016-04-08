//This class makes polynomialterm nodes


public class TermNode {
	
	protected int Cooficient;
	protected int Exponent;
	protected TermNode next;
	
	
	public TermNode(int c,int e,TermNode n)//Initializing exponent,Cooficient,and next term node
	{
		Cooficient=c;
		Exponent=e;
		next=n;
	}
	
	
	public int getExponent() {
		return Exponent;
	}
	
	public void setExponent(int Exponent) {
		this.Exponent = Exponent;
	}
	
	public int getCooficient()
	{
		return Cooficient;
	}
	
	
	public void setCooficient(int Cooficient)
	{
		this.Cooficient=Cooficient;
	}
	
	public TermNode getNext() {
		return next;
	}
	
	public void setNext(TermNode next) {
		this.next = next;
	}
	
	
	

}
