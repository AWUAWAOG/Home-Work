package ClasssesMethods.Hospital;

public class HW8 {
    public static void main(String[] args) {

        Surgeon surgeon = new Surgeon();
        surgeon.toTreat();
        Therapist therapist = new Therapist();
        therapist.toTreat();
        Dentist dentist = new Dentist();
        dentist.toTreat();
        System.out.println();

        Patient patient = new Patient();
        patient.setTreatingPlan(1);
        therapist.patient(1);
        surgeon.toTreat();

    }
}
