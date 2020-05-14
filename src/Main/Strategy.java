package Main;

public interface Strategy {

 public double calculatePrice(int amount); //will calculate the tax-free price of each good.
 public double calculateTax(int amount, boolean isImported); //will calculate the tax price of each good.


}
