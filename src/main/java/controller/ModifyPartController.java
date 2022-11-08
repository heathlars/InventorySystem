package controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class ModifyPartController implements Initializable {


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
        System.out.println("I am initialized");
    }

    public void onActionModifyPartSaveBtn(ActionEvent actionEvent) {
    }

    public void onActionModifyPartCancelBtn(ActionEvent actionEvent) {
    }
}