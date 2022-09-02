import java.util.*;
 
class name{
   public name()
   {
	System.out.println("Bachelors Month Expenses ");
	System.out.println(" ");
	 
   }
}
class January extends name{
   public January()
   {   System.out.println("The January Month Expenses are: "); 
	   System.out.println("Groceries:2000");
	   System.out.println("Transport:1500");
	   System.out.println("Shopping:3000");
	   System.out.println("Hostel rent:4000");
	   System.out.println(" ");
	
	   
	} 
}
 class February extends January {
   public February()
   {	System.out.println("The February Month Expenses are: "); 
	 
	   System.out.println("Groceries:2500");
	   System.out.println("Transport:2000");
	   System.out.println("Shopping:1000");
	   System.out.println("Hostel rent:5000"); 
		System.out.println(" ");
	   
	} 
}

 class March extends February {
   public March()
   {
	   System.out.println("The March Month Expenses are: "); 
	   System.out.println("Groceries:1500");
	   System.out.println("Transport:1000");
	   System.out.println("Shopping:2000");
	   System.out.println("Hostel rent:6000");
	   System.out.println(" ");
	   
	   
	} 
}
class April extends  March{
   public April()
   {
	   
	   System.out.println("The April Month Expenses are: "); 
	 
	   System.out.println("Groceries:1500");
	   System.out.println("Transport:1000");
	   System.out.println("Shopping:2000");
	   System.out.println("Hostel rent:6000");
	  System.out.println(" ");
	   
	   
	} 
}
class May extends  April{
   public May()
   {
	   
	   System.out.println("The May Month Expenses are: "); 
	   System.out.println("Groceries:1500");
	   System.out.println("Transport:1000");
	   System.out.println("Shopping:2000");
	   System.out.println("Hostel rent:6000");
	   System.out.println(" ");
	   
	   
	} 
}
class June extends  May{
   public June()
   {
	   
	   System.out.println("The June Month Expenses are: "); 
	 
	   System.out.println("Groceries:1500");
	   System.out.println("Transport:1000");
	   System.out.println("Shopping:2000");
	   System.out.println("Hostel rent:6000");
	  
	   System.out.println(" ");
	   
	   
	} 
}
class July extends  June{
   public July()
   {
	   
	   System.out.println("The July Month Expenses are: "); 
	 
	   System.out.println("Groceries:1500");
	   System.out.println("Transport:1000");
	   System.out.println("Shopping:2000");
	   System.out.println("Hostel rent:6000");
	   System.out.println(" ");
	   
	   
	} 
}
class August extends  July{
   public August()
   {
	   System.out.println("The August Month Expenses are: "); 
	 
	    System.out.println("Groceries:1500");
	   System.out.println("Transport:1000");
	   System.out.println("Shopping:2000");
	   System.out.println("Hostel rent:6000");
	   System.out.println(" ");
	   
	   
	} 
}
class September extends  August{
   public September()
   {
	   
	   System.out.println("The September Month Expenses are: "); 
	 
	   System.out.println("Groceries:1500");
	   System.out.println("Transport:1000");
	   System.out.println("Shopping:2000");
	   System.out.println("Hostel rent:8000");
	 
	   System.out.println(" ");
	   
	   
	} 
}
class October extends  September{
   public October()
   {
	   
	   System.out.println("The October Month Expenses are: "); 
	 
	   System.out.println("Groceries:1500");
	   System.out.println("Transport:1000");
	   System.out.println("Shopping:2000");
	   System.out.println("Hostel rent:6000");
	   System.out.println(" ");
	   
	   
	} 
}
class November extends  October{
   public November()
   {
	   
	   System.out.println("The November Month Expenses are: "); 
	 
	   System.out.println("Groceries:1500");
	   System.out.println("Transport:1000");
	   System.out.println("Shopping:4000");
	   System.out.println("Hostel rent:6000");
	   System.out.println(" ");
	   
	   
	} 
}


public class December extends November{
   public December()
   {
	  System.out.println("The December Month Expenses are: "); 
	
   }
   public void expanses()
   {
		System.out.println("Groceries:1000");
	   System.out.println("Transport:1500");
	   System.out.println("Shopping:3000");
	   System.out.println("Hostel rent:6000");
		System.out.println(" ");
	  
   }
   
   public static void main(String args[])
   {
	  int a,Groceries,Transport,Shopping,Hostelrent;
		December obj1=new December();
		obj1.expanses();
		Groceries =(2000+2500+1500+1500+1500+1500+1500+1500+1500+1500+1500+1000); 
		Transport=(1500+2000+1000+1000+1000+1000+1000+1000+1000+1000+1000+1500);
		Shopping=(3000+1000+2000+2000+2000+2000+2000+2000+2000+2000+4000+3000);
		Hostelrent=(4000+5000+6000+6000+6000+6000+6000+6000+6000+6000+6000+6000);
		a=(Groceries+Transport+Shopping+Hostelrent );
		
		System.out.println("The Total Annual Expenses are:  " + a);
		
		
		
	 
   }
}