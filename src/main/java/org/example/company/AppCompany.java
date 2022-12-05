package org.example.company;

import java.util.ArrayList;

public class AppCompany {

    public static void main(String[] args) {

        Pracownik andrzej = utworzPracownik("andrzej",32,4000);
        Pracownik pawel = utworzPracownik("pawel",35,3500);
        Pracownik justyna = utworzPracownik("justyna",37,4500);
        Pracownik agnieszka = utworzPracownik("agnieszka",25,5500);

        Pracownik krzysztof = utworzPracownik("krzysztof",30,6100);
//        krzysztof.name = "krzysztof";
//        krzysztof.age = 30;
//        krzysztof.salary = 6100;

        Pracownik ireneusz = utworzPracownik("ireneusz",17,3300);
//        ireneusz.name = "ireneusz";
//        ireneusz.age = 17;
//        ireneusz.salary = 3300;

        ArrayList<Pracownik> wszyscy = new ArrayList();
        wszyscy.add(andrzej);
        wszyscy.add(pawel);
        wszyscy.add(justyna);
        wszyscy.add(agnieszka);
        wszyscy.add(krzysztof);
        wszyscy.add(ireneusz);
double suma = 0;

        // chcemy przejsc przez wszystkich w liscie
        for (int i = 0; i < wszyscy.size(); i++) {
            System.out.println("pracownik["+i+"]="+wszyscy.get(i).name);
            System.out.println("pracownik["+i+"]="+wszyscy.get(i).age);
            System.out.println("pracownik["+i+"]="+wszyscy.get(i).salary);
            suma = suma+wszyscy.get(i).salary;
        }
        System.out.println("suma "+suma);
double srednia = suma/ wszyscy.size();
//        double srednia2 = 1/ 0;
//        System.out.println(srednia2);
        System.out.println("srednia "+srednia);
    }

    public static Pracownik utworzPracownik(String name,int age,int salary){
        Pracownik pracownik = new Pracownik();
        pracownik.name = name;
        pracownik.age = age;
        pracownik.salary = salary;
        return pracownik;
    }
}