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
        image1.setImage(new Image("/AND.png"));
        image2.setImage(new Image("/NAND.png"));
        image3.setImage(new Image("/NOR.png"));
        image4.setImage(new Image("/NOT.png"));
        image5.setImage(new Image("/OR.png"));
        image6.setImage(new Image("/XNOR.png"));
        image7.setImage(new Image("/XOR.png"));

    }
}

