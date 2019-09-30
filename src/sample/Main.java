package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application { //Clase main con su respectivo metodo

    @Override
    public void start(Stage primaryStage) throws Exception{// metodo de inicio
        FXMLLoader fxmlLoader = new FXMLLoader(); //Carga el fxml
        fxmlLoader.setLocation(getClass().getResource("Pantalla2.fxml")); // se encarga de llamar el archivo
        Parent root = fxmlLoader.load();
        Controller controller = (Controller) fxmlLoader.getController();// llama al controller
        controller.Mostrar(); // llama al metodo mostrar
        primaryStage.setTitle("My New Circuit"); // le pone titulo a la ventana
        primaryStage.setScene(new Scene(root, 1000, 700)); //ajusta el tamaño
        primaryStage.show();//muestra el resultado

    }


    public static void main(String[] args) {//metodo main, contiene un caso de prueba para la lista (Esta comentado)
        launch(args);
        /*ListaCompuertas lista = new ListaCompuertas();
        lista.AñadirFinal(true);
        lista.AñadirFinal(true);
        lista.AñadirFinal(false);
        lista.AñadirFinal(true);
        lista.AñadirFinal(false);
        lista.AñadirFinal(false);
        lista.MostrarLista();*/

    }
}
