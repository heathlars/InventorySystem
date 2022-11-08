package controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddProductController implements Initializable {


    public TextField addProductIdTxt;
    public TextField addProductNameTxt;
    public TextField addProductInvTxt;
    public TextField addProductPriceTxt;
    public TextField addProductMaxTxt;
    public TextField addProductMinTxt;
    public TextField addProductSearchTxtFld;
    public TableView addProductTopTbl;
    public TableColumn addProductTopPartIdCol;
    public TableColumn addProductTopPartNameCol;
    public TableColumn addProductTopInvCol;
    public TableColumn addProductTopPriceCol;
    public TableView addProductBottomTbl;
    public TableColumn addProductBottomPartIdCol;
    public TableColumn addProductBottomPartNameCol;
    public TableColumn addProductBottomInvCol;
    public TableColumn addProductBottomPriceCol;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("I am initialized");
    }

    public void onActionAddProductAddBtn(ActionEvent actionEvent) {
    }

    public void onActionAddProductRemovePartBtn(ActionEvent actionEvent) {
    }

    public void onActionAddProductSaveBtn(ActionEvent actionEvent) {
    }

    public void onActionAddProductCancelBtn(ActionEvent actionEvent) {
    }
}