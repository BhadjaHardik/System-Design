import BasePizzas.MargaritaPizza;
import BasePizzas.FarmVillaPizza;
import Toppings.Capsicum;
import Toppings.ExtraChizz;
import Toppings.GreenOlive;

public class App {
    public static void main(String[] args) throws Exception {
        int cost = new Capsicum(new GreenOlive(new ExtraChizz(new FarmVillaPizza()))).Cost();
        System.out.println(cost);
    }
}
     