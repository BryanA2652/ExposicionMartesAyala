/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
/*package exposicionmartesayala;

import exposicionmartesayala.modelos.driverresults;
import java.sql.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


import javafx.geometry.Insets;
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
/*public class ExposicionMartesAyala extends Application {
    
      private TableView<driverresults> tableView;
    private ComboBox<String> comboBox;
    
    private String driver = "com.mysql.jdbc.Driver";
    private String cadenaconeccion = "jdbc:mysql://localhost:3306/formula01";
    private String usuario = "root";
    private String contraseña = "";
    
   
   public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
         comboBox = new ComboBox<>();
        comboBox.getItems().addAll("2008", "2009", "2010"); // Agrega los años que necesites
        comboBox.setOnAction(e -> ExposicionMartesAyala(comboBox.getValue()));

        tableView = new TableView<>();
        tableView.setItems(FXCollections.observableArrayList());


        TableColumn<driverresults, String> colForName = new TableColumn<>("ForName");
        colForName.setCellValueFactory(new PropertyValueFactory<>("forName"));

        TableColumn<driverresults, String> colSurName = new TableColumn<>("SurName");
        colSurName.setCellValueFactory(new PropertyValueFactory<>("surName"));

        TableColumn<driverresults, Integer> colWins = new TableColumn<>("Wins");
        colWins.setCellValueFactory(new PropertyValueFactory<>("wins"));

        TableColumn<driverresults, Integer> colTotalPoints = new TableColumn<>("TotalPoints");
        colTotalPoints.setCellValueFactory(new PropertyValueFactory<>("totalPoints"));

        TableColumn<driverresults, Integer> colSeasonRank = new TableColumn<>("SeasonRank");
        colSeasonRank.setCellValueFactory(new PropertyValueFactory<>("seasonRank"));

        

        tableView.getColumns().addAll(colForName, colSurName, colWins, colTotalPoints, colSeasonRank);

        VBox vbox = new VBox(10, comboBox, tableView);
        vbox.setPadding(new Insets(10));
        
        
        Scene scene = new Scene(vbox, 800, 600);
        
        primaryStage.setTitle("Tabla conductores - Ayala");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
     private void ExposicionMartesAyala(String year) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        ObservableList<driverresults> results = FXCollections.observableArrayList();

        try {
            con = DriverManager.getConnection(cadenaconeccion, usuario, contraseña);
            String sql = "SELECT * FROM driverresults WHERE YEAR(Year) = ?";
            st = con.prepareStatement(sql);
            st.setInt(1, Integer.parseInt(year));
            rs = st.executeQuery();

            while (rs.next()) {
                driverresults driverResult = new driverresults(
                        rs.getString("forName"),
                        rs.getString("surName"),
                        rs.getInt("Wins"),
                        rs.getInt("Totalpoints"),
                        rs.getInt("SeasonRank")
                );
                results.add(driverResult);
            }

            // Mensaje de conexión
            System.out.println("Se estableció conexión con la BD");
        } catch (Exception e) {
            System.out.println("No se estableció conexión: " + e.getMessage());
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        tableView.setItems(results);
    }
    
}*/
