package Goods;
import Main.Strategy;

public class Good implements Strategy {

    String goodName;
    int amount;
    double unitPrice;
    boolean isImported;
    boolean isExempt;

    public Good(){

    }
   public Good(String goodName, int amount, boolean isImported, boolean isExempt){

       goodName=this.goodName;
       amount=this.amount;
       isImported=this.isImported;
       isExempt=this.isExempt;

    }

    @Override
    public double calculatePrice(int amount) {
        return amount*unitPrice;
    }

    @Override
    public double calculateTax(int amount, boolean isImported) {
        if(this.isExempt){
            if(isImported){
                return amount*unitPrice*0.05;
            }
            else{
                return 0;
            }
        }else{
            if(isImported){
                return amount*unitPrice*0.1 + calculatePrice(amount)*0.05;
            }else{
                return amount*unitPrice*0.1;
            }
        }
    }
    public String getGoodName(){
        return this.goodName;
    }
    public int getAmount(){
        return this.amount;
    }
    public double getUnitPrice(){
        return this.unitPrice;
    }
    public boolean getIsImported(){
        return this.isImported;
    }
    public boolean getIsExempt(){
        return this.isExempt;
    }
}
