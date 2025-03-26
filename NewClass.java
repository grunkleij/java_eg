package jtableexample;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class NewClass extends JFrame {
	
	public NewClass() {
		setTitle("Student title");
		setSize(500,300);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		String[] columns  = {"Roll No","Name","Marks"};
		DefaultTableModel model = new DefaultTableModel(columns, 0);
		JTable table= new JTable(model);
		
		add(new JScrollPane(table));
		loadData(model);
		setVisible(true);
	}
	
	public void loadData(DefaultTableModel model) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","1234");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select roll_no, name, marks from students");
			while(rs.next()) {
				Object[] row = {rs.getInt("roll_no"),rs.getString("name"), rs.getInt("marks")};
				model.addRow(row);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewClass();
	}

}
