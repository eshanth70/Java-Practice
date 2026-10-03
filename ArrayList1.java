import java.util.*;

public class ArrayList1{
    public static void main(String[] args){

        ArrayList<String> cart = new ArrayList<>();

        cart.add("Laptop\n" + "Mouse\n" + "Keybord\n" + "Mouse");
        System.out.println("===== ARRRAYLIST =====");
        System.out.println("Shopping cart\n" + cart + "First item: \n" + cart.get(0) + "Number of items: \n" + cart.size());
        cart.remove("Keyboard");
        System.out.println("After removing keyboard: ");
        System.out.println(cart);
    }
}