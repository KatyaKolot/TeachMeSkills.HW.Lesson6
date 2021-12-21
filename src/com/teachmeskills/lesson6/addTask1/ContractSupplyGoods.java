package com.teachmeskills.lesson6.addTask1;

public class ContractSupplyGoods extends DocDuplicate implements IRegister{

    String goodsType;
    int goodsAmount;

    public ContractSupplyGoods(String goodsType, int goodsAmount) {
        this.goodsType = goodsType;
        this.goodsAmount = goodsAmount;
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
