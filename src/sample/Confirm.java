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
public class Confirm{

    static boolean answer;

    public static boolean display(String title,String message ) {

        Stage window=new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label=new Label();
        label.setText((message));
//create button
        Button Yesbutton=new Button("yes");
        Button Nobutton=new Button("NO");

        Yesbutton.setOnAction(e->{
            answer=true;
            window.close();
        });
        Nobutton.setOnAction(e->{
            answer=false;
            window.close();
        });
        VBox layout =new VBox(10);


        layout.getChildren().addAll(label,Yesbutton,Nobutton);
        layout.setAlignment(Pos.BASELINE_CENTER);
        Scene scene=new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }
}
