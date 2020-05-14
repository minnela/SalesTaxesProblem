package Goods;

import Main.Strategy;

public class Digital extends Good implements Strategy {

    public Digital() {
        super();
        goodName="Music CD";
        unitPrice= 14.99;
        isExempt=false;
    }

    @Override
    public double calculatePrice(int amount) {
        return super.calculatePrice(amount);
    }

    @Override
    public double calculateTax(int amount, boolean isImported) {
        return super.calculateTax(amount,isImported);
    }

    public String getGoodName() {
        return goodName;
    }

    public int getAmount() {
        return amount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public boolean getIsImported() {
        return isImported;
    }

    public boolean getIsExempt() {
        return isExempt;
    }
}
