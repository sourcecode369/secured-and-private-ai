package com.portal.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.portal.dao.EmployeeDao;
import com.portal.utility.ConnectionProvider;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean validate(int empid, String password)
	{
		try(
				Connection conn=ConnectionProvider.getDBCOnnection();
			)
		{
			
			PreparedStatement ps=conn.prepareStatement("select * from LoginInfo where EId=? and Password=?");
			ps.setInt(1,empid);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
				
		}
			
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return false;
	}
	

}
