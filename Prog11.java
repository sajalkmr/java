package javalab;

import java.sql.*;

public class Prog11 {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/student_database";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "good";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            System.out.println("Connected to the database");
            
            insertStudent(connection, "Anjali", "Kumar", 25, "ISE");
            System.out.println("After Insertion");
            displayAllStudents(connection);
            
            System.out.println("Verifying initial data");
            displayAllStudents(connection);
            
            updateStudent(connection, 1, "Kumar", "Pankaj", 26, "CSE");
            System.out.println("After Updation");
            displayAllStudents(connection);
            
            System.out.println("After Search");
            searchStudent(connection, "Anjali");
            
            
            System.out.println("After Delete");
            deleteStudent(connection, 1);
            displayAllStudents(connection);
            
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }

    private static void insertStudent(Connection connection, String firstName, String lastName, int age, String department) throws SQLException {
        String insertQuery = "INSERT INTO Student(first_name, last_name, age, department) VALUES(?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setInt(3, age);
            preparedStatement.setString(4, department);
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserted Successfully");
            }
        }
    }

    private static void updateStudent(Connection connection, int studentId, String firstName, String lastName, int age, String department) throws SQLException {
        String updateQuery = "UPDATE Student SET first_name = ?, last_name = ?, age = ?, department = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setInt(3, age);
            preparedStatement.setString(4, department);
            preparedStatement.setInt(5, studentId);
            System.out.println("Executing update for student ID: " + studentId);
            int rowsUpdated = preparedStatement.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);
            if (rowsUpdated > 0) {
                System.out.println("Student record with ID " + studentId + " updated successfully");
            } else {
                System.out.println("No student record found with ID " + studentId);
            }
        }
    }

    private static void deleteStudent(Connection connection, int studentId) throws SQLException {
        String deleteQuery = "DELETE FROM Student WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, studentId);
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Student record with ID " + studentId + " deleted successfully");
            }
        }
    }

    private static void searchStudent(Connection connection, String firstName) throws SQLException {
        String searchQuery = "SELECT * FROM Student WHERE first_name = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(searchQuery)) {
            preparedStatement.setString(1, firstName);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    System.out.println("Student found successfully");
                    System.out.println("ID: " + resultSet.getInt("id"));
                    System.out.println("FirstName: " + resultSet.getString("first_name"));
                    System.out.println("LastName: " + resultSet.getString("last_name"));
                    System.out.println("Age: " + resultSet.getInt("age"));
                    System.out.println("Department: " + resultSet.getString("department"));
                } else {
                    System.out.println("No Student found");
                }
            }
        }
    }

    private static void displayAllStudents(Connection connection) throws SQLException {
        String selectQuery = "SELECT * FROM Student";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectQuery)) {
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("FirstName: " + resultSet.getString("first_name"));
                System.out.println("LastName: " + resultSet.getString("last_name"));
                System.out.println("Age: " + resultSet.getInt("age"));
                System.out.println("Department: " + resultSet.getString("department"));
                System.out.println("---------------------");
            }
        }
    }
}
