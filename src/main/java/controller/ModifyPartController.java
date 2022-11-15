package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ModifyPartController implements Initializable {

    Stage stage;
    Parent scene;

    public ToggleGroup modifyPartTg;
    public TextField modifyPartIdTxt;
    public TextField modifyPartNameTxt;
    public TextField modifyPartInvTxt;
    public TextField modifyPartPriceTxt;
    public TextField modifyPartMaxTxt;
    public TextField modifyPartMachineIdTxt;
    public TextField modifyPartMinTxt;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void onActionModifyPartSaveBtn(ActionEvent actionEvent) {
        // get index off allParts, not table view
    }

    public void onActionModifyPartCancelBtn(ActionEvent actionEvent) throws IOException {
        stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/warga/inventorysystem/view/MainForm.fxml"));
        stage.setScene(new Scene(scene));
    }
}