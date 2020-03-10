module fr.orleans.univ.calculatricefxml {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.orleans.univ.calculatricefxml to javafx.fxml;
    exports fr.orleans.univ.calculatricefxml;
}