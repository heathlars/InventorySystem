package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddPartOutsourcedController implements Initializable {



    Stage stage;
    Parent scene;

    public RadioButton addPartInHouseRBtn;
    public RadioButton addPartOutsourcedRBtn;
    public TextField addPartIdTxt;
    public TextField addPartNameTxt;
    public TextField addPartInvTxt;
    public TextField addPartPriceTxt;
    public TextField addPartMaxTxt;
    public TextField addPartCompanyNameTxt;
    public TextField addPartMinTxt;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void onActionAddPartSaveBtn(ActionEvent actionEvent) throws IOException {
        try {
//            boolean isPartInHouse;
//            int id = Integer.parseInt(addPartIdTxt.getText());
//            String name = addPartNameTxt.getText();
//            int stock = Integer.parseInt(addPartInvTxt.getText());
//            double price = Double.parseDouble(addPartPriceTxt.getText());
//            int max = Integer.parseInt(addPartMaxTxt.getText());
//            int min = Integer.parseInt(addPartMinTxt.getText());
//
//            //condition to check which radio button was selected
//            if(addPartInHouseRBtn.isSelected())
//                isPartInHouse = true;
//            else isPartInHouse = false;
//
//            Inventory.addPart(new Part(isPartInHouse, id, name, price, stock, max, min));

            stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
            scene = FXMLLoader.load(getClass().getResource("/warga/inventorysystem/view/MainForm.fxml"));
            stage.setScene(new Scene(scene));
            stage.show();

        } catch(NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialogue");
            alert.setContentText("Please enter a valid value for each text field.");
            alert.showAndWait();
        }
    }

    public void onActionAddPartCancelBtn(ActionEvent actionEvent) throws IOException {
        stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/warga/inventorysystem/view/MainForm.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    public void onActionInHouseSetMachineId(ActionEvent actionEvent) throws IOException {
        stage = (Stage)((RadioButton)actionEvent.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/warga/inventorysystem/view/AddPartInHouse.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    public void onActionOutsourcedSetCompanyName(ActionEvent actionEvent) {
    }
}