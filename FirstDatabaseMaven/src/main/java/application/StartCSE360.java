package application;

import javafx.application.Application;
import javafx.stage.Stage;
import java.sql.SQLException;

import databasePart1.DatabaseHelper;


public class StartCSE360 extends Application {

	private static final DatabaseHelper databaseHelper = new DatabaseHelper();
	
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
