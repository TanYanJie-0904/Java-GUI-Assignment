module com.yanjie.assignment {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.yanjie.assignment to javafx.fxml;
    exports com.yanjie.assignment;
}