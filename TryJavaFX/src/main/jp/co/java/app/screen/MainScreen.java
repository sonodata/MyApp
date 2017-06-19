
package main.jp.co.java.app.screen;

import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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

		  
		  //入力コンボボックスの作成
		  //入力候補要素の作成
		  
		  ComboBox inputComboBox = new ComboBox(readyInputElem());
		  

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
		  //rootPane.setCenter(textField);
		  rootPane.setCenter(inputComboBox);
		  rootPane.setBottom(clickButton);
		  Scene scene = new Scene(rootPane,200,200);
		  primStage.setScene(scene);
		  primStage.show();
		  
	  }	catch(Exception e ){
		  
		  e.printStackTrace();
		  
	  }
	}
	
	private ObservableList<String> readyInputElem(){
		
		ObservableList<String> elemList = FXCollections.observableArrayList();
		
		ResourceBundle resource = ResourceBundle.getBundle("inputElem");
		
		int elemNum = Integer.parseInt(resource.getString("ElemNum"));
		for(int i = 1;i <= elemNum;i++){
			String elem = resource.getString("InputElem" + i);
			elemList.add(elem);	
		}
		
		return elemList;
	}
	
	
	
}




