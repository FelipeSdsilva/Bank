package entities;

public class Account {
    private int idCont;
    private String name;
    private double balance;
    
    
    public Account(int idCont, String name)
    {
        this.idCont = idCont;
        this.name = name;
        
    }
    public Account(int idCont, String name,double initialDeposit)
    {
        this.idCont = idCont;
        this.name = name;
        deposit(initialDeposit);
        
    }
    public int getIdCont() {
        return idCont;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(Double amount)
    {
        balance += amount;       
    }
    public void whitdraw (double amount){
        balance -=  amount + 5;
    }
    @Override
    public String toString() {
        return "Account [ " 
                + idCont + ", Holder: " 
                + name + ", Balance: " 
                + balance + "]";
    }
    
    
}