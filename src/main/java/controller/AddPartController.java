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

public class AddPartController implements Initializable {

    Stage stage;
    Parent scene;

    public ToggleGroup addPartTg;
    public TextField addPartIdTxt;
    public TextField addPartNameTxt;
    public TextField addPartInvTxt;
    public TextField addPartMaxTxt;
    public TextField addPartMachineIdTxt;
    public TextField addPartMinTxt;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void onActionAddPartSaveBtn(ActionEvent actionEvent) {
    }

    public void onActionAddPartCancelBtn(ActionEvent actionEvent) throws IOException {
        stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/warga/inventorysystem/view/MainForm.fxml"));
        stage.setScene(new Scene(scene));
    }
}