package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    public TextField addPartMachineIdTxt;
    public TextField addPartMinTxt;
    public Label addPartMachineIdLbl;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void onActionAddPartSaveBtn(ActionEvent actionEvent) throws IOException {
            stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
            scene = FXMLLoader.load(getClass().getResource("/warga/inventorysystem/view/MainForm.fxml"));
            stage.setScene(new Scene(scene));
            stage.show();
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