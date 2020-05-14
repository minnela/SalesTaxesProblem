package Goods;

import Main.Strategy;

public class Cosmetic extends Good implements Strategy {

    public Cosmetic(int choice) {
        super();
        if(choice==4){
            goodName="Bottle of Perfume";
            unitPrice= 18.99;
            isExempt=false;
        }
        else if(choice==8){
            goodName="Imported Bottle of Perfume";
            unitPrice= 27.99;
            isExempt=false;
        }
        else if(choice==9){
            goodName="Imported Bottle of Perfume";
            unitPrice= 47.50;
            isExempt=false;
        }
    }

    @Override
    public double calculatePrice(int amount) {
        return super.calculatePrice(amount);
    }

    @Override
    public double calculateTax(int amount,boolean isImported) {
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
