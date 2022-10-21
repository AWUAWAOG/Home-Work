package HW9;

public abstract class Hen {
    private String chicken;
    private int allEggsInYear;

    public void AllEggsYear() {
        allEggsInYear += getCountOfEggsPerYear();
    }

    abstract int getCountOfEggsPerMonth();

    abstract int getCountOfEggsPerYear();

    String getDescription() {
        System.out.println("Hen");
        return this.chicken;
    }

}

