import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test extends Application {
    private TextField Limit;
    private Button Button;
    private TextArea TextArea;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Limit = new TextField();
        Button = new Button("Calculate");
        TextArea = new TextArea();

        Button.setOnAction(e -> ButtonActionPerformed());

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(Limit, Button, TextArea);

        Scene scene = new Scene(vbox, 400, 400);

        primaryStage.setTitle("Prime Numbers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void ButtonActionPerformed() {
        String input = Limit.getText();
        int limit = Integer.parseInt(input);
        TextArea.clear();

        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                TextArea.appendText(i + " ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}