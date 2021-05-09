package BLL;

import DTO.PatientDTO;

import java.util.ArrayList;

import DAL.PatientDAL;
import Utils.DBUtils;

public class PatientBLL 
{
	PatientDAL patientDAL = new PatientDAL();
	public ArrayList<PatientDTO> getAllPatients()
	{
		return patientDAL.getAllPatients();
	}
	
	public ArrayList<PatientDTO> getPatientsById(PatientDTO patientDTO)
	{
		return patientDAL.getPatientsById(patientDTO);
	}
}
