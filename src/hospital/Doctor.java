package hospital;

import java.util.ArrayList;

public class Doctor extends Staff implements Payment{
    private String specialization, assistant;
    
    ArrayList patient = new ArrayList<Patient>();
    private Office office = new Office();
    private Nurse nurse = new Nurse();

    
    @Override
    public void calculatePayment () {}
    
    public void addPatient (Patient newPatient) {
        this.patient.add(newPatient);
    }
    
    
    public Doctor(String specialization, String assistant) {
        this.specialization = specialization;
        this.assistant = assistant;
    }

    public Doctor() {
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public ArrayList getPatient() {
        return patient;
    }

    public void setPatient(ArrayList patient) {
        this.patient = patient;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    @Override
    public String toString() {
        return "Doctor{" + "specialization=" + specialization + ", assistant=" + assistant + ", patient=" + patient + ", office=" + office + ", nurse=" + nurse + '}';
    }
    
    
    
}
