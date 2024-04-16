package hospital;

public class Patient extends Human implements Payment{
    private int id, numOfDays;
    private String illness;
    private double costEacDay;
    
    private Doctor doctor = new Doctor();
    private Nurse nurse = new Nurse();
    
  
    @Override
    public void calculatePayment () {}

    public Patient(int id, int numOfDays, String illness, double costEacDay, String name, String gender, double weight, double height, int age) {
        super(name, gender, weight, height, age);
        this.id = id;
        this.numOfDays = numOfDays;
        this.illness = illness;
        this.costEacDay = costEacDay;
    }

    public Patient() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumOfDays() {
        return numOfDays;
    }

    public void setNumOfDays(int numOfDays) {
        this.numOfDays = numOfDays;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public double getCostEacDay() {
        return costEacDay;
    }

    public void setCostEacDay(double costEacDay) {
        this.costEacDay = costEacDay;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", numOfDays=" + numOfDays + ", illness=" + illness + ", costEacDay=" + costEacDay + ", doctor=" + doctor + ", nurse=" + nurse + '}';
    }
    
}
