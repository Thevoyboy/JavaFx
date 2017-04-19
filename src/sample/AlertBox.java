package sample;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by harsh on 4/19/2017.
 */
public class AlertBox{


    public static void display(String title,String message ) {

        Stage window=new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label=new Label();
        label.setText((message));
        Button closeButton=new Button("close the window");
        closeButton.setOnAction(e->window.close());
        VBox layout =new VBox(10);

        layout.getChildren().addAll(label,closeButton);
        layout.setAlignment(Pos.BASELINE_CENTER);
        Scene scene=new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
}
