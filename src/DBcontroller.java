import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DBcontroller {
	;
	public ArrayList getcustomer(int c) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM customer_info WHERE custID="+String.valueOf(c));   
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(String.valueOf(rs.getInt("custID")));
				arrL.add(rs.getString("Car_plate"));
				arrL.add(rs.getString("Owner"));
				arrL.add(rs.getString("Owner_ID"));
				arrL.add(rs.getString("PhoneH"));
				arrL.add(rs.getString("PhoneC"));
				arrL.add(rs.getString("Cellphone"));
				arrL.add(rs.getString("Address"));
				arrL.add(rs.getString("Cartype"));
				arrL.add(rs.getString("Man_Date"));
				arrL.add(rs.getString("Displacement"));
				arrL.add(rs.getString("Car_color"));
				arrL.add(rs.getString("Gear"));
				arrL.add(rs.getString("Mileage"));
				arrL.add(rs.getString("Invoice_com"));
				arrL.add(rs.getString("Receipt"));
				arrL.add(rs.getString("Invoice_add"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	
	public ArrayList searchcustomer(String info) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM customer_info WHERE Owner LIKE ?||'%' OR Cellphone LIKE ? OR Car_plate LIKE ? ");   
			pst.setString(1, info);
			pst.setString(2, info);
			pst.setString(3, info);
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(String.valueOf(rs.getInt("custID")));
				arrL.add(rs.getString("Car_plate"));
				arrL.add(rs.getString("Owner"));
				arrL.add(rs.getString("Owner_ID"));
				arrL.add(rs.getString("PhoneH"));
				arrL.add(rs.getString("PhoneC"));
				arrL.add(rs.getString("Cellphone"));
				arrL.add(rs.getString("Address"));
				arrL.add(rs.getString("Cartype"));
				arrL.add(rs.getString("Man_Date"));
				arrL.add(rs.getString("Displacement"));
				arrL.add(rs.getString("Car_color"));
				arrL.add(rs.getString("Gear"));
				arrL.add(rs.getString("Mileage"));
				arrL.add(rs.getString("mile"));
				arrL.add(rs.getString("Invoice_com"));
				arrL.add(rs.getString("Receipt"));
				arrL.add(rs.getString("Invoice_add"));
				arrL.add(rs.getString("custID"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	
	public ArrayList mainsearchcustomer(String info) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM customer_info WHERE Car_plate=? ");   
			pst.setString(1, info);
			rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("Cartype"));
				arrL.add(rs.getString("Man_Date"));
				arrL.add(rs.getString("Displacement"));
				arrL.add(rs.getString("Mileage"));
				arrL.add(rs.getString("mile"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	
	public int countcust() {
		int amount =0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			String sql =("SELECT COUNT(*) AS total FROM customer_info");
			rs= st.executeQuery(sql);
			while(rs.next()) {
			amount=rs.getInt("total");
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return amount;
	}
	public void addnewcust(String[] info){
		String[] vi=new String[17];
		vi=info;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO customer_info (custID, Car_plate, Owner,Owner_ID,PhoneH,PhoneC,Cellphone,Address,Cartype,Man_Date,Displacement,Car_color,Gear,Mileage,mile,Invoice_com,Receipt,Invoice_add) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");                                           
			stmt.setString(1, vi[0]);
			stmt.setString(2, vi[1]);
			stmt.setString(3, vi[2]);
			stmt.setString(4, vi[3]);
			stmt.setString(5, vi[4]);
			stmt.setString(6, vi[5]);
			stmt.setString(7, vi[6]);
			stmt.setString(8, vi[7]);
			stmt.setString(9, vi[8]);
			stmt.setString(10, vi[9]);
			stmt.setString(11, vi[10]);
			stmt.setString(12, vi[11]);
			stmt.setString(13, vi[12]);
			stmt.setString(14, vi[13]);
			stmt.setString(15, vi[14]);
			stmt.setString(16, vi[15]);
			stmt.setString(17, vi[16]);
			stmt.setString(18, vi[17]);
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "新增成功", "通知", JOptionPane.WARNING_MESSAGE);
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
	}
	
	public void updatecust(String[] data) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			
			PreparedStatement stmt = conn.prepareStatement("UPDATE customer_info SET Owner=?,Owner_ID=?,PhoneH=?,PhoneC=?,Cellphone=?,Address=?,Cartype=?,Man_Date=?,Displacement=?,Car_color=?,Gear=?,Mileage=?,Invoice_com=?,Receipt=?,Invoice_add=? WHERE Car_plate = ?");
			stmt.setString(1, data[2]);
			stmt.setString(2, data[3]);
			stmt.setString(3, data[4]);
			stmt.setString(4, data[5]);
			stmt.setString(5, data[6]);
			stmt.setString(6, data[7]);
			stmt.setString(7, data[8]);
			stmt.setString(8, data[9]);
			stmt.setString(9, data[10]);
			stmt.setString(10, data[11]);
			stmt.setString(11, data[12]);
			stmt.setString(12, data[13]);
			stmt.setString(13, data[14]);
			stmt.setString(14, data[15]);
			stmt.setString(15, data[16]);
			stmt.setString(16, data[1]);
			JOptionPane.showMessageDialog(null, "修改成功", "提示", JOptionPane.WARNING_MESSAGE);
			stmt.executeUpdate();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
	}
	
	public String[] vendorinfo(int c){
		String[] vi=new String[7];
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			String sql =("SELECT * FROM vendor_info WHERE Vendor_ID="+String.valueOf(c));
			rs= st.executeQuery(sql);
			while(rs.next()) {
			vi[0]=rs.getString("Vendor_ID");
			vi[1]=rs.getString("Vendor_Name");
			vi[2]=rs.getString("Manager");
			vi[3]=rs.getString("Connector");
			vi[4]=rs.getString("Phone");
			vi[5]=rs.getString("Cellphone");
			vi[6]=rs.getString("Address");
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		return vi;
	}
	public void newvendorinfo(String[] info){
		String[] vi=new String[7];
		vi=info;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO vendor_info (Vendor_ID, Vendor_Name, Manager,Connector,Phone,Cellphone,Address) VALUES(?,?,?,?,?,?,?)");
			stmt.setString(1, vi[0]);
			stmt.setString(2, vi[1]);
			stmt.setString(3, vi[2]);
			stmt.setString(4, vi[3]);
			stmt.setString(5, vi[4]);
			stmt.setString(6, vi[5]);
			stmt.setString(7, vi[6]);
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "新增成功", "提示", JOptionPane.WARNING_MESSAGE);
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
	}
	public int countamount() {
		int amount =0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			String sql =("SELECT COUNT(*) AS total FROM vendor_info");
			rs= st.executeQuery(sql);
			while(rs.next()) {
			amount=rs.getInt("total");
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return amount;
	}
	
	public void updatevendor(String[] data) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			
			PreparedStatement stmt = conn.prepareStatement("UPDATE vendor_info SET Vendor_Name=?,Manager=?,Connector=?,Phone=?,Cellphone=?,Address=? WHERE Vendor_ID = ?");
			stmt.setString(1, data[1]);
			stmt.setString(2, data[2]);
			stmt.setString(3, data[3]);
			stmt.setString(4, data[4]);
			stmt.setString(5, data[5]);
			stmt.setString(6, data[6]);
			stmt.setString(7, data[0]);
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "修改成功", "提示", JOptionPane.WARNING_MESSAGE);
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
	}
	public ArrayList queryvendor(String info) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM vendor_info WHERE Vendor_Name LIKE '%'||?||'%' OR Cellphone LIKE '%'||?||'%' OR Manager LIKE'%'||?||'%' OR Phone LIKE '%'||?||'%'");   
				pst.setString(1, info);
				pst.setString(2, info);
				pst.setString(3, info);
				pst.setString(4, info);
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("Vendor_ID"));
				arrL.add(rs.getString("Vendor_Name"));
				arrL.add(rs.getString("Manager"));
				arrL.add(rs.getString("Connector"));
				arrL.add(rs.getString("Phone"));
				arrL.add(rs.getString("Cellphone"));
				arrL.add(rs.getString("Address"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
		
	}
	
	public ArrayList getvendor() {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM `vendor_info`");   
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("Vendor_Name"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	
	
	public int countvendor() {
		int amount =0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			String sql =("SELECT COUNT(*) AS total FROM vendor_info");
			rs= st.executeQuery(sql);
			while(rs.next()) {
			amount=rs.getInt("total");
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return amount;
	}
	
	public ArrayList mstaff() {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM maintenance_staff");   
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("Staff_ID"));
				arrL.add(rs.getString("staff_name"));
				arrL.add(rs.getString("staff_phone"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	public int countstaff() {
		int amount =0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			String sql =("SELECT COUNT(*) AS total FROM maintenance_staff");
			rs= st.executeQuery(sql);
			while(rs.next()) {
			amount=rs.getInt("total");
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return amount;
	}
	public void addnewstaff(String[] info){
		String[] vi=new String[3];
		vi=info;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO maintenance_staff (staff_ID, staff_name, staff_phone) VALUES(?,?,?)");
			stmt.setString(1, vi[0]);
			stmt.setString(2, vi[1]);
			stmt.setString(3, vi[2]);
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "新增成功", "通知", JOptionPane.WARNING_MESSAGE);
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
	}
	public String[] querystaff(int c,int situ){
		String[] vi=new String[7];
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			String sql =("SELECT * FROM maintenance_staff WHERE staff_ID="+String.valueOf(c));
			rs= st.executeQuery(sql);
			switch(situ) {
			case 1:
				while(rs.next()) {
				vi[0]=rs.getString("staff_ID");
				vi[1]=rs.getString("staff_name");
				vi[2]=rs.getString("staff_phone");
				}
				break;
			case 2:
				while(rs.next()) {
					vi[0]=rs.getString("staff_name");
					}
				break;
		}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		return vi;
	}
	public ArrayList getallstaffname(){
		ArrayList<String> arrL = new ArrayList<>(); 
		String[] vi;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			String sql =("SELECT * FROM maintenance_staff");
			rs= st.executeQuery(sql);
			while(rs.next()) {
				arrL.add(rs.getString("staff_name"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		return arrL;
	}
	public ArrayList carinfoshow() {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM car_info ORDER BY car_T");   
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("car_T"));
				arrL.add(rs.getString("car_name"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	public ArrayList searchcartype(String t) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM car_info WHERE car_T LIKE ?");   
					pst.setString(1, t);
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("car_name"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	
	public void addnewcar(String[] info){
		String[] vi=new String[2];
		vi=info;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO car_info (car_T, car_name) VALUES(?,?)");
			stmt.setString(1, vi[0]);
			stmt.setString(2, vi[1]);
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "新增成功", "通知", JOptionPane.WARNING_MESSAGE);
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
	}
	public ArrayList minfoshow() {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM maintenance_info");   
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("maintain_ID"));
				arrL.add(rs.getString("maintain_name"));
				arrL.add(rs.getString("class"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	public void addminfo(String[] info){
		String[] vi=new String[3];
		vi=info;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO maintenance_info (maintain_ID, maintain_name,class) VALUES(?,?,?)");
			stmt.setString(1, vi[0]);
			stmt.setString(2, vi[1]);
			stmt.setString(3, vi[2]);
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "新增成功", "通知", JOptionPane.WARNING_MESSAGE);
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
	}
	public int countcheck() {
		int amount =0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			String sql =("SELECT COUNT(*) AS total FROM check_data");
			rs= st.executeQuery(sql);
			while(rs.next()) {
			amount=rs.getInt("total");
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return amount;
	}
	public ArrayList checkshow() {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM check_data");   
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("check_ID"));
				arrL.add(rs.getString("check_nickname"));
				arrL.add(rs.getString("check_name"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	public void addcheck(String[] info){
		String[] vi=new String[3];
		vi=info;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO check_data (check_ID,check_nickname ,check_name) VALUES(?,?,?)");
			stmt.setString(1, vi[0]);
			stmt.setString(2, vi[1]);
			stmt.setString(3, vi[2]);
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "新增成功", "通知", JOptionPane.WARNING_MESSAGE);
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
	}
	public ArrayList querycheck(String info) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM check_data WHERE check_nickname LIKE ?||'%'");   
			pst.setString(1, info);
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("check_name"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	
	public ArrayList querymaintanenceinfo(String info) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM vendor_info WHERE Vendor_Name LIKE '%'||?||'%' OR Cellphone LIKE '%'||?||'%' OR Manager LIKE'%'||?||'%' OR Phone LIKE '%'||?||'%'");   
				pst.setString(1, info);
				pst.setString(2, info);
				pst.setString(3, info);
				pst.setString(4, info);
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("Vendor_ID"));
				arrL.add(rs.getString("Vendor_Name"));
				arrL.add(rs.getString("Manager"));
				arrL.add(rs.getString("Connector"));
				arrL.add(rs.getString("Phone"));
				arrL.add(rs.getString("Cellphone"));
				arrL.add(rs.getString("Address"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
		
	} 
	public ArrayList querycustinfo(String info) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM customer_info WHERE Car_plate LIKE ?");   
				pst.setString(1, info);
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("Owner"));
				arrL.add(rs.getString("Cellphone"));
				arrL.add(rs.getString("Cartype"));
				arrL.add(rs.getString("Man_Date"));
				arrL.add(rs.getString("Displacement"));
				arrL.add(rs.getString("Mileage"));
				arrL.add(rs.getString("mile"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
		
	} 
	public ArrayList querycustinfo2(String info) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM customer_info WHERE Car_plate LIKE ?");   
				pst.setString(1, info);
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("Invoice_com"));
				arrL.add(rs.getString("Receipt"));
				arrL.add(rs.getString("Invoice_add"));
				arrL.add(rs.getString("Cartype"));
				arrL.add(rs.getString("mile"));
				arrL.add(rs.getString("Man_Date"));
				arrL.add(rs.getString("Displacement"));
				
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
		
	} 
	
	public ArrayList querycustinfo3(String info,int c) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			switch(c) {
			  case 1://query name
				  PreparedStatement pst = conn.prepareStatement("SELECT * FROM customer_info WHERE Owner=?");   
					pst.setString(1, info);
					rs= pst.executeQuery();
				while(rs.next()) {
					arrL.add(rs.getString("Car_plate"));
				}
			    break;
			  case 2:
				  PreparedStatement pst2 = conn.prepareStatement("SELECT * FROM customer_info WHERE Car_plate=?");   
					pst2.setString(1, info);
					rs= pst2.executeQuery();
				while(rs.next()) {
					arrL.add(rs.getString("Car_plate"));
				}
			    break;
			  case 3:
				  PreparedStatement pst3 = conn.prepareStatement("SELECT * FROM customer_info WHERE Cellphone=?");   
					pst3.setString(1, info);
					rs= pst3.executeQuery();
				while(rs.next()) {
					arrL.add(rs.getString("Car_plate"));
				}
				break;
			  case 4:
				  PreparedStatement pst4 = conn.prepareStatement("SELECT * FROM customer_info WHERE Car_plate=?");   
					pst4.setString(1, info);
					rs= pst4.executeQuery();
				while(rs.next()) {
					arrL.add(rs.getString("Owner"));
					arrL.add(rs.getString("Cartype"));
					arrL.add(rs.getString("Man_Date"));
					arrL.add(rs.getString("Displacement"));
				}
				break;
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
		
	} 
	public ArrayList queryminfoname(String info) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM maintenance_info WHERE maintain_ID LIKE ?||'%'");  
			
				pst.setString(1, info);
				
				rs= pst.executeQuery();
				
				
			while(rs.next()) {
				
				arrL.add(rs.getString("maintain_name"));
				//System.out.print("Database is connected !");
			}
			conn.close();
			
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	public ArrayList getminfo(String info) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM maintenance_info WHERE maintain_name=?");  
				pst.setString(1, info);
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("maintain_name"));
				arrL.add(rs.getString("class"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	
	public ArrayList getmainidinfo(String id) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM customer_maintain_info WHERE ID=?");  
				pst.setString(1, id);
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("ID"));
				arrL.add(rs.getString("car_plate"));
				arrL.add(rs.getString("owner_name"));
				arrL.add(rs.getString("phone"));
				arrL.add(rs.getString("staff_name"));
				arrL.add(rs.getString("cost"));
				arrL.add(rs.getString("time"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	
	public void saveminfo(String[] info,ArrayList<String> arrl){
		String[] vi=new String[6];
		vi=info;
		int amount=0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT COUNT(*)AS total FROM customer_maintain_info WHERE ID = ?");
			pst.setString(1, vi[0]);
			rs= pst.executeQuery();
			while(rs.next()) {
				amount = rs.getInt("total");
				}
			
			
			if(amount!=0) {
				//System.out.print("WTF1");
				PreparedStatement stmt = conn.prepareStatement("UPDATE  customer_maintain_info SET car_plate=?,owner_name=?,phone=?,staff_name=?,cost=? WHERE ID=?");
				stmt.setString(1, vi[1]);
				stmt.setString(2, vi[2]);
				stmt.setString(3, vi[3]);
				stmt.setString(4, vi[4]);
				stmt.setString(5, vi[5]);
				stmt.setString(6, vi[0]);
				stmt.executeUpdate();
				PreparedStatement stmt2 = conn.prepareStatement("DELETE FROM repair_item WHERE list_ID=?");
				stmt2.setString(1,vi[0]);
				stmt2.executeUpdate();
				for (int i = 0; i < arrl.size(); i++) {
					PreparedStatement stmt3 = conn.prepareStatement("INSERT INTO repair_item (list_ID,repair_item) VALUES(?,?)");
					stmt3.setString(1, vi[0]);
					stmt3.setString(2, arrl.get(i));
					stmt3.executeUpdate();
					}
				conn.close();
			}
			else {
				//System.out.print("WTF2");
				PreparedStatement stmt = conn.prepareStatement("INSERT INTO customer_maintain_info (ID, car_plate,owner_name,phone,staff_name,cost) VALUES(?,?,?,?,?,?)");
				stmt.setString(1, vi[0]);
				stmt.setString(2, vi[1]);
				stmt.setString(3, vi[2]);
				stmt.setString(4, vi[3]);
				stmt.setString(5, vi[4]);
				stmt.setString(6, vi[5]);
				stmt.executeUpdate();
				PreparedStatement stmt2 = conn.prepareStatement("INSERT INTO repair_item (list_ID,repair_item) VALUES(?,?)");
				for (int i = 0; i < arrl.size(); i++) {
					stmt2.setString(1, vi[0]);
					stmt2.setString(2, arrl.get(i).toString());
					stmt2.executeUpdate();
					}
				conn.close();
			}	
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
	}
	
	
	public int getmcount(){
		int amount=0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT COUNT(*)AS total FROM customer_maintain_info");
			rs= pst.executeQuery();
			while(rs.next()) {
				amount = rs.getInt("total");
				}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		return amount;
	}
	
	public int checkpassword (String pword) { 
		int flag=0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM password_list WHERE password=?");  
				pst.setString(1, pword);
				rs= pst.executeQuery();
			if(rs.next()) {
				flag=1;
			}else {
				flag=0;
			}
			
			
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		return flag;
	}
	
	public int getrev (String date1, String date2) { 
		int amount=0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT SUM(price) AS revenue FROM complete_case WHERE Date BETWEEN  ? AND ?");  
			pst.setString(1, date1);
			pst.setString(2, date2);
			rs= pst.executeQuery();
			while(rs.next()) {
			amount=rs.getInt("revenue");
			}
			conn.close();	
			
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		};
		return amount;
	}
	
	public int[] getrevtype (String date1, String date2) { 
		int[] amount=new int[3];
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			// cash
			PreparedStatement pst = conn.prepareStatement("SELECT SUM(price) AS revenue FROM complete_case WHERE Date BETWEEN  ? AND ? AND payment=?");
			pst.setString(1, date1);
			pst.setString(2, date2);
			pst.setString(3, "現金");
			rs= pst.executeQuery();
			while(rs.next()) {
				amount[0]=rs.getInt("revenue");
				}
			//pay check
			PreparedStatement pst2 = conn.prepareStatement("SELECT SUM(price) AS revenue FROM complete_case WHERE Date BETWEEN  ? AND ? AND payment=?");
			pst2.setString(1, date1);
			pst2.setString(2, date2);
			pst2.setString(3, "支票");
			rs= pst2.executeQuery();
			while(rs.next()) {
				amount[1]=rs.getInt("revenue");
			}
			// credit card
			PreparedStatement pst3 = conn.prepareStatement("SELECT SUM(price) AS revenue FROM complete_case WHERE Date BETWEEN  ? AND ? AND payment=?");
			pst3.setString(1, date1);
			pst3.setString(2, date2);
			pst3.setString(3, "信用卡");
			rs= pst3.executeQuery();
			while(rs.next()) {
				amount[2]=rs.getInt("revenue");
			}
			conn.close();
			
			
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		};
		return amount;
	}
	
	public ArrayList getcustrepairitem(String id) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM repair_item WHERE list_ID=?");  
				pst.setString(1, id);
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("repair_item"));
				
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	public ArrayList getcustrepairitem2(String id) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			ResultSet rs2 = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst1 = conn.prepareStatement("SELECT * FROM customer_maintain_info WHERE ID=?");  
			pst1.setString(1, id);
			rs= pst1.executeQuery();
			
			
			PreparedStatement pst2 = conn.prepareStatement("SELECT * FROM repair_item WHERE list_ID=?");  
				pst2.setString(1, id);
				rs2= pst2.executeQuery();
				
			while(rs.next()) {
				while(rs2.next()) {
					arrL.add(rs2.getString("repair_item")+"          "+rs.getString("time"));
				}
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	public void updatecustmile(String mile, String carplate) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			
			PreparedStatement stmt = conn.prepareStatement("UPDATE customer_info SET mile=? WHERE Car_plate = ?");
			stmt.setString(1, mile);
			stmt.setString(2, carplate);
			
			stmt.executeUpdate();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
	}
	public void addcompletecase(String[] info){
		String[] vi=new String[6];
		vi=info;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO complete_case (ID, work_id,car_plate,invoiceYesNo,price,payment,ps) VALUES(?,?,?,?,?,?,?)");
			stmt.setString(1, vi[0]);
			stmt.setString(2, vi[1]);
			stmt.setString(3, vi[2]);
			stmt.setString(4, vi[3]);
			stmt.setString(5, vi[4]);
			stmt.setString(6, vi[5]);
			stmt.setString(7, vi[6]);
			stmt.executeUpdate();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
	}
	public int countcompletecase() {
		int amount =0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			String sql =("SELECT COUNT(*) AS total FROM complete_case");
			rs= st.executeQuery(sql);
			while(rs.next()) {
			amount=rs.getInt("total");
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return amount;
	}
	
	public ArrayList getcompletecaes(String id) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM complete_case WHERE ID=?");  
				pst.setString(1, id);
				rs= pst.executeQuery();
				
			while(rs.next()) {
				
				arrL.add(rs.getString("work_id"));
				arrL.add(rs.getString("car_plate"));
				arrL.add(rs.getString("invoiceYesNo"));
				arrL.add(rs.getString("price"));
				arrL.add(rs.getString("payment"));
				arrL.add(rs.getString("Date"));
				arrL.add(rs.getString("ps"));
				
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	
	public int checkcompletecase (String index) { 
		int flag=0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM complete_case WHERE work_id=?");  
				pst.setString(1, index);
				rs= pst.executeQuery();
			if(rs.next()) {
				flag=1;
			}else {
				flag=0;
			}
			
			
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		return flag;
	}
	
	public ArrayList getorderid(String carplate) {
		ArrayList<String> arrL = new ArrayList<>(); 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			ResultSet rs = null;
			Statement st=null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
			st=conn.createStatement();
			//System.out.print("Database is connected !");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM customer_maintain_info WHERE car_plate=?");  
				pst.setString(1, carplate);
				rs= pst.executeQuery();
				
			while(rs.next()) {
				arrL.add(rs.getString("ID"));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);
		}
		
		return arrL;
	}
	
}
