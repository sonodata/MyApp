
package main.jp.co.java.app.screen;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;;

public class MainScreen extends Application{
	
	public static void main(String[] args){
		
		launch(args);
		
	}
	
	
	@Override
	public void start(Stage primStage) throws Exception{
		
	  try{
		  
		  BorderPane root = new BorderPane();
		  Scene scene = new Scene(root,400,400);
		  primStage.setScene(scene);
		  primStage.show();
		  
	  }	catch(Exception e ){
		  
		  e.printStackTrace();
		  
	  }
	}
}




