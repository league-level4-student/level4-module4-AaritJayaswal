package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor{
ArrayList <Patient> waiting = new ArrayList<>();
	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if(waiting.size()>=3) {
			throw new DoctorFullException();
		}
		else {
			waiting.add(patient);
		}
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for(int i = 0; i < waiting.size(); i++) {
			waiting.get(i).checkPulse();
		}
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return waiting;
	}

}