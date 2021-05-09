package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.PatientDTO;
import Utils.DBUtils;
public class PatientDAL 
{
	private DBUtils db = null;
	private Connection con = null;
	private PreparedStatement pre = null;
	private ResultSet rs = null;
	
	public ArrayList<PatientDTO> getAllPatients()
	{
		ArrayList<PatientDTO> result = new ArrayList<PatientDTO>();
		String sqlSelectAll = "Select * from patient";
		try
		{
			db = new DBUtils();
			con = db.getConnect();
			pre = con.prepareStatement(sqlSelectAll);
			rs = pre.executeQuery();
			while(rs.next())
			{
				PatientDTO patient = new PatientDTO();
				patient.setId(rs.getInt(1));
				patient.setName(rs.getString(2));
				patient.setGender(rs.getString(3));	
				patient.setDayOfBirth(rs.getDate(4));
				patient.setPhone(rs.getString(5));
				patient.setAddress(rs.getString(6));
				patient.setiCard(rs.getString(7));
				patient.setCreatedBy(rs.getString(8));
				patient.setCreatedDate(rs.getDate(9));
				patient.setModifiedBy(rs.getString(10));
				patient.setModifiedDate(rs.getDate(11));
				patient.setStatus(rs.getString(12));
				
				
				result.add(patient);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				con.close();
				pre.close();
				rs.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public ArrayList<PatientDTO> getPatientsById(PatientDTO patientDTO)
	{
		ArrayList<PatientDTO> result = new ArrayList<PatientDTO>();
		String sqlSelectById = "select * from patient where = ?";
		try
		{
			db = new DBUtils();
			con = db.getConnect();
			pre = con.prepareStatement(sqlSelectById);
			pre.setInt(1, patientDTO.getId());
			rs = pre.executeQuery();
			while(rs.next())
			{
				PatientDTO patient = new PatientDTO();
				patient.setId(rs.getInt(1));
				patient.setName(rs.getString(2));
				patient.setGender(rs.getString(3));	
				patient.setDayOfBirth(rs.getDate(4));
				patient.setPhone(rs.getString(5));
				patient.setAddress(rs.getString(6));
				patient.setiCard(rs.getString(7));
				patient.setCreatedBy(rs.getString(8));
				patient.setCreatedDate(rs.getDate(9));
				patient.setModifiedBy(rs.getString(10));
				patient.setModifiedDate(rs.getDate(11));
				patient.setStatus(rs.getString(12));
				
				
				result.add(patient);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				con.close();
				pre.clearParameters();
				rs.close();
			}
			catch (SQLException e0)
			{
				e0.printStackTrace();
			}
		}
		return result;
	}
}
