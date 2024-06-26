public class ExtraCheese extends Pizza {
    Pizza pizza;
    ExtraCheese(Pizza pizza) {
        this.pizza=pizza;
    }
    public int getCost(){
        return pizza.getCost()+10;
    }
}
