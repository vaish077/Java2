public class Ques6{  
     public static void main(String[] args){  
         try{    
             int a[]=new int[8];    
             a[8]=30/0;    
            }    
         catch(ArithmeticException e){  
                 System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
           finally{System.out.println("finally block is always executed");}  
               System.out.println("rest of the code");    
    }  
}