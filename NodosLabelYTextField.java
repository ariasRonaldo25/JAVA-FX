/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodoslabelytextfield;

/**
 *
 * @author Ronaldo Arias
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NodosLabelYTextField extends Application {

    //declaracion de componentes
    Scene escena;
    Pane contenedor;
    Label lbNombre, lbApellido;
    TextField txtNombre, txtApellido;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //creacion de componentes y ubicacion de los mismos
        lbNombre = new Label("Nombres");
        lbNombre.setTranslateX(20);
        lbNombre.setTranslateY(20);
        txtNombre = new TextField();
        txtNombre.setTranslateX(90);
        txtNombre.setTranslateY(20);

        lbApellido = new Label("Apellidos");
        lbApellido.setTranslateX(20);
        lbApellido.setTranslateY(60);
        txtApellido = new TextField();
        txtApellido.setTranslateX(90);
        txtApellido.setTranslateY(60);
        
        //creacion del contenedor
        contenedor=new Pane();
        //asignacion de los nodos al contenedor
        contenedor.getChildren().addAll(lbNombre,lbApellido,txtNombre,txtApellido);
        
        //creacion de la escena y asignacion del contendor
        escena=new Scene(contenedor);
        
        //asignacion de propiedades del escenario
        primaryStage.setTitle("ejemplo de label y textfield");
        primaryStage.setMinHeight(300);
        primaryStage.setMinWidth(150);
        primaryStage.setScene(escena);
        primaryStage.show();

    }

}
