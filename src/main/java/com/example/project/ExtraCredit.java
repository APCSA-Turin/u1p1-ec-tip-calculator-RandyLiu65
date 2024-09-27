package com.example.project;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

                //COPY AND PASTE YOUR CODE HERE 
                double totalTip = (cost*(0.01*percent));
        double totalBill = cost + totalTip;
        double billPerson = cost/people;
        double tipPerson = totalTip/people;
        double totalPerson = billPerson + tipPerson;


        totalTip = (Math.round(totalTip*100.0) / 100.0);
        totalBill = (Math.round(totalBill*100.0) / 100.0);
        billPerson = (Math.round(billPerson*100.0) / 100.0);
        tipPerson = (Math.round(tipPerson*100.0) / 100.0);
        totalPerson = (Math.round(totalPerson*100.0) / 100.0);

        

        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("\n");
        result.append("Total percentage: " + percent + "%");
        result.append("\n");
        result.append("Total tip: $" + totalTip);
        result.append("\n");
        result.append("Total Bill with tip: $" + totalBill);
        result.append("\n");
        result.append("Per person cost before tip: $" + billPerson);
        result.append("\n");
        result.append("Tip per person: $" + tipPerson);
        result.append("\n");
        result.append("Total cost per person: $" + totalPerson);
        result.append("\n");
        result.append("-------------------------------\n");


        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 2; 
        int percent = 5;
        double cost = 29.56;
        String items = "";
   

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any name or type '-1' to finish: ");
        String name = scan.nextLine();

        if (!"-1".equals(name)) {
            items += name;
            items += "\n";
        }

        while (!"-1".equals(name)) {
            System.out.println("Enter an item name or type '-1' to finish: ");
            name = scan.nextLine();

            if (!"-1".equals(name)) {
                items += name;
                items += "\n";
            }
        }
        //Your scanner object and while loop should go here
                             
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
// SOURCES:
  // learned how to use Math.round from:  https://www.educative.io/answers/how-to-use-the-java-mathround-method
  // String format and Decimal format:  https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java
  // While loops: https://stackoverflow.com/questions/12449281/java-using-for-while-and-do-while-loops-to-sum-1-through-100
  //              https://stackoverflow.com/questions/22992746/string-comparison-doesnt-work-in-while-loop

