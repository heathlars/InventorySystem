package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Inventory;
import model.Part;
import model.Product;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainFormController implements Initializable {

Stage stage;
Parent scene;

    public TextField mainFormPartSearchTxtFld;
    public TableView<Part> mainFormPartTbl;
    public TableColumn<Part, Integer> mainFormPartIdCol;
    public TableColumn<Part, String> mainFormPartNameCol;
    public TableColumn<Part, Integer> mainFormPartInvCol;
    public TableColumn<Part, Double> mainFormPartPriceCol;
    public TextField mainFormProductSearchTxtFld;
    public TableView<Product> mainFormProductTbl;
    public TableColumn<Product, Integer> mainFormProductIdCol;
    public TableColumn<Product, String> mainFormProductNameCol;
    public TableColumn<Product, Integer> mainFormProductInvCol;
    public TableColumn<Product, Integer> mainFormProductPriceCol;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mainFormPartTbl.setItems(Inventory.getAllParts());

        mainFormPartIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        mainFormPartNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        mainFormPartInvCol.setCellValueFactory(new PropertyValueFactory<>("stock"));
        mainFormPartPriceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

        mainFormProductTbl.setItems(Inventory.getAllProducts());

        mainFormProductIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        mainFormProductNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        mainFormProductInvCol.setCellValueFactory(new PropertyValueFactory<>("stock"));
        mainFormProductPriceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

    }

    public void onActionMainFormAddPart(ActionEvent actionEvent) throws IOException {
        stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/warga/inventorysystem/view/AddPart.fxml"));
        stage.setScene(new Scene(scene));
    }

    public void onActionMainFormModifyPart(ActionEvent actionEvent) throws IOException {
        stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/warga/inventorysystem/view/ModifyPart.fxml"));
        stage.setScene(new Scene(scene));
    }

    public void onActionMainFormDeletePart(ActionEvent actionEvent) {
    }

    public void onActionMainFormAddProduct(ActionEvent actionEvent) throws IOException {
        stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/warga/inventorysystem/view/AddProduct.fxml"));
        stage.setScene(new Scene(scene));
    }

    public void onActionMainFormModifyProduct(ActionEvent actionEvent) throws IOException {
        stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/warga/inventorysystem/view/ModifyProduct.fxml"));
        stage.setScene(new Scene(scene));
    }

    public void onActionMainFormDeleteProduct(ActionEvent actionEvent) {
    }

    public void onActionExitMainForm(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void onActionMainFormPartSearch(ActionEvent actionEvent) {
        String q = mainFormPartSearchTxtFld.getText();
        ObservableList<Part> parts = searchByPartName(q);
        mainFormPartTbl.setItems(parts);

        if(parts.size() == 0) {
            try {
                int id = Integer.parseInt(q);
                Part p = searchByPartId(id);
                if (p != null)
                    parts.add(p);
            } catch (NumberFormatException e){
            }
        }
    }

    public void onActionMainFormProductSearch(ActionEvent actionEvent) {
        String q = mainFormProductSearchTxtFld.getText();
        ObservableList<Product> products = searchByProductName(q);
        mainFormProductTbl.setItems(products);
    }

    private ObservableList<Part> searchByPartName(String partialPartName) {
        ObservableList<Part> namedParts = FXCollections.observableArrayList();
        ObservableList<Part> allParts = Inventory.getAllParts();

        for(Part p : allParts) {
            if(p.getName().contains(partialPartName)){
                namedParts.add(p);
            }
//            else {
//                Alert alert = new Alert(Alert.AlertType.ERROR);
//                alert.setTitle("Error Dialogue");
//                alert.setContentText("No part was found.");
//                alert.showAndWait();
//            }
        }
        return namedParts;
    }

    private Part searchByPartId(int id) {
        ObservableList<Part> allParts = Inventory.getAllParts();
        for(int i = 0; i < allParts.size(); i++) {
            Part p = allParts.get(i);
            if(p.getId() == id) {
                return p;
            }
//            else {
//                Alert alert = new Alert(Alert.AlertType.ERROR);
//                alert.setTitle("Error Dialogue");
//                alert.setContentText("No part was found.");
//                alert.showAndWait();
//            }
        }
        return null;
    }

    private ObservableList<Product> searchByProductName(String partialProductName) {
        ObservableList<Product> namedProducts = FXCollections.observableArrayList();
        ObservableList<Product> allProducts = Inventory.getAllProducts();

        for(Product p : allProducts) {
            if(p.getName().contains(partialProductName)){
                namedProducts.add(p);
            }
        } return namedProducts;
    }

}