package dao;

import java.sql.*;

/**
 * Created by Андрей on 02.01.2017.
 */
public class DerbyDBManager {
    private static Connection con = null ;
    private static final String driver = "org.apache.derby.jdbc.EmbeddedDriver" ;
    private static final String url = "jdbc:derby:" ;
    private static String dbName = null;
    public DerbyDBManager(String dbName) {
        this.dbName=dbName;
        if(!dbExists()) {
            try {
                Class.forName(driver) ;
                // Подключение к БД или её создание
                con = DriverManager.getConnection(url + dbName + ";create=true");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private Boolean dbExists()
    {
        Boolean exists = false ;
        try {
            Class.forName(driver) ;
            con = DriverManager.getConnection(url + dbName);
            exists = true ;
        } catch(Exception e) {
            System.out.println("База не существует. Нужно будет создать");// Если база не создана то ничего не делаем
        }
        return(exists) ;
    }
    // запрос на обновление базы данных  (INSERT, UPDATE, CREATE TABLE и т.п.)
    public void executeUpdate(String sql) throws SQLException {
        Statement stmt = con.createStatement() ;
        int count = stmt.executeUpdate(sql) ;
        stmt.close() ;
    }

    // запрос на выборку данных из базы
    public ResultSet executeQuery(String sql) throws SQLException {
        Statement stmt = con.createStatement() ;
        ResultSet result = stmt.executeQuery(sql) ;
        return result;
    }
}
