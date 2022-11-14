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
        mainFormProductTbl.setItems(Inventory.getAllProducts());

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