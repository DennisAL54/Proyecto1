import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Main extends Application {
    public static void main(String[] args){
        launch(args);

    }
    public void start(Stage Stage1){
        Stage1.setTitle("Circuit Designer");
        StackPane layout = new StackPane();
        Scene Pantalla = new Scene(layout,1300, 600);
        Stage1.setScene(Pantalla);
        Stage1.show();

    }
}
