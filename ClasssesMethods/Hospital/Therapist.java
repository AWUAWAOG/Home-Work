package ClasssesMethods.Hospital;

public class Therapist extends Doctor {
    private int plan;

    @Override
    public void toTreat() {
        super.toTreat();
        System.out.println("Therapist");
    }

    public int patient(int plan) {
        Patient patient = new Patient(1);
        return plan;
    }
}
