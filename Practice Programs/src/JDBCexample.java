
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author satya
 */
public class JDBCexample {
    public static void main(String args[]) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
    {
       Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/empdb", "aditi", "aditi");
        java.sql.Statement stmt =  con.createStatement();
        ResultSet rs;
        rs = stmt.executeQuery("select * from employee");
        Scanner s=new Scanner(System.in);
        System.out.println("enter id");
        Scanner s1=new Scanner(System.in);
        int emp_id=s.nextInt();
        System.out.println("enter name");
        String  empname=s1.nextLine();
        PreparedStatement p=con.prepareStatement("insert into employee values (emp_id,empname,'01-01-2000')");
        p.setString(2,empname);
        p.setInt(1, emp_id);
        while(rs.next())
        {
            System.out.println("emp_name"+ rs.getString(2));
            System.out.println("updated");
        }
        
        con.close();
    }
}
