package controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainFormController implements Initializable {


    public TextField mainFormPartSearchTxtFld;
    public TableView mainFormPartTbl;
    public TableColumn mainFormPartIdCol;
    public TableColumn mainFormPartNameCol;
    public TableColumn mainFormPartInvCol;
    public TableColumn mainFormPartPriceCol;
    public TextField mainFormProductSearchTxtFld;
    public TableView mainFormProductTbl;
    public TableColumn mainFormProductIdCol;
    public TableColumn mainFormProductNameCol;
    public TableColumn mainFormProductInvCol;
    public TableColumn mainFormProductPriceCol;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("I am initialized");
    }

    public void onActionMainFormAddPart(ActionEvent actionEvent) {
    }

    public void onActionMainFormModifyPart(ActionEvent actionEvent) {
    }

    public void onActionMainFormDeletePart(ActionEvent actionEvent) {
    }

    public void onActionMainFormAddProduct(ActionEvent actionEvent) {
    }

    public void onActionMainFormModifyProduct(ActionEvent actionEvent) {
    }

    public void onActionMainFormDeleteProduct(ActionEvent actionEvent) {
    }

    public void onActionExitMainForm(ActionEvent actionEvent) {
    }
}