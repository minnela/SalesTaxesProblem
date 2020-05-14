package Goods;
import Main.Strategy;

public class Food extends Good implements Strategy {

    public Food(int choice) {
        super();
        if(choice==1) {
            goodName = "Chocolate Bar";
            unitPrice = 0.85;
            isExempt = true;
        }else if(choice==6){
            goodName = "Imported Box of Chocolates";
            unitPrice=10.0;
            isExempt=true;
        }else if(choice==7){
            goodName = "Box of imported Chocolates";
            unitPrice=11.25;
            isExempt=true;
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
        return this.amount;
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
