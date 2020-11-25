package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField inputField;

    @FXML
    private ListView listView;

    private final ObservableList<String> wordList = FXCollections.observableArrayList("привет", "привет2");

    @FXML
    public void initialize() {
        listView.setItems(wordList);
    }

    @FXML
    public void addWordToList() {
        String word = inputField.getText();
        if (word.isBlank()) {
            System.out.println("Пустота");
            return;
        }
        listView.getItems().add(word);
        inputField.clear();
    }


}
