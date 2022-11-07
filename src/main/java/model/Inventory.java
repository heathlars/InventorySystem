package model;

import javafx.collections.ObservableList;

public class Inventory {

    private ObservableList<Part> allParts;

    private ObservableList<Product> allProducts;

    public ObservableList<Part> getAllParts() {
        return allParts;
    }

    public ObservableList<Product> getAllProducts() {
        return allProducts;
    }
}
