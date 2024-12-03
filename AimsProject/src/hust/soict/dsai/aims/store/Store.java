package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {

    private DigitalVideoDisc[] itemsInStore;
    private int qtyInStore;
    private static final int MAX_ITEMS_IN_STORE = 100;

    
    public Store() {
        itemsInStore = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
        qtyInStore = 0;
    }

    
    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < MAX_ITEMS_IN_STORE) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("The DVD \"" + disc.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

   
    public void removeDVD(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == disc) {
                found = true;
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("The DVD \"" + disc.getTitle() + "\" has been removed from the store.");
                break;
            }
        }
        if (!found) {
            System.out.println("The DVD \"" + disc.getTitle() + "\" was not found in the store.");
        }
    }

   
    public void displayStore() {
        System.out.println("\n********** STORE INVENTORY **********");
        if (qtyInStore == 0) {
            System.out.println("The store is currently empty.");
        } else {
            for (int i = 0; i < qtyInStore; i++) {
                System.out.println((i + 1) + ". " + itemsInStore[i].toString());
            }
        }
        System.out.println("**************************************");
    }
}
