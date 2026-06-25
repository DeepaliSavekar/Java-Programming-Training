import java .util.*;
public class VotingSystem {
    // input age Function
    public static int getInputAge()
    {
        Scanner sc = new Scanner(System.in);
        int age=0;

        try{
        System.out.println("Enter your age:");
         age = sc.nextInt();
        if(age<0)
        {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid input. Please enter a valid age.");
            System.exit(0);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return age;
    } 
    // checking age validity function
    public static boolean isAgeValid(int age){
      private stsatic final int MINIMUM_VOTING_AGE = 18;
        return age >= MINIMUM_VOTING_AGE;
    }
    // printing result function
    public static void printResult(boolean valAgeValidity)
    {
        if(valAgeValidity)
        {
            System.out.println("you are eligible for voting");
        }
        else
        {
            System.out.println("you are not eligible for voting");
        }
    }
// Main Function
    public static void main(String[] args) {
        int age= getInputAge();                         //value of age eg 23
        boolean checkAgeValidity=isAgeValid(age);      //value of checkAgeValidity eg true
        printResult(checkAgeValidity);                 //print result based on checkAgeValidity
    }
    
}