//let this be the package for voting eligibility
package vote;
public class Package{
    public boolean checkEligibility(int age){
        if(age>18){
            return true;
        }
        else{
            return false;
        }
    }
}
 //run javac vote/Package.java in terminal before importing