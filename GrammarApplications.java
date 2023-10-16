package grammarapplications;

import java.util.Scanner;

public class GrammarApplications {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("| Welcome to the Assignment Statement Syntax Checker |");
        System.out.println("------------------------------------------------------");
        System.out.print("Assignment Statement to check: ");
        
        String assignment = scan.nextLine();
        System.out.println();
        System.out.println("Assignment Statement: " + assignment);
    }
}
