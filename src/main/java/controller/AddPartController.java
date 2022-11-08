package controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class AddPartController implements Initializable {


    public ToggleGroup addPartTg;
    public TextField addPartIdTxt;
    public TextField addPartNameTxt;
    public TextField addPartInvTxt;
    public TextField addPartMaxTxt;
    public TextField addPartMachineIdTxt;
    public TextField addPartMinTxt;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("I am initialized");
    }

    public void onActionAddPartSaveBtn(ActionEvent actionEvent) {
    }

    public void onActionAddPartCancelBtn(ActionEvent actionEvent) {
    }
}