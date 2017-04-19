package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

    Stage window;
   // Scene scene1,scene2,scene3;
    Button button;
    public static void main(String[] args){
launch(args);

    }
@Override
    public void start(Stage primaryStage) {
        //throws Exception{
        window=primaryStage;
        window.setTitle("YO MotherFuckers");
        window.setOnCloseRequest(e->{
            e.consume();
            closeProgram();
        });
        Button button=new Button("close program");
        button.setOnAction(e->closeProgram());
    /*Label label1=new Label("welcome to the first scene");
    Button button1=new Button("go to scene2");
    button1.setOnAction(event ->window.setScene(scene2));

    //Layout1-childern are laid out
    VBox layout1=new VBox(20);
    layout1.getChildren().addAll(label1,button1);
    scene1=new Scene(layout1,200,300);

    //button2
    Button button2=new Button("this sucks");
    button2.setOnAction(event ->window.setScene(scene3));

    //Layout2
    StackPane layout2=new StackPane();
    layout2.getChildren().add(button2);
    scene2=new Scene(layout2,600,300);

    //Button3
    Button button3=new Button("this sucks");
    button3.setOnAction(event ->{
        boolean result=Confirm.display("Nude pics","are you sure you want to send");
        System.out.println(result);
    });
*/
    //Layout3
    /*StackPane layout3=new StackPane();
    layout3.getChildren().add(button3);
    scene3=new Scene(layout3,600,300);

    window.setScene(scene1);
    window.setTitle("OMG");
    window.show();*/

    StackPane layout=new StackPane();
    layout.getChildren().add(button);
    Scene scene=new Scene(layout,600,300);

    window.setScene(scene);
    window.setTitle("OMG");
    window.show();

}
private void closeProgram(){
    Boolean answer=Confirm.display("Asian Asshole","sure you want to exit");
    if(answer){
        window.close();
    }
}
}
