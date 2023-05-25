package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class drinkcontroller {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Blue blue = new Blue();
    Cokefloat cokefloat = new Cokefloat();
    Frappe frappe = new Frappe();
    MangoG mangog = new MangoG();
    Sarsi sarsi = new Sarsi();

    public void initialize() {

        blue.setColor("Blue");
        blue.setTaste("Fruity");

        cokefloat.setColor("White & Brown");
        cokefloat.setTaste("Sweet");

        frappe.setColor("Brown");
        frappe.setTaste("Sweet");

        mangog.setColor("Yellow");
        mangog.setTaste("Very Sweet");

        sarsi.setColor("Dark");
        sarsi.setTaste("Sweet");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Blue Frappe is " + blue.getColor() + " and " + blue.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Cokefloats are " + cokefloat.getColor() + " and " + cokefloat.getTaste());
        }
        if (sourceButton.equals(btn3)) {
            alert.setContentText("Frappes are " + frappe.getColor() + " and " + frappe.getTaste());
        }
        if (sourceButton.equals(btn4)) {
            alert.setContentText("Mango Graham Shakes are " + mangog.getColor() + " and " + mangog.getTaste());
        }
        if (sourceButton.equals(btn5)) {
            alert.setContentText("Sarsi are " + sarsi.getColor() + " and " + sarsi.getTaste());
        }

        alert.showAndWait();

    }
}