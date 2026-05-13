package com.reney.application;

import com.reney.model.entities.Account;
import com.reney.model.exceptions.BusinessException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double Balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, Balance, withdrawLimit);

            System.out.print("\nEnter the amount for withdraw: ");
            Double amount = sc.nextDouble();
            account.withdraw(amount);

            System.out.printf("%nNew balance: %.2f", account.getBalance());
        }
        catch (BusinessException e){
            System.out.println("\nWithdraw error: " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("\nInvalid input");
        }
        catch (RuntimeException e){
            System.out.println("\nUnexpected error");
        }
        sc.close();
    }
}
