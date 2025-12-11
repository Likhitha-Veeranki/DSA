import vote.Package;
import java.util.Scanner; //built in package to get user input
public class Pack_example{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter age : ");
        int age = scan.nextInt();
        System.out.println("entered age is : "+age);
        Package obj2 = new Package();
        System.out.println(obj2.checkEligibility(age));
    }
}