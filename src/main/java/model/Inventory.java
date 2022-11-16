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

    // this is where search function should exist, NOT in main form
//        // use enhanced for loop - check chapter 5.10 in book

    public static ObservableList<Product> lookupProduct(String partialProductName){
        ObservableList<Product> namedProducts = FXCollections.observableArrayList();

        for(Product p : allProducts) {
            if(p.getName().toUpperCase().contains(partialProductName.toUpperCase())){
                namedProducts.add(p);
            }
        }
        return namedProducts;
    }

    public static Product lookupProduct(int productId){

        for(Product p : allProducts) {
            if(p.getId() == productId){
                return p;
            }
        }
        return null;
    }

    public static ObservableList<Part> lookupPart(String partialPartName){
        ObservableList<Part> namedParts = FXCollections.observableArrayList();

        for(Part p : allParts) {
            if(p.getName().toUpperCase().contains(partialPartName.toUpperCase())){
                namedParts.add(p);
            }
        }
        return namedParts;
    }

    public static Part lookupPart(int partId){

        for(Part p : allParts) {
            if(p.getId() == partId){
                return p;
            }
        }
        return null;
    }


    // announcement re: updatePart on course homepage!!! should reference newPart, not selectedPart?
    public static void updatePart(int index, Part selectedPart) {
        allParts.set(index, selectedPart);
    }

    public static void updateProduct(int index, Product newProduct) {
        allProducts.set(index, newProduct);
    }

    public static boolean deletePart(Part selectedPart){
        return allParts.remove(selectedPart);

    }

    public static boolean deleteProduct(Product selectedProduct) {
        return allProducts.remove(selectedProduct);
    }

}
