package es.ulpgc.kata4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:chinook.db")){
            List<Track> tracks = new SqliteTrackLoader(connection).loadAll();
            for (Track track: tracks){
                System.out.println(track);
            }
        }
    }
}