public class TryCatch1{  
  public static void main(String[] args){  
        try{  
        int d=150/0;   
        }  
        catch(ArithmeticException e){  
            System.out.println(e);  
        }
	System.out.println("rest of the code");  
    }  
}  