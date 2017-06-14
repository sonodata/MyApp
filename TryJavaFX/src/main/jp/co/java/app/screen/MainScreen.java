
package main.jp.co.java.app.screen;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class MainScreen extends Application{
	
	public static void main(String[] args){
		
		launch(args);
		
	}
	
	
	@Override
	public void start(Stage primStage) throws Exception{
		
	  try{
		  
		  Label topLabel = new Label("FX Screen !");
		  TextField textField = new TextField("0");
		  Button clickButton = new Button("Click");

          clickButton.setOnAction(
        		  e -> {topLabel.setText("Inputted \"" + textField.getText() + "\"");}
        		  );
		  
          //参考:匿名クラスを使った場合の実装
		  /*		  
		  clickButton.setOnAction(new EventHandler<ActionEvent>(){
			  
			  @Override
			  public void handle(ActionEvent e){
				  String msg = "Inputted \"" + textField.getText() + "\"";
				  topLabel.setText(msg);
			  }
		  });
*/		  		  
		  BorderPane rootPane = new BorderPane();
		  
		  rootPane.setTop(topLabel);
		  rootPane.setCenter(textField);
		  rootPane.setBottom(clickButton);
		  Scene scene = new Scene(rootPane,200,200);
		  primStage.setScene(scene);
		  primStage.show();
		  
	  }	catch(Exception e ){
		  
		  e.printStackTrace();
		  
	  }
	}
}




