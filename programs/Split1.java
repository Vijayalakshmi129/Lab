import java.util.Arrays;
import java.util.Comparator;
 
public class Split1 {
   
  static void printArrayString(String str[], int n) 
  
  {
	  
    for (int i = 0; i < n; i++)
    	
      System.out.println(str[i] + " ");
  }
 
   public static void main(String[] args) 
   
   {
	   
    String arr[] = { "Hello","welcome","to","Java"};
    
    int n = arr.length;
 
    Arrays.sort(arr, Comparator.comparing(s->s.length()));
 
    printArrayString(arr, n);
    
  }
   
}