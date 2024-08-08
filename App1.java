import java.sql.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import code.DatabaseConnection;
@WebServlet("/App")
public class App1 extends HttpServlet{
    public static void main(String[] args) throws Exception {
        private static final long serialVersionUID=1l;
        protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","");
            //Statement st = con.createStatement();
            Connection con=DatabaseConnection.initializeDatabase();
            PreparedStatement ps=con.prepareStatement("insert into userinfo values(?,?,?,?)");
            ps.setString(1,request.getParameter("string"));
            ps.setString(2,request.getParameter("string"));
            ps.setString(3,request.getParameter("string"));
            ps.setString(4,request.getParameter("string"));
            ps.executeUpdate();
            st.close();
            con.close();
            PrintWriter out=response.getWriter();
            
            //ResultSet rs=ps.executeQuery("select* from userinfo");
            int rs=ps.executeUpdate();
            if(rs>0){
                System.out.println("Success");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    }
}
