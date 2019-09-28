package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;


public class Controller{ // Clase controller (encargada de manejaer el fxml con la pantalla)
    double orgSceneX, orgSceneY;
    double orgTranslateX, orgTranslateY;

    @FXML
    private ImageView image1; //imageviews que contienen las imagenes de las compuertas

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

    public void Mostrar(){ // metodo que permite mostrar la ventana de inicio y las imagenes

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

        image1.setCursor(Cursor.HAND);
        image1.setOnMousePressed(Agarrar);
        image1.setOnMouseDragged(Arrastrar);
        image2.setCursor(Cursor.HAND);
        image2.setOnMousePressed(Agarrar);
        image2.setOnMouseDragged(Arrastrar);
        image3.setCursor(Cursor.HAND);
        image3.setOnMousePressed(Agarrar);
        image3.setOnMouseDragged(Arrastrar);
        image4.setCursor(Cursor.HAND);
        image4.setOnMousePressed(Agarrar);
        image4.setOnMouseDragged(Arrastrar);
        image5.setCursor(Cursor.HAND);
        image5.setOnMousePressed(Agarrar);
        image5.setOnMouseDragged(Arrastrar);
        image6.setCursor(Cursor.HAND);
        image6.setOnMousePressed(Agarrar);
        image6.setOnMouseDragged(Arrastrar);
        image7.setCursor(Cursor.HAND);
        image7.setOnMousePressed(Agarrar);
        image7.setOnMouseDragged(Arrastrar);

    }
    EventHandler<MouseEvent> Agarrar =
            new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent t) {
                    orgSceneX = t.getSceneX();
                    orgSceneY = t.getSceneY();
                    orgTranslateX = ((ImageView)(t.getSource())).getTranslateX();
                    orgTranslateY = ((ImageView)(t.getSource())).getTranslateY();
                }
            };
    EventHandler<MouseEvent> Arrastrar =
            new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent t) {
                    double offsetX = t.getSceneX() - orgSceneX;
                    double offsetY = t.getSceneY() - orgSceneY;
                    double newTranslateX = orgTranslateX + offsetX;
                    double newTranslateY = orgTranslateY + offsetY;

                    ((ImageView)(t.getSource())).setTranslateX(newTranslateX);
                    ((ImageView)(t.getSource())).setTranslateY(newTranslateY);
                }
            };
}

