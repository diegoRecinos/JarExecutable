module group.demojar {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens group.demojar to javafx.fxml;
    exports group.demojar;
}