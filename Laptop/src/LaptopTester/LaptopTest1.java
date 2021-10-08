package LaptopTester;
import java.sql.*;

public class LaptopTest1 {

	public static void main(String[] args) {
		String url= "jdbc:mysql://localhost:3306/manjunath1";
		String userName= "root";
		String password= "Manju@8095954732";

String insertquery1="INSERT INTO student value('1', 'Manjunath', 'Gadag')"; 



	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection(url, userName, password);
				System.out.println("Connection is Sucessfull with Database:"+url);
				Statement statement = connection.createStatement();
				System.out.println("First Row is inserted");
			


	}
	catch (SQLException sqlException) {
		
		System.out.println(sqlException.getMessage());
		sqlException.printStackTrace();

			}
	catch (Exception classNotFoundException) {
		System.out.println(classNotFoundException.getMessage());
		
	}

}

}