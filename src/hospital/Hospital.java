package hospital;

import java.util.ArrayList;

public class Hospital {
    
    ArrayList doctor = new ArrayList<Doctor>();
    ArrayList nurse = new ArrayList<Nurse>();
    ArrayList patient = new ArrayList<Patient>();
    ArrayList room = new ArrayList<Room>();
    
    public void addPatient (Patient newPatient) {
        this.patient.add(newPatient);
    }
    
    public void addDoctor (Doctor newDoctor ) {
        this.doctor.add(newDoctor);
    }
    
    public void addNurse (Patient newNurse ) {
        this.nurse.add(newNurse);
    }
    
    public void addRoom (Room newRoom ) {
        this.room.add(newRoom);
    }
    
}
