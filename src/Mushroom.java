public class Mushroom extends Pizza {
    Pizza pizza;
    Mushroom(Pizza pizza){
        this.pizza=pizza;
    }
    public int getCost() {
      return pizza.getCost()+5;
    }
}
