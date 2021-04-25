package hu.nive.ujratervezes.zarovizsga.peoplesql;

import org.mariadb.jdbc.MariaDbConnection;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PeopleDaoString {

    MariaDbDataSource dataSource;

    public PeopleDaoString(MariaDbDataSource mariaDbDataSource) {
        this.dataSource = mariaDbDataSource;
    }


    public String findIpByName(String firstName, String lastName) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT ip_address FROM people WHERE first_name=? AND last_name=?")
        ) {

            String ipName = null;

            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    ipName = resultSet.getString("ip_address");


                    //Ellenőrzés:
                    // System.out.println(dogNamesList);
                }
                //while sikeres lefutása után visszatérünk a listával
                return ipName;
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot execute the query", sqlException);
        }

    }
}

