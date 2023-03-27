//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        PizzaFactory factory = new PizzaFactory();
//        Pizza cheesePizza = factory.createPizza(PizzaType.CHEESE);
//        Pizza pepperoniPizza = factory.createPizza(PizzaType.PEPPERONI);
//        System.out.println(cheesePizza.toString());
//
//        Sys
//    }
//}
public class Main {
    public static void main(String[] args) {
        GUIFactory factory;
        Button btn;
        Menu menu;

        factory = new WindowsGUIFactory();
        btn = factory.createButton();
        menu = factory.createMenu();
        btn.paint();
        menu.display();

        factory = new MacGUIFactory();
        btn = factory.createButton();
        menu = factory.createMenu();
        btn.paint();
        menu.display();
    }
}