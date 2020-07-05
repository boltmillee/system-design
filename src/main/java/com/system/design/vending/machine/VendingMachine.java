package com.system.design.vending.machine;

import java.util.List;

public interface VendingMachine {

    Long selectItemAndGetPrice(Item item);

    void insertCoin(Coin coin);

    List<Coin> refund();

    Bucket<Item, List<Coin>> collectItemAndChange();

    void reset();

}
