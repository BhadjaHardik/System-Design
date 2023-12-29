package Toppings;

import BasePizzas.BasePizza;

public class GreenOlive extends Topping {

    BasePizza basePizza;
    
    public GreenOlive(BasePizza basePizza) {
       this.basePizza =basePizza;
    }

    public int Cost() {
        
        return basePizza.Cost()+30;
    }

}
