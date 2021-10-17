package Buscar_Reemplazar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Frame extends Application{
	
	private TextArea buscador;
	private TextArea remplazar;
	private CheckBox Mayus_minus, Expre, Buscar_atras,Resaltar;
	private Button Buscar, Reempl, Reempl_todo, Cerrar, Ayuda;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		buscador=new TextArea();
		
		remplazar=new TextArea();
		
		GridPane panelgrid=new GridPane();
		panelgrid.setGridLinesVisible(true);
		panelgrid.setHgap(5);
		panelgrid.setVgap(5);
		panelgrid.setPadding(new Insets(5));
		panelgrid.addRow(0, new Label("Buscar:"), buscador);
		panelgrid.addRow(1, new Label("Reemplazar con:"), remplazar) ;

		Buscar =new Button("Buscar");
		Buscar.setMinWidth(110);
		
		Reempl=new Button("Reemplazar");
		Reempl.setMinWidth(110);
		
		Reempl_todo=new Button("Reemplazar todo");
		Reempl_todo.setMinWidth(110);
		
		Cerrar=new Button("Cerrar");
		//Cerrar.setOnAction();;
		Cerrar.setMinWidth(110);
		
		Ayuda=new Button("Ayuda");
		Ayuda.setMinWidth(110);
		
		HBox BHBox=new HBox(5);
		BHBox.setAlignment(Pos.BASELINE_RIGHT);
		BHBox.getChildren().addAll(Buscar,Reempl,Reempl_todo,Cerrar,Ayuda);
		
		Mayus_minus=new CheckBox("Mayúsculas y minúsculas");
		
		Expre=new CheckBox("Expresión regular");
		
		Buscar_atras=new CheckBox("Buscar hacia atrás");
		
		Resaltar=new CheckBox("Resaltar");
		
		HBox CBox=new HBox(4);
		CBox.setAlignment(Pos.CENTER);
		CBox.getChildren().addAll(Mayus_minus, Expre, Buscar_atras,Resaltar);
		
		HBox THBox=new HBox(1);
		THBox.setAlignment(Pos.CENTER);
		THBox.getChildren().addAll(panelgrid);
		
		VBox root=new VBox(2);
		root.getChildren().addAll(THBox,CBox,BHBox);
		
		Scene scene=new Scene(root,480,250);
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
