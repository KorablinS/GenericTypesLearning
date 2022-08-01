package ru.synergy.customgenerictypes;

public class Main {
    public static void main(String[] args){
    Account acc1 = new Account(12345, 5000);

        System.out.println(acc1.getId());

        Account acc2 = new Account("sid123445", 5000);

        System.out.println(acc2.getId());
        int x = ((Integer)acc2.getId()) +10;
        System.out.println(x);

    }
}
