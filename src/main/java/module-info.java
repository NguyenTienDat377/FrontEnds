module com.example.frontends {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens GameApplication to javafx.fxml;
    exports GameApplication;
}