// this class will link the term nodes making linked list


public class LinkedList {

	TermNode head;
	int x,y,z;
	int x1,y1,z1;
	
	public LinkedList()
	{
	   head=new TermNode(x,x1,null);//first node of the linked list should always be head which has next address of null because its the only node there.
	}
	
	public LinkedList MakeLinkedList() //constructor that makes new Linked List and appends the other term nodes to make a Linked List
	{
		int size=0;
		LinkedList list1 = new LinkedList();
		
		list1.Append(x, x1, size);
		size++;
		list1.Append(y, y1, size);
		size++;
		list1.Append(z, z1, size);
		size++;
		
		return list1;
	}
	

	public LinkedList(int x,int x1,int y,int y1,int z,int z1)//to make polynomials linked list
	{
		this.x=x;
		this.x1=x1;
		
		this.y=y;
		this.y1=y1;
		
		this.z=z;
		this.z1=z1;
	}

	public void Append (int coof,int exp,int size) //appends termNode in the end of the Linked List
	{
		TermNode Current=head;
		TermNode n = new TermNode (coof,exp,null);
		
		if (size==0)
		{
		  head=n;  
		}
		else
			while(Current.getNext()!=null)
		{
			Current=Current.getNext();
		}
		Current.setNext(n);
	}

   public boolean isEmpty() //if head is null return true
   {
	   return (head==null);
   }
   
   public LinkedList Hardcoded() {         
	      int size = 0;
	      LinkedList list = new LinkedList();
	      
	      list.Append(x, x1, size);
	      ++size;
	      list.Append(y, y1, size);
	      ++size;
	      list.Append(z, z1, size);
	      
	      return list;
	   }
	   

   
		
   public LinkedList Add(LinkedList a,LinkedList b)  //Add Method which adds two linked lists
   {
   	
   	   int size=0;
   	   LinkedList Sumlist=new LinkedList();
   	
       TermNode Current1=a.head;
   	   TermNode Temp1=Current1;
   	
   	   TermNode Current2=b.head;
   	   TermNode Temp2=Current2;
   	
   	   while(Current1!= null)
   	  {
   		  int count=0;
   		  while(Current2!=null)
   		  {
   			 if(Current1.getExponent()==Current2.getExponent())
   			 {
   				int addCooef=Current1.getCooficient()+Current2.getCooficient();
   				Sumlist.Append(addCooef, Current1.getExponent(), size);
   				size++;
   				count++;
   			  }
             Current2=Current2.getNext();
   		   }
            if (count==0)
            {
            	Sumlist.Append(Current1.getCooficient(), Current1.getExponent(), size);
            	size++;
            }
            Current1=Current1.getNext();
            Current2=Temp2;
   	  }
        Current1=Temp1;
        Current2=Temp2;
        
        while(Current2 != null) {
            int count = 0;
            
            while(Current1 != null) {
               if(Current2.getExponent() == Current1.getExponent()) {
                  count++;
               }
               Current1 = Current1.getNext();
            }
            
            if(count == 0) {
               Sumlist.Append(Current2.getCooficient(), Current2.getExponent(), size);
               size++;
            }            
            Current2 = Current2.getNext();
            Current1 = Temp1;
         }  
    
         return Sumlist;
      } 
    
   public LinkedList subtract(LinkedList a, LinkedList b) {
	      
	      int size = 0;
	      LinkedList subtractlist = new LinkedList();
	      
	      TermNode Current1 = a.head;
	      TermNode temp1 = Current1;
	      
	      TermNode Current2 = b.head;
	      TermNode temp2 = Current2;
	      
	      
	      while(Current1 != null) {
	         int count = 0;
	         while(Current2 != null) {
	            if(Current1.getExponent() == Current2.getExponent()) {

	               int subtractCoef = Current1.getCooficient() - Current2.getCooficient();
	               subtractlist.Append(subtractCoef, Current1.getExponent(), size);
	               size++;
	               count++;
	            }
	            Current2 = Current2.getNext();
	         }
	         
	         if(count == 0) {
	            subtractlist.Append(Current1.getCooficient(), Current1.getExponent(), size);
	            size++;
	         }
	            
	         Current1 = Current1.getNext();
	         Current2 = temp2;
	      }
	       
	      Current1 = temp1;
	      Current2 = temp2;
	      
	      while(Current2 != null) {
	         int count = 0;
	         
	         while(Current1 != null) {
	            if(Current2.getExponent() == Current1.getExponent()) {
	               count++;
	            }
	            Current1 = Current1.getNext();
	         }
	         
	         if(count == 0) {
	            subtractlist.Append(-Current2.getCooficient(), Current2.getExponent(), size);
	            size++;
	         }            
	         Current2 = Current2.getNext();
	         Current1 = temp1;
	      }  
	 
	      return subtractlist;
	   }
	   
	   
	   public LinkedList multiply(LinkedList a, LinkedList b) {
	      LinkedList multiplylist = new LinkedList();
	      
	      
	      int size = 0;
	      int multCoef;
	      int multExp;
	      
	      TermNode Current1 = a.head;
	      
	      TermNode Current2 = b.head;
	      TermNode temp2 = Current2;
	           
	      while(Current1 != null) {

	         while(Current2 != null) {
	               multExp = Current1.getExponent() + Current2.getExponent();
	               multCoef = Current1.getCooficient() * Current2.getCooficient();
	               multiplylist.Append(multCoef, multExp, size);
	               size++;
	            
	            Current2 = Current2.getNext();
	         }
	         
	         Current1 = Current1.getNext();
	         Current2 = temp2;
	      }

	      multiplylist = merge(multiplylist);
	      return multiplylist;
	   }
	   
	   
	   public static LinkedList merge(LinkedList list) {
	      TermNode temp1 = list.head;

	      while (temp1 != null) {
	          TermNode iter = temp1; 
	          TermNode temp2 = iter.getNext();
	          
	          while (temp2 != null) {
	              if (temp1.getExponent() == temp2.getExponent()) 
	            	  { 
	            		temp1.Cooficient += temp2.Cooficient;
	            	  
	                       //removing temp2 form the source list
	                      iter.next = temp2.next;
	            	  }
	              iter = iter.getNext();
	              temp2 = iter.getNext();
	          }
	          temp1 = temp1.getNext();
	      }

	      return list;
	   }
	   
	   
	   public void print(LinkedList list, int x) {
	      int result = 0;
	      TermNode n = list.head;
	      System.out.print(n.getCooficient() + "X^" + n.getExponent() + " + ");
	      result = (int) (result + (n.getCooficient() * Math.pow(x, n.getExponent())));
	      
	      String plus = "";
	      
	      while(n.getNext() != null) {
	         if (n.getNext().getNext() != null)
	            plus = " + ";
	         else
	            plus = "";
	         
	         n = n.getNext();
	         System.out.print(n.getCooficient() + "X^" + n.getExponent() + plus);
	         result = (int) (result + (n.getCooficient() * Math.pow(x, n.getExponent())));
	      }
	      if(x != 0)
	         System.out.println("\nWhen X = " + x + " , the value is = " + result);
	      
	      System.out.println();
	   }
	   
	   
	}


