package edu.asu.DatabasePart1.DatabasePart1;

import edu.asu.Application.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.util.Scanner;


public class StartCSE360 extends Application {

	private static final DatabaseHelper databaseHelper = new DatabaseHelper();
	private static final Scanner scanner = new Scanner(System.in);
	private Stage primaryStage;
	

	public static void main( String[] args )
	{
		 launch(args);
	}
	
	@Override
    public void start(Stage primaryStage) {
        try {
            databaseHelper.connectToDatabase(); // Connect to the database
            if (databaseHelper.isDatabaseEmpty()) {
            	System.out.println("empty");
            	new FirstPage(databaseHelper).show(primaryStage);
            } else {
            	System.out.println("not empty");
            	new SetupLoginSelectionPage(databaseHelper).show(primaryStage);
                
            }
        } catch (SQLException e) {
            //showErrorDialog("Database Error", e.getMessage());
        }
    }
	

}
