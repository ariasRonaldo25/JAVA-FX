/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodosbutton;

/**
 *
 * @author Ronaldo Arias
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class NodosButton extends Application {

    Scene escena;
    Pane contenedor;
    Button btnNuevo, btnGuardar, btnCancelar;
    Label lbMensaje;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        btnNuevo = new Button("Nuevo");
        btnNuevo.setMinWidth(80);
        btnNuevo.setTranslateX(20);
        btnNuevo.setTranslateY(20);

        btnGuardar = new Button("Guardar");
        btnGuardar.setMinWidth(80);
        btnGuardar.setTranslateX(120);
        btnGuardar.setTranslateY(20);

        btnCancelar = new Button("Cancelar");
        btnCancelar.setMinWidth(80);
        btnCancelar.setTranslateX(220);
        btnCancelar.setTranslateY(20);

        lbMensaje = new Label("Mensaje");
        lbMensaje.setTranslateX(120);
        lbMensaje.setTranslateY(70);

        contenedor = new Pane();
        contenedor.getChildren().addAll(btnNuevo, btnGuardar, btnCancelar, lbMensaje);

        escena = new Scene(contenedor);

        primaryStage.setTitle("ejemplo con Button");
        primaryStage.setMinWidth(350);
        primaryStage.setMinHeight(150);
        primaryStage.setScene(escena);
        primaryStage.show();

    }

}
