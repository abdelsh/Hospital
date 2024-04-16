package hospital;

public class PatientRoom extends Room {
    private double bedSize;
    private Patient patient = new Patient();

    public PatientRoom(double bedSize, int id, double size, String location) {
        super(id, size, location);
        this.bedSize = bedSize;
    }

    public PatientRoom() {
    }

    public double getBedSize() {
        return bedSize;
    }

    public void setBedSize(double bedSize) {
        this.bedSize = bedSize;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "PatientRoom{" + "bedSize=" + bedSize + ", patient=" + patient + '}';
    }
    
    
    
}
