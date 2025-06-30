import java.util.ArrayList;
public class Order {
    private ArrayList<Dish> dishes =new ArrayList<>();
    public void addDish(Dish dish){
        dishes.add(dish);
        System.out.println(dish.getName()+"sipariş eklendi");
    }
    public double calculateTotal(){
        double total=0;
        for(Dish d: dishes){
            total+=d.getPrice();
        }
        return total;
    }
   public void printOrder(){
       System.out.println("Sipariş detayları");
       for(Dish d: dishes){
           System.out.println("-"+d.getName()+":"+d.getPrice()+"TL");
       }
       System.out.println("toplam:"+calculateTotal()+"TL");
       
   }

}

