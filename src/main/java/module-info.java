module io.dbc.github.qrshare {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;


    opens io.dbc.github.qrshare to javafx.fxml;
    exports io.dbc.github.qrshare;
}