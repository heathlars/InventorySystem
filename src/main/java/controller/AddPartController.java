package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.InHouse;
import model.Inventory;
import model.Outsourced;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddPartController implements Initializable {



    Stage stage;
    Parent scene;

    public RadioButton addPartInHouseRBtn;
    public RadioButton addPartOutsourcedRBtn;
    public TextField addPartIdTxt;
    public TextField addPartNameTxt;
    public TextField addPartInvTxt;
    public TextField addPartPriceTxt;
    public TextField addPartMaxTxt;
    public TextField addPartOriginationTxt;
    public TextField addPartMinTxt;
    public Label addPartMachineIdLbl;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void onActionAddPartSaveBtn(ActionEvent actionEvent) throws IOException {
        try {
            int id = Integer.parseInt(addPartIdTxt.getText());
            String name = addPartNameTxt.getText();
            int stock = Integer.parseInt(addPartInvTxt.getText());
            double price = Double.parseDouble(addPartPriceTxt.getText());
            int max = Integer.parseInt(addPartMaxTxt.getText());
            int min = Integer.parseInt(addPartMinTxt.getText());
            int machineId = Integer.parseInt(addPartOriginationTxt.getText());
            String companyName = addPartOriginationTxt.getText();

// issue: how to allow text field "addPartOriginationTxt" allow int or String value depending on radio button clicked. attempted to do if/else statement,
//            if(addPartInHouseRBtn.isSelected()) {
//                int machineId = Integer.parseInt(addPartOriginationTxt.getText());
//            } else {
//                String companyName = addPartOriginationTxt.getText();
//            }

            Inventory.addPart(new Outsourced(id, name, price, stock, min, max, companyName));
            Inventory.addPart(new InHouse(id, name, price, stock, max, min, machineId));

            stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
            scene = FXMLLoader.load(getClass().getResource("/warga/inventorysystem/view/MainForm.fxml"));
            stage.setScene(new Scene(scene));
            stage.show();

        } catch(NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialogue");
            alert.setContentText("Please enter a valid value type for each text field.");
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
    addPartMachineIdLbl.setText("Machine ID");
    }

    public void onActionOutsourcedSetCompanyName(ActionEvent actionEvent) throws IOException {
    addPartMachineIdLbl.setText("Company Name");
    }
}