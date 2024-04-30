module com.ihkcreations.randombdphonenumbers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ihkcreations.randombdphonenumbers to javafx.fxml;
    exports com.ihkcreations.randombdphonenumbers;
}