package com.booleanuk.core;

import com.booleanuk.core.items.Book;
import com.booleanuk.core.items.Drink;
import com.booleanuk.core.items.Game;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void shouldCalculateTotal() {
        Basket basket = new Basket();
        basket.add(new Game("Morrowind", 12));
        basket.add(new Book("Darkly Dreaming Dexter", 6));
        basket.add(new Drink("Cappucino", 2));

        Assertions.assertEquals(20, basket.getTotal());
    }

    @Test
    public void shouldFindExistingProduct() {
        Basket basket = new Basket();
        basket.add(new Game("Morrowind", 12));
        basket.add(new Book("Darkly Dreaming Dexter", 6));
        basket.add(new Drink("Cappucino", 2));

        Assertions.assertTrue(basket.isInBasket("Morrowind"));
    }

    @Test
    public void shouldNotFindNonExistingProduct() {
        Basket basket = new Basket();
        basket.add(new Game("Morrowind", 12));
        basket.add(new Book("Darkly Dreaming Dexter", 6));
        basket.add(new Drink("Cappucino", 2));

        Assertions.assertFalse(basket.isInBasket("Skyrim"));
    }
}
