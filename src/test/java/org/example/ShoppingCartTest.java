package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    @Test
    void test_calculate_price_for_magic_cards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Mage Red", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 3.5);

    }
    @Test
    void test_calculate_price_for_magic_cards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Mage Green", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.4);

    }
    @Test
    void test_calculate_price_for_magic_cards_default() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false,"null" , null, "Magic: The Gathering - Mage", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.0);

    }

    @Test
    void test_calculate_price_for_magic_cards_black_lotus() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, null, null, "Magic: The Gathering - Black Lotus", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 40000.0);

    }

    @Test
    void test_calculate_price_for_magic_cards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Mage Blue", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.0);

    }

    @Test
    void test_calculate_price_for_magic_cards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Mage Black", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.80);

    }

    @Test
    void test_calculate_price_for_wine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 100.0);

    }

    @Test
    void test_calculate_price_for_cheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 50.0);

    }
    @Test
    void test_calculate_price_for_blue_fish() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", BigDecimal.valueOf(0), "Paquito", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 0.1);

    }
    @Test
    void test_calculate_price_for_gold_fish() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "gold", BigDecimal.valueOf(0), "Brillantin", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 0);

    }
    @Test
    void test_if_is_a_pet_the_price_is_4_2_by_legs() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(4, null, false, null, null, "Dog", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 16.8);

    }

    @Test
    void test_if_is_a_spider_the_price_is_1_2_by_legs(){
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(8, null, false, "red",null, "The Spider:", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 9.6);
    }
    @Test
    void test_if_is_a_spider_the_price_is_1_2_by_legs_and_2_for_red_color(){
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(8, null, false, "red",null, "The Spider:", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 11.6);
    }
    @Test
    void test_if_is_a_spider_the_price_is_1_2_by_legs_and_2_for_gold_color(){
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(8, null, false, "gold",null, "The Spider:", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 12.6);
    }
}