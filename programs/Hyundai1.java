class Car{
   public Car()
   {
	System.out.println("Cars and Specification");
	System.out.println(" ");
   }
}
class Maruti extends Car{
   public Maruti()
   {
	System.out.println("Car Brand: Maruti");
	System.out.println("Color: Red");
	System.out.println("FuelType:petrol");
	System.out.println("EngineType:v6 engine");
	System.out.println(" ");
   } 
}
 class Ford extends Maruti{
   public Ford()
   {
	System.out.println("Car Brand:Ford ");
	System.out.println("Color: Black");
	System.out.println("FuelType:Petrol");
	System.out.println("EngineType:v6 engine");
	System.out.println(" ");  
   } 
}

 class Toyota extends Ford {
   public Toyota()
   {
	System.out.println("Car Brand:Toyota ");
	System.out.println("Color: white");
	System.out.println("FuelType:Petrol");
	System.out.println("EngineType:v6 engine");
	System.out.println(" ");
   } 
}
public class Hyundai1 extends Toyota{
   public Hyundai1()
   {
	System.out.println("Car Brand:Hyundai ");
   }
   public void brand()
   {
	System.out.println("Color: Blue");
	System.out.println("FuelType:Petrol");
	System.out.println("EngineType:v4 engine");
   }
   
   public static void main(String args[])
   {
	 Hyundai1 obj3=new Hyundai1();
	 obj3.brand(); 
   }
}