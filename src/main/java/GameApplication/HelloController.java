package GameApplication;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


import java.util.HashSet;
import java.util.Random;
import java.util.ResourceBundle;
import java.net.URL;
import java.util.Set;

public class HelloController implements Initializable {
    private int numOfWord = 0;
    @FXML
    private Label instruction;

    @FXML
    private Button deleteButton, enterButton;

    @FXML
    private Button firstButton, secondButton, thirdButton, fourthButton, fifthButton;

    @FXML
    TextField input;

    @FXML
    VBox wordPane;
    private URL url;
    private ResourceBundle resourceBundle;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.url = url;
        this.resourceBundle = resourceBundle;
        Random generates = new Random();
        Set<Character> usedChar = new HashSet<>();
        char c;
        c = (char)(generates.nextInt(26) + 'A');
        while (usedChar.contains(c)) {
            c = (char)(generates.nextInt(26) + 'A');
        }
        usedChar.add(c);
        firstButton.setText(String.valueOf(c));
        firstButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                input.appendText(firstButton.getText());
            }
        });
        c = (char)(generates.nextInt(26) + 'A');
        while (usedChar.contains(c)) {
            c = (char)(generates.nextInt(26) + 'A');
        }
        usedChar.add(c);
        secondButton.setText(String.valueOf(c));
        secondButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                input.appendText(secondButton.getText());
            }
        });
        c = (char)(generates.nextInt(26) + 'A');
        while (usedChar.contains(c)) {
            c = (char)(generates.nextInt(26) + 'A');
        }
        usedChar.add(c);
        thirdButton.setText(String.valueOf(c));
        thirdButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                input.appendText(thirdButton.getText());
            }
        });
        c = (char)(generates.nextInt(26) + 'A');
        while (usedChar.contains(c)) {
            c = (char)(generates.nextInt(26) + 'A');
        }
        fourthButton.setText(String.valueOf(c));
        usedChar.add(c);
        fourthButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                input.appendText(fourthButton.getText());
            }
        });
        fifthButton.setText(String.valueOf(c));
        usedChar.add(c);
        fifthButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                input.appendText(fifthButton.getText());
            }
        });
        deleteButton.setText("Delete");
        deleteButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(input.getText().length() > 0) {
                    // Delete last char
                    String newText = input.getText().substring(0, input.getText().length()-1);
                    input.setText(newText);
                }
            }
        });
        enterButton.setText("Enter");
        enterButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Label newWord = new Label();
                Font nice = new Font(18.0);
                newWord.setFont(nice);
                newWord.setText(input.getText());
                wordPane.getChildren().add(newWord);
            }
        });
    }


}