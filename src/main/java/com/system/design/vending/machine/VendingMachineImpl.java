package com.system.design.vending.machine;

import com.system.design.vending.machine.exception.SoldOutException;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {

    private Inventory<Coin> coinInventory = new Inventory<Coin>();
    private Inventory<Item> itemInventory = new Inventory<Item>();
    private Item currentItem;
    private Long currentBalance;
    private Long totalSales;
    
    public VendingMachineImpl(){
        init();
    }

    private void init(){
        for(Coin c : Coin.values())
            coinInventory.put(c, 5);

        for(Item i : Item.values())
            itemInventory.put(i, 5);
    }


    public Long selectItemAndGetPrice(Item item) {

        if(itemInventory.hasItem(item)){
            currentItem = item;
            return item.getPrice();
        }

        throw new SoldOutException("Item has been Sold Out");
    }

    public void insertCoin(Coin coin) {
        currentBalance += coin.getValue();
        coinInventory.add(coin);
    }

    public List<Coin> refund() {

        List<Coin> change = getChange(currentBalance);
        updateCoinInventory(change);
        currentBalance = 0L;
        currentItem = null;

        return change;
    }

    private void updateCoinInventory(List<Coin> coinList){
        for(Coin c : coinList){
            coinInventory.deduct(c);
        }
    }

    private List<Coin> getChange(Long balance){
        //Method the return the change value if any after purchase
        return new ArrayList<Coin>();
    }

    public Bucket<Item, List<Coin>> collectItemAndChange() {
        Item item = collectItem();
        totalSales += item.getPrice();

        List<Coin> change = collectChange();
        return new Bucket<Item, List<Coin>>(item, change);
    }

    private List<Coin> collectChange(){

        return new ArrayList<Coin>();
    }

    private Item collectItem(){
        if(isFullPaid()){
            if(hasSufficientChange()){
                itemInventory.deduct(currentItem);

                return currentItem;
            }
        }
        return null;
    }

    private Boolean hasSufficientChange(){

        return true;
    }

    private boolean isFullPaid() {
        if(currentBalance >= currentItem.getPrice()){
            return true;
        }

        return false;
    }

    public void reset() {

    }
}
