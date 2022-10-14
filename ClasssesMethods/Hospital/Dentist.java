package ClasssesMethods.Hospital;

public class Dentist extends Doctor {

    @Override
    public void toTreat() {
        super.toTreat();
        System.out.println("Dentist");
    }

}