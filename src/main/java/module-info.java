module com.example.electronicjournalfirst {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.electronicjournalfirst to javafx.fxml;
    exports com.example.electronicjournalfirst;
}