package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.providers.MailProvider;

public class Main extends Application {





    @Override
    public void start(Stage primaryStage) throws Exception{


        MailProvider.getInstance().sendMailUsingSsl("mohammedelamin21.me@gmail.com","مرحبا","محتوي الامييل");

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
