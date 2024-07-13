/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package exposicionmartesayala;

import exposicionmartesayala.modelos.constructorresults;
import java.sql.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author ROCIO
 */
public class ResultadoConstructores extends Application {
     private TableView<constructorresults> resultsTableView;
    private ObservableList<constructorresults> resultsData;
    private ComboBox<Integer> pointsComboBox;
    
    private String driver = "com.mysql.jdbc.Driver";
    private String cadenaconeccion = "jdbc:mysql://localhost:3306/formula01";
    private String usuario = "root";
    private String contraseña = "";
    
    @Override
    public void start(Stage primaryStage) {
        
         // Crear ComboBox para seleccionar puntos
        pointsComboBox = new ComboBox<>();
        pointsComboBox.getItems().addAll(0, 1, 2, 3, 4, 5); // Agregar más puntos según sea necesario
        pointsComboBox.setOnAction(event -> {
            Integer selectedPoints = pointsComboBox.getSelectionModel().getSelectedItem();
            if (selectedPoints != null) {
                ResultadoConstructores(selectedPoints);
            } 
          });
        
        // Crear TableView para mostrar los resultados
        resultsTableView = new TableView<>();
        resultsData = FXCollections.observableArrayList();
        resultsTableView.setItems(resultsData);

        TableColumn<constructorresults, Integer> idColumn = new TableColumn<>("ConstructorResultId");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("constructorResultId"));

        TableColumn<constructorresults, Integer> raceIdColumn = new TableColumn<>("Race ID");
        raceIdColumn.setCellValueFactory(new PropertyValueFactory<>("raceId"));

        TableColumn<constructorresults, Integer> constructorIdColumn = new TableColumn<>("Constructor ID");
        constructorIdColumn.setCellValueFactory(new PropertyValueFactory<>("constructorId"));

        TableColumn<constructorresults, Float> pointsColumn = new TableColumn<>("Points");
        pointsColumn.setCellValueFactory(new PropertyValueFactory<>("points"));

        TableColumn<constructorresults, String> statusColumn = new TableColumn<>("Status");
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        resultsTableView.getColumns().addAll(idColumn, raceIdColumn, constructorIdColumn, pointsColumn, statusColumn);

        // Crear layout y agregar componentes
        VBox vbox = new VBox(pointsComboBox, resultsTableView);
        Scene scene = new Scene(vbox, 500, 350);

        primaryStage.setTitle("Tabla resultados constructores");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
   private void ResultadoConstructores(int points) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
         resultsData.clear();

        //ObservableList<constructorresults> results = FXCollections.observableArrayList();

        try {
            con = DriverManager.getConnection(cadenaconeccion, usuario, contraseña);
            String sql = "SELECT * FROM constructorresults WHERE points = ?";
            st = con.prepareStatement(sql);
            st.setInt(1, points);
            rs = st.executeQuery();

            while (rs.next()) {
                constructorresults result = new constructorresults(
                        rs.getInt("constructorResultId"),
                        rs.getInt("raceId"),
                        rs.getInt("constructorId"),
                        rs.getFloat("points"),
                        rs.getString("status")
                );
                resultsData.add(result);
            }

            // Mensaje de conexión
            System.out.println("Se estableció conexión con la BD");
        } catch (Exception e) {
            System.out.println("No se estableció conexión: " + e.getMessage());
            e.printStackTrace();
        } 

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
