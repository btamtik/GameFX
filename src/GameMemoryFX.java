import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Betti Tamtik on 23.10.2016.
 */
public class GameMemoryFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox= new VBox();
        Scene login = new Scene(vbox, 300, 300);
        primaryStage.setScene(login);
        primaryStage.show();

        Label pealkiri = new Label("Tere tulemast mängima! Mis on sinu nimi?");
        TextField nimiField = new TextField();
        Button submitButton = new Button("Alusta mängimist");
        
        vbox.getChildren().addAll(pealkiri, nimiField, submitButton);

        submitButton.setOnAction(event -> {
            String nimi = nimiField.getText();
            System.out.println(nimi);
        });

    }
}
