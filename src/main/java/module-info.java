module warga.inventorysystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens warga.inventorysystem to javafx.fxml;
    exports warga.inventorysystem;
}