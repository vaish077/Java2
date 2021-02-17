public class Ques2{
     public static void main(String[] args) {
       String original = "mamum";
       int k = 0;
       char temp=0;
       char[] sb = original.toCharArray();
 
       for (int i = 0; i <sb.length; i++) {
 
          for ( k = 0; k < sb.length; k++) {
 
             if(sb[k]>sb[i]){
             temp=sb[i];
             sb[i]=sb[k];
             sb[k]=temp;
       }
 
   }  
 
} 
for(int l=0;l<sb.length;l++){
System.out.println(sb[l]);
}
       }
}
