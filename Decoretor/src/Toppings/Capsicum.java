package Toppings;

import BasePizzas.BasePizza;

public class Capsicum extends Topping {
    
    BasePizza basePizza;
    
    public Capsicum(BasePizza basePizza) {
        this.basePizza =basePizza;
    }

    public int Cost() {
        
        return basePizza.Cost()+20;
    }

}
