package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddProductController implements Initializable {

Stage stage;
Parent scene;

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
    }

    public void onActionAddProductAddBtn(ActionEvent actionEvent) {
    }

    public void onActionAddProductRemovePartBtn(ActionEvent actionEvent) {
    }

    public void onActionAddProductSaveBtn(ActionEvent actionEvent) {
    }

    public void onActionAddProductCancelBtn(ActionEvent actionEvent) throws IOException {
        stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/warga/inventorysystem/view/MainForm.fxml"));
        stage.setScene(new Scene(scene));
    }
}