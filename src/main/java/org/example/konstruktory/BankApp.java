package org.example.konstruktory;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
//        bankAccount.owner="Andrzej";
//        bankAccount.number="123";
//        bankAccount.value=-110;
//        BankAccount bankAccount = new BankAccount("Andrzej", "123", -110);
        bankAccount.setOwner("Andrzej");
        bankAccount.setNumber("123");
        bankAccount.setValue(-300);
//        System.out.println(bankAccount);
        System.out.println("Nazwa uzytkownika: " + bankAccount.getOwner());
        System.out.println("Numer rachunku bankowego: " + bankAccount.getNumber());
        System.out.println("Saldo konta: " + bankAccount.getValue());

//        bankAccount.value = -1; //ZAKAZANE
//        System.out.println
    }
}