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

public class MainFormController implements Initializable {

Stage stage;

Parent scene;

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
}