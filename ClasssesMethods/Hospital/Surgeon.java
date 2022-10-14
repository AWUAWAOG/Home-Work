package ClasssesMethods.Hospital;

public class Surgeon extends Doctor {

    @Override
    public void toTreat() {
        super.toTreat();
        System.out.println("Surgeon");
    }

}