import java.util.Scanner;


import java.text.DecimalFormat;






public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");


        //data get
        System.out.print("How much is the bill?: ");
        double bill = scanner.nextDouble();




        System.out.print("What is the tip percentage?: ");
        double tipPerc = scanner.nextInt() / 100.0; //turn whole number into percentage




        System.out.print("How many people are paying?: ");
        int party = scanner.nextInt();








        //calculations
        double tip = bill * tipPerc;
        double total = bill + tip;
        double tipPerPerson = tip/party;
        double totalPerPerson = total/party;








        //print info
        System.out.println();
        System.out.println("Tip: $" + df.format(tip));
        System.out.println("Total: $" + df.format(total));
        System.out.println("Tip Per Person: $" + df.format(tipPerPerson));
        System.out.println("Total Per Person: $" + df.format(totalPerPerson));




    }
}


