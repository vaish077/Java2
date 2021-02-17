public class Ques5 implements Cloneable{  
    int rollno;  
    String name;
    int salary;  
      
    Ques5(int rollno,String name,int salary){  
    this.rollno=rollno;  
    this.name=name;
    this.salary=salary;  
    }  
      
    public Object clone()throws CloneNotSupportedException{  
    return super.clone();  
    }  
      
    public static void main(String args[]){  
    try{  
    Ques5 s1 = new Ques5(7 , "Vaishali" , 15000);  
      
    Ques5 s2 = (Ques5)s1.clone();  
      
    System.out.println(s1.rollno+" "+s1.name+" "+s1.salary);  
    System.out.println(s2.rollno+" "+s2.name+" "+s2.salary);  
      
    }catch(CloneNotSupportedException c){}  
      
    }  
    }
