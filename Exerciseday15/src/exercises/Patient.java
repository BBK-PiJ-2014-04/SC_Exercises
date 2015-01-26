package exercises;

public class Patient {
	private String name;
	private int age;
	private Patient nextPatient;
	
	public Patient(String name, int age) {
		if(age < 0 && age > 130) throw new RuntimeException("The guy is either yet to be born or Methuselah");
		this.name = name;
		this.age = age;
	}

	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			// this means this is the last patient in the list
			this.nextPatient = newPatient;
		} 
		else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public boolean deletePatient(Patient patient) {
		if (this.nextPatient == null) {
			// patient to remove was not found
			return false;
		} 
		else if (this.nextPatient.name.equals(patient.name)) {
		// We found it! It is the next one!
		// Now link this patient to the one after the next
			this.nextPatient = nextPatient.nextPatient;
			return true;
		} 
		else {
			return this.nextPatient.deletePatient(patient);
		}
	}
	
	public Patient getNextPatient() {
		return nextPatient;
	}
	
	public String showPatientInfo() {
		return String.format("Patient Name: %s; Age: %d", name, age);
	}

}
