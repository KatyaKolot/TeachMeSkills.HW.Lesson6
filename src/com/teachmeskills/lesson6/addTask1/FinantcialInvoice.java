package com.teachmeskills.lesson6.addTask1;

public class FinantcialInvoice extends DocDuplicate implements IRegister{

    int totalMonthAmount;
    String codeDepartment;

    public FinantcialInvoice(int totalMonthAmount, String codeDepartment) {
        this.totalMonthAmount = totalMonthAmount;
        this.codeDepartment = codeDepartment;
    }

    @Override
    public String docInformation(String docID) {
        return null;
    }

    @Override
    public boolean docPreservation(String docID, int docAmount) {
        return false;
    }
}
