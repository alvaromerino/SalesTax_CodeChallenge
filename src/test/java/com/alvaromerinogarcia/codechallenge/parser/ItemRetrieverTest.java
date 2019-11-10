package com.alvaromerinogarcia.codechallenge.parser;

import com.alvaromerinogarcia.codechallenge.domain.carts.ShoppingBasket;
import com.alvaromerinogarcia.codechallenge.utils.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

public class ItemRetrieverTest {

    @Test
    public void testRead_InputCase001_ShouldReturnOneBasketWithThreeItems() {
        int expectedItemsNumber = 3;
        ItemRetriever itemRetriever = new ItemRetriever();
        ShoppingBasket shoppingBasket = itemRetriever.read(Paths.get(Utilities.DATA_FOLDER_PATH, "001.txt").toString());

        Assertions.assertEquals(expectedItemsNumber, shoppingBasket.getItems().size());
    }

}
