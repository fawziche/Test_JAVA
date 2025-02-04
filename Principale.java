import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Principale
{

    
    public static void main (String[] args)
    {
        try
        {
            final String URL = "localhost";
            final String USER = "root";
            final String PASSWORD = "Saadia04";

            Connection connection = null;

            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion réussie à la base de données !");

            // Créer une instruction SQL
            Statement statement = connection.createStatement();
            // Exemple de requête (à adapter en fonction de vos besoins)
            String sql = "SELECT * FROM tEmploye";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) 
            {
                int id = resultSet.getInt("id"); 
                String nom = resultSet.getString("nom"); 
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}