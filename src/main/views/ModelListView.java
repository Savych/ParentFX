package main.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import main.model.Person;

import java.io.IOException;

public class ModelListView {
    private static String fxml = "ModelListView.fxml";
    @FXML
    private ListView<Person> list;

    @FXML
    public void initialize() {
        ObservableList<Person> array = FXCollections.observableArrayList();
        array.addAll(new Person("Savely", "Kavykov"),
                new Person("Momo", "Devyluke"));
        list.setItems(array);
    }

    public Parent init() {
        try {
            return FXMLLoader.load(getClass().getResource(fxml));
        } catch (IOException e) {
            return null;
        }
    }
}
