/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

******************/
import java.util.*;
class Main{
   public static void main(String args[]){
      
      try{
    	
        try{     
           
            try{
            	int arr[]= {1,2,3,4};

            	System.out.println(arr[0]);
            }catch(ArithmeticException e1){
            	System.out.print("Arithmetic Exception");
            	System.out.println(" handled in try-block3");
            
        }
        catch(ArithmeticException e2){
           System.out.print("Arithmetic Exception");
           System.out.prinln(" handled in try-block2");
        }
    }
    catch(ArithmeticException e3){
    	System.out.print("Arithmetic Exception");
     	System.out.println(" handled in main try-block");
    }
    catch(ArrayIndexOutOfBoundsException e4){
    	System.out.print("ArrayIndexOutOfBoundsException");
     	System.out.println(" handled in main try-block");
    }
    catch(Exception e5){
    	System.out.print("Exception");
     	System.out.println(" handled in main try-block");
     }
  
}
}
}

