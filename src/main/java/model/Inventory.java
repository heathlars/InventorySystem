package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory {

    private static ObservableList<Part> allParts = FXCollections.observableArrayList();

    private static ObservableList<Product> allProducts = FXCollections.observableArrayList();


    public static ObservableList<Part> getAllParts() {
        return allParts;
    }

    public static ObservableList<Product> getAllProducts() {
        return allProducts;
    }

    public static void addPart(Part newPart) {
        allParts.add(newPart);
    }
    public static void addProduct(Product newProduct) {
        allProducts.add(newProduct);
    }

//    public static Part lookupPart(int partId) {
//        allParts.filtered(partId);
//    }

    // announcement re: updatePart on course homepage!!! should reference newPart, not selectedPart?
    public static void updatePart(int index, Part selectedPart) {
        allParts.set(index, selectedPart);
    }

    public static void updateProduct(int index, Product newProduct) {
        allProducts.set(index, newProduct);
    }

    public static boolean deletePart(Part selectedPart){
        allParts.remove(selectedPart);
        return true; //unsure what to return here
    }

    public static boolean deleteProduct(Product selectedProduct) {
        allProducts.remove(selectedProduct);
        return true; //again unsure what this should be returning
    }

}
