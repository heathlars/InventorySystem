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

public class ModifyProductController implements Initializable {

    Stage stage;
    Parent scene;

    public TextField modifyProductIdTxt;
    public TextField modifyProductNameTxt;
    public TextField modifyProductInvTxt;
    public TextField modifyProductPriceTxt;
    public TextField modifyProductMaxTxt;
    public TextField modifyProductMinTxt;
    public TextField modifyProductSearchTxtFld;
    public TableView modifyProductTopTbl;
    public TableColumn modifyProductTopPartIdCol;
    public TableColumn modifyProductTopPartNameCol;
    public TableColumn modifyProductTopInvCol;
    public TableColumn modifyProductTopPriceCol;
    public TableView modifyProductBottomTbl;
    public TableColumn modifyProductBottomPartIdCol;
    public TableColumn modifyProductBottomPartNameCol;
    public TableColumn modifyProductBottomInvCol;
    public TableColumn modifyProductBottomPriceCol;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void onActionModifyProductAddBtn(ActionEvent actionEvent) {
    }

    public void onActionModifyProductRemovePartBtn(ActionEvent actionEvent) {
    }

    public void onActionModifyProductSaveBtn(ActionEvent actionEvent) {
    }

    public void onActionModifyProductCancelBtn(ActionEvent actionEvent) throws IOException {
        stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/warga/inventorysystem/view/MainForm.fxml"));
        stage.setScene(new Scene(scene));
    }
}