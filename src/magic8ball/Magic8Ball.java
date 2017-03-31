
package magic8ball;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author jcamp
 */
public class Magic8Ball extends Application {

    public static void main(String[] args)
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CreateEightBallView.fxml"));
        
        AnchorPane createEightBallLayout = loader.load();
        
        Scene createEightBallScene = new Scene(createEightBallLayout);
        primaryStage.setScene(createEightBallScene);
        primaryStage.setTitle("The Magic 8 Ball");
        primaryStage.show();
    }
    
}
