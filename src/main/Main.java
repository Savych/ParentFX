package main;

import javafx.application.Application;
import javafx.stage.Stage;
import main.views.MainWindow;
import main.views.ModelListView;

public class Main extends Application {
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;

    @Override
    public void start(Stage primaryStage) throws Exception {
        new MainWindow().init(primaryStage).setContent(new ModelListView().init());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
