package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status) {
        //logging
        //Auth
        //Sanitize/serialize data

        System.out.println("Checkout method from Shopping Cart Called");
    }
}
