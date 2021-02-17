public class Ques4{
 
    private static Ques4 myObj;
     
    static{
        myObj = new Ques4();
    }
     
    private Ques4(){
     
    }
     
    public static Ques4 getInstance(){
        return myObj;
    }
     
    public void testMe(){
        System.out.println("Hello");
    }
     
    public static void main(String a[]){
        Ques4 ms = getInstance();
        ms.testMe();
    }
}
