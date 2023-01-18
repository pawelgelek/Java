package org.example.konstruktory;


class BankAccount {
    String owner;
    String number;
    Integer value;

    public BankAccount() {
    }

    public BankAccount(String owner, String number, Integer value) {
        this.owner = owner;
        this.number = number;
        this.value = value;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getValue() {
        return value;
    }
    public void setValue(int value) {
        if (value >= 0) {
            this.value = value;
        } else {
            System.out.println("Blad! Saldo konta nie moze byc ujemne!");
        }
    }
}