public class Exception_Handling{
    public static void main(String[] args){
        int a=10;
        try {
           int result=a/0;
        }
        catch (Exception e){
            System.out.println("there occured an error....");

        }
    }
}