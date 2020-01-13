/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraaplicacionjavafx;

/**
 *
 * @author Ronaldo Arias
 */// realizando los imports necesarios
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;// contenedor
import javafx.scene.text.Text;// nodo

public class MiPrimeraAplicacionJavaFX extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //creamos un nodo de tipo texto
        Text t= new Text("primera aplicacion");
        //creamos el contenedor
        VBox contenedor=new VBox();
        //agregamos el nodo de tipo texto al contenedor
        contenedor.getChildren().add(t);
        //asignamos un tamaño al contenedor
        contenedor.setMinSize(350, 250);
        //creamos una escena y le asignamos a nuestro contenedor
        Scene e=new Scene(contenedor);
        //asignamos propiedades al escenario
        primaryStage.setTitle("PRIMERA APLICACION EN JAVA FX");
        primaryStage.setMaxHeight(500);
        primaryStage.setMaxWidth(500);
        //asignamos la escena al escenario
        primaryStage.setScene(e);
        //mostramos el escenario
        primaryStage.show();
    }

}
