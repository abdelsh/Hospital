package hospital;

public class Office extends Room {
    private Doctor doctor = new Doctor();
    private int numOfFiles;

    public Office(int numOfFiles, int id, double size, String location) {
        super(id, size, location);
        this.numOfFiles = numOfFiles;
    }

    public Office() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getNumOfFiles() {
        return numOfFiles;
    }

    public void setNumOfFiles(int numOfFiles) {
        this.numOfFiles = numOfFiles;
    }

    @Override
    public String toString() {
        return "Office{" + "doctor=" + doctor + ", numOfFiles=" + numOfFiles + '}';
    }
    
    
}
