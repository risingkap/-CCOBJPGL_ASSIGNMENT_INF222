package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class OrderController implements Initializable {
    @FXML
    Label name1, name2, name3, qty1, qty2, qty3, price1, price2, price3, lineTotalAmount1, lineTotalAmount2, lineTotalAmount3, finalAmount;
    @FXML
    ImageView img1, img2, img3;

    double amt1,amt2,amt3, finalamt;
    
    public void initialize(URL location, ResourceBundle resources) {

         if (HomeController.blamp.getProductStatus()){
            name1.setText(HomeController.blamp.getProductName());
            price1.setText(Double.toString(HomeController.blamp.getProductPrice()));
            qty1.setText(Double.toString(HomeController.blamp.getProductQuantity()));
            name1.setVisible(true);
            price1.setVisible(true);
            qty1.setVisible(true);

            amt1 = HomeController.blamp.getProductPrice() * HomeController.blamp.getProductQuantity();
            lineTotalAmount1.setText(Double.toString(amt1));
         }
            if (HomeController.clamp.getProductStatus()){
             name2.setText(HomeController.clamp.getProductName());
             price2.setText(Double.toString(HomeController.clamp.getProductPrice()));
             qty2.setText(Double.toString(HomeController.clamp.getProductQuantity()));
             name2.setVisible(true);
             price2.setVisible(true);
             qty2.setVisible(true);

            amt2 = HomeController.clamp.getProductPrice() * HomeController.clamp.getProductQuantity();
             lineTotalAmount2.setText(Double.toString(amt2));
        }
                if (HomeController.wlamp.getProductStatus()){
                name3.setText(HomeController.wlamp.getProductName());
                price3.setText(Double.toString(HomeController.wlamp.getProductPrice()));
                qty3.setText(Double.toString(HomeController.wlamp.getProductQuantity()));
                name3.setVisible(true);
                price3.setVisible(true);
                qty3.setVisible(true);

                amt3 = HomeController.wlamp.getProductPrice() * HomeController.wlamp.getProductQuantity();
                lineTotalAmount3.setText(Double.toString(amt3));
        }


        finalamt = amt1+amt2+amt3;
        finalAmount.setText(Double.toString(finalamt));
    }
}