package grammarapplications;

import java.util.Scanner;

public class GrammarApplications {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
        System.out.print("enter user input: ");
        
        String assignment = scan.nextLine();
        System.out.println("String: " + assignment);
    }
}
