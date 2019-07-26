package bean;
import java.sql.*;
public class RegisterDao {
	public static int register(User u) {
		int status = 0;
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement p = con.prepareStatement("INSERT INTO USER1 VALUES(id.NEXTVAL,?,?,?)");
			p.setString(1,u.getUname());
			p.setString(2,u.getUemail());
			p.setString(3,u.getUpass());
			status = p.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
