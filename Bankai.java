
import java.util.*;

public class Bankai {
     public static void main(String args[]){
      Scanner sc=new Scanner(System.in);     
 
      int a=sc.nextInt();
      boolean nothing=true;
      if(a<=1)
          nothing=false;
      else{
           for(int i=2;i<=a/2;i++){
               if(a%i==0)
                    nothing=false;
           }
      }
      if(nothing)
             System.out.println("True");
      else
             System.out.println("False");    
      }
}

