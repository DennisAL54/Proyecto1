package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView image3;

    @FXML
    private ImageView image4;

    @FXML
    private ImageView image5;

    @FXML
    private ImageView image6;

    @FXML
    private ImageView image7;

    public void Mostrar(){

        Image imagen1 = new Image("/AND.png");
        Image imagen2 = new Image("/NAND.png");
        Image imagen3 = new Image("/NOR.png");
        Image imagen4 = new Image("/NOT.png");
        Image imagen5 = new Image("/OR.png");
        Image imagen6 = new Image("/XNOR.png");
        Image imagen7 = new Image("/XOR.png");

        image1.setImage(imagen1);
        image2.setImage(imagen2);
        image3.setImage(imagen3);
        image4.setImage(imagen4);
        image5.setImage(imagen5);
        image6.setImage(imagen6);
        image7.setImage(imagen7);


    }
}

