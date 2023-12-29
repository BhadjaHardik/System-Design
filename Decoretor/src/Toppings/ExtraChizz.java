package Toppings;

import BasePizzas.BasePizza;

public class ExtraChizz extends Topping {

    BasePizza basePizza;
    
    public ExtraChizz(BasePizza basePizza) {
        this.basePizza =basePizza;
    }

    public int Cost() {
        
        return basePizza.Cost()+10;
    }

}
