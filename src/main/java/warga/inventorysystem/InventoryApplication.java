package warga.inventorysystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.InHouse;
import model.Inventory;

import java.io.IOException;

/** This class creates an app that displays messages. */
public class InventoryApplication extends Application {

    @Override
    public void init() {
        System.out.println("Starting!");
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InventoryApplication.class.getResource("/warga/inventorysystem/view/MainForm.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1100, 450);
        stage.setTitle("Welcome!");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        System.out.println("Terminated!");
    }

    public static void main(String[] args) {
        /** This is the main method. This is the first method that gets called when you run your java program.*/

        InHouse part1 = new InHouse(1, "wheel", 14.99, 12, 2, 30, 4444);
        InHouse part2 = new InHouse(2, "spoke", 11.99, 40, 6, 80, 3333);

        Inventory.addPart(part1);
        Inventory.addPart(part2);

        launch();
    }
}