module com.example.ap_pro_ject {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;
    requires javafx.media;


    opens com.example.ap_pro_ject to javafx.fxml;
    exports com.example.ap_pro_ject;
}