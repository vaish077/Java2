class ClientServerException extends RuntimeException{
    final String code;
    final String message;

    public ClientServerException(String code , String message){
        this.code = code;
        this.message = message;
    }
}
public class Ques13{
public static void main(String[] args){
    try{
        int i = 5/0;
    }
    catch (ClientServerException e){
        System.out.println(e.getMessage());
    }
}
}

