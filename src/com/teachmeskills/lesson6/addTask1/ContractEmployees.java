package com.teachmeskills.lesson6.addTask1;

import java.util.Date;

public class ContractEmployees extends DocDuplicate implements IRegister{

    Date contractExpiring;
    String employeeName;

    public ContractEmployees(Date contractExpiring, String employeeName) {
        this.contractExpiring = contractExpiring;
        this.employeeName = employeeName;
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
