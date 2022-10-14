package ClasssesMethods.Hospital;

public class Patient {
    private int treatingPlan = 1;
    private int doctor = 1;

    public Patient() {
    }

    public Patient(int doctor) {
        this.doctor = doctor;
    }

    public int setTreatingPlan(int treatingPlan) {
        this.treatingPlan = treatingPlan;
        return treatingPlan;
    }
}