//we will be hiding the sensitive data from the users by making it private and accessing by getter and setter methods
class Encapsulated{
        private int age = 15;
        public int getage(){
            return age;
        }
        public void setage(int n){
            this.age = n;
        }
}
public class Encapsulation{
    public static void main(String[] args){
        Encapsulated obj = new Encapsulated();
        System.out.println("age ="+obj.getage());
        obj.setage(18);
        System.out.println("new age ="+obj.getage());
    }
}