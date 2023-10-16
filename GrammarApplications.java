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
        String result = semiColonChecker(assignment);
        System.out.println(result);
    }

    public static String semiColonChecker(String assignment) {
        if (assignment.endsWith(";")) {
            return "Valid Statement.";
        } else {
            return "Error: Missing a semicolon.";
        }
    }
    public static boolean intChecker(String val) {
        try {
            Integer.valueOf(val);
            System.out.println(val + " is an integer");
            return true;
        } catch (NumberFormatException e) {
            System.out.println(val + " is not an integer");
            return false;
        }
    }

    public static boolean decChecker(String val) {
        try {
            Double.valueOf(val);
            System.out.println(val + " is a decimal");
            return true;
        } catch (NumberFormatException e) {
            System.out.println(val + " is not a decimal");
            return false;
        }
    }

    public static boolean boolChecker(String val) {

        if (val.equals("true") || val.equals("false")) {
            System.out.println(val + " is a Boolean");
            return true;
        } else {
            System.out.println(val + " is not a Boolean");
            return false;
        }
    }

    
}
