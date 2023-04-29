package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> docs = new ArrayList<>();
	ArrayList<Patient> patients = new ArrayList<>();

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return docs;
	}

	public void addDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		docs.add(doc);
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		while (j < docs.size()) {
			while (docs.get(j).waiting.size() < 3 && i < patients.size()) {
				try {
					docs.get(j).assignPatient(patients.get(i));
				} catch (DoctorFullException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
			}
			j++;
		}
	}

}