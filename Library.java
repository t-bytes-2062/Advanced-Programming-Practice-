import java.sql.*;
import java.util.Scanner;

public class Library {

    static final String URL =
        "jdbc:mysql://localhost:3306/librarydb";

    static final String USER =
        "root";

    static final String PASSWORD =
        "Tj101125!@#";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Connection con =
                DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
                );

            System.out.println(
                "Database Connected"
            );

            // Insert Book
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author: ");
            String author = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            String insert =
                "INSERT INTO Book " +
                "(BookID, Title, Author, Price, Availability) " +
                "VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps =
                con.prepareStatement(insert);

            ps.setInt(1, id);
            ps.setString(2, title);
            ps.setString(3, author);
            ps.setDouble(4, price);
            ps.setBoolean(5, true);

            ps.executeUpdate();

            System.out.println(
                "Book inserted successfully"
            );

            // Search Book
            System.out.print(
                "Enter Book ID to search: "
            );

            int searchId =
                sc.nextInt();

            String search =
                "SELECT * FROM Book WHERE BookID = ?";

            PreparedStatement searchPs =
                con.prepareStatement(search);

            searchPs.setInt(1, searchId);

            ResultSet rs =
                searchPs.executeQuery();

            if (rs.next()) {

                System.out.println(
                    "Book ID: " +
                    rs.getInt("BookID")
                );

                System.out.println(
                    "Title: " +
                    rs.getString("Title")
                );

                System.out.println(
                    "Author: " +
                    rs.getString("Author")
                );

                System.out.println(
                    "Price: " +
                    rs.getDouble("Price")
                );

                System.out.println(
                    "Available: " +
                    rs.getBoolean("Availability")
                );

            }
            else {

                System.out.println(
                    "Book not found"
                );
            }

            // Display available books
            String available =
                "SELECT * FROM Book " +
                "WHERE Availability = true";

            Statement stmt =
                con.createStatement();

            ResultSet availableRs =
                stmt.executeQuery(available);

            System.out.println(
                "\nAVAILABLE BOOKS"
            );

            while (availableRs.next()) {

                System.out.println(
                    availableRs.getInt("BookID")
                    + " "
                    + availableRs.getString("Title")
                );
            }

            // Change availability
            System.out.print(
                "\nEnter Book ID to issue: "
            );

            int issueId =
                sc.nextInt();

            String update =
                "UPDATE Book SET Availability = false " +
                "WHERE BookID = ?";

            PreparedStatement updatePs =
                con.prepareStatement(update);

            updatePs.setInt(1, issueId);

            updatePs.executeUpdate();

            System.out.println(
                "Book availability updated"
            );

            con.close();

        }
        catch (SQLException e) {

            System.out.println(
                "Database Error: "
                + e.getMessage()
            );
        }

        sc.close();
    }
}
