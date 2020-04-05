package myAppli;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Queries {

	public static List<Personne> queryPersonne(Connection conn) throws SQLException {
		String sql = "Select a.* from Personne a ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		ResultSet rs = pstm.executeQuery();
		List<Personne> list = new ArrayList<Personne>();
		while (rs.next()) {
			
			Integer id = Integer.valueOf(rs.getString("ID"));
			String firstName = rs.getString("FIRST_NAME");
			String lastName = rs.getString("LAST_NAME");
			String adress = rs.getString("ADRESSE");
			
			Personne personne = new Personne();
			personne.setIdPersonne(id);
			personne.setFirstName(firstName);
			personne.setLastName(lastName);
			personne.setAdress(adress);

			list.add(personne);
		}
		return list;
	}

}
