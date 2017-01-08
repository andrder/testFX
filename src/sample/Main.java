package sample;

import dao.TestInitDB;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

   /*     Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        //primaryStage.setMaximized(true);
        Button btn = new Button("Кнопка");
        //primaryStage.getScene().
        root.getChildrenUnmodifiable().add(btn);
        primaryStage.show();

        System.out.println("Hello! \n");*/
      //  TestInitDB testDB = new TestInitDB();

        primaryStage.setTitle("ПРОБУЕМ JAVA FX");

        Pane root = new HBox();
        Scene scene=new Scene(root);

        Button btn = new Button("Кнопка");
        btn.setPrefSize(70,20);

        Menu menu = new Menu("Пункт1");
        MenuBar menuBar = new MenuBar(menu);
        //primaryStage.getScene().
        root.getChildren().addAll(menuBar);

        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
