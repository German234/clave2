module com.parcialfinal.tarearecordatorio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.parcialfinal.tarearecordatorio to javafx.fxml;
    exports com.parcialfinal.tarearecordatorio;
}