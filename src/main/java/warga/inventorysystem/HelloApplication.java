package warga.inventorysystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/** This class creates an app that displays messages. */
public class HelloApplication extends Application {

    @Override
    public void init() {
        System.out.println("Starting!");
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/warga/inventorysystem/view/MainForm.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 450);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        System.out.println("Terminated!");
    }

    public static void main(String[] args) {
        /** This is the main method. This is the first method that gets called when you run your java program.*/
        launch();
    }
}