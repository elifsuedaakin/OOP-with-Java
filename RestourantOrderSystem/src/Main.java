
public class Main {
    public static void main(String [] args){
        Dish dish1 =new Dish("adana kebap",40);
        Dish dish2 = new Dish("tetebokki",15);
        Dish dish3= new Dish ("sarma",5);
        
        Order order=new Order();
        order.addDish(dish3);
        order.addDish(dish2);
        order.addDish(dish1);
        order.printOrder();
    }
}
