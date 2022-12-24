package com.mycompany.mortgagemonthlypayment;
import java.util.Scanner;//Package for user input

public class MortgageMonthlyPayment {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Scanner object.
        
        System.out.print("Home value: $");
        double homePrice = input.nextDouble();//User input for value of the home.
        
        System.out.print("Down payment: $");
       double downPayment = input.nextDouble();//User input for desired down payment.
       
        System.out.print("Interest rate: ");//User input for interest rate.
        double interestRateYearly = input.nextDouble();
        
        System.out.print("Loan term: ");//User input for the loan term in years.
        int loanTermYearly = input.nextInt();
        
        double interestRate = (interestRateYearly/100)/12.00;//Take interest rate and convert it to decimal.
        int loanTerm = loanTermYearly * 12;//Take years and convert it to months.
        double monthlyPayment = (homePrice - downPayment)*((interestRate*
                (Math.pow(1 + interestRate, loanTerm)))
                /((Math.pow(1 + interestRate, loanTerm))-1));//Formula to calculate monthly payments.
        //Print out the monthly payment for your morgage.
        System.out.print("Your payment: $" + Math.round(monthlyPayment*100.0)/100.0);
        
        
       
    }
}

