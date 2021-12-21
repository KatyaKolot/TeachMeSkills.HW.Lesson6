package com.teachmeskills.lesson6.task2;

public class Runner {
    public static void main(String[] args) {
        Worker worker = new Worker();
        String workerName = worker.posName();
        System.out.println(workerName);

        Director director = new Director();
        String directorName = director.posName();
        System.out.println(directorName);

        Accountant accountant = new Accountant();
        String accountantName = accountant.posName();
        System.out.println(accountantName);
    }
}
