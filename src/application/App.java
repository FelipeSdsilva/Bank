package application;

import java.util.*;
import entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int accountnumber;
        String name;
        double value;
        char cont;
        
        System.out.print("Enter account number: ");
        accountnumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        name = sc.nextLine();
        
        System.out.print("Is there inital deposit(y/n)? ");
        
        cont = sc.next().charAt(0);
        Account holder = new Account(accountnumber,name);
        if(cont =='y')
        {
            System.out.print("Enter inital deposit value: ");
            value = sc.nextDouble();
            holder = new Account(accountnumber,name,value);
            
        }else
        {
            holder = new Account(accountnumber,name);
        }

        System.out.println("Account data: ");
        System.out.println(holder);

        System.out.print("Enter a deposit value ?");
        value = sc.nextDouble();
        holder.deposit(value);
        System.out.println(holder);
        System.out.print("Enter a value withdraw value: ");
        value = sc.nextDouble();
        holder.whitdraw(value);
        System.out.println(holder);

        sc.close();
    }
}
