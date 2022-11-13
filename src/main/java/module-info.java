module warga.inventorysystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens warga.inventorysystem to javafx.fxml;
    exports warga.inventorysystem;
    exports controller;
    opens controller to javafx.fxml;
    exports model;
    opens model to javafx.fxml;
}