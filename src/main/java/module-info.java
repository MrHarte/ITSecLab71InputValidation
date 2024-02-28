module org.champlain.itsec.lab71inputvalidation {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.champlain.itsec.lab71inputvalidation to javafx.fxml;
    exports org.champlain.itsec.lab71inputvalidation;
}