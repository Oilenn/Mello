module com.example.mello {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.mello to javafx.fxml;
    exports com.example.mello;
}