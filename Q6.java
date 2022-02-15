import java.util.Scanner;
class PurchaseItem
{
   private String name;
   private double unitPrice;
   public PurchaseItem() {
       this.name = "No Item";
       this.unitPrice = 0;
     }
    public PurchaseItem(String name, double unitPrice) {
         this.name = name;
         this.unitPrice = unitPrice;
   }
    public void getData() {
       System.out.println("Name :- "+name);
        System.out.println("Unit Price :- "+unitPrice);
    }
public void setData(String name, double unitprice) {
    this.name = name;
    this.unitPrice=unitprice;
  }
public double getPrice(){
   return unitPrice;
 }

public String toString() {
    return name + " @ " + unitPrice ;
    }
}

class WeighedItem extends PurchaseItem
{
   private double weight;
    public WeighedItem() {
    }
  public WeighedItem(double weight) {
    this.weight = weight;
  }
  public double getWeight() {
     return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
   }

  public double getPrice()
  {
    return weight*super.getPrice();
   }
   public String toString() {

     return super.toString()+" "+weight+"kg "+getPrice()+"SR";
  }
}
class CountedItem extends PurchaseItem
{
    private int quantity;
    public CountedItem() {
        }
    public CountedItem(int quantity) {
         this.quantity = quantity;
      }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
         this.quantity = quantity;
    }

    public double getPrice()
   {
         return quantity*super.getPrice();
    }
    public String toString() {
         return super.toString()+" "+quantity+"units "+getPrice()+"SR";
        }
}
public class Q6{
    public static void main(String[] args) {

      Scanner scan=new Scanner(System.in);
      System.out.println("Weighted Item");
       System.out.println("Enter Name, Unit Price, Weight :-");
      WeighedItem w = new WeighedItem();
       w.setData(scan.next(), scan.nextDouble());
     w.setWeight(scan.nextDouble());
      System.out.println(" "+w.toString());
      System.out.println("Counted Item");
     System.out.println("Enter Name, Unit Price, Quantity :-");
      CountedItem c = new CountedItem();
    c.setData(scan.next(), scan.nextDouble());
      c.setQuantity(scan.nextInt());
    System.out.println(" "+c.toString());
    }
}
