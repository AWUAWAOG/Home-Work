package HW9;

public class BelarusianHen extends Hen {
    private static int COUNT_OF_EGGS_PER_MONTH = 2285;
    private final int MONTH = 12;

    @Override
    int getCountOfEggsPerMonth() {
        System.out.println("Eggs Per Month: " + COUNT_OF_EGGS_PER_MONTH);
        return this.COUNT_OF_EGGS_PER_MONTH;
    }

    @Override
    int getCountOfEggsPerYear() {
        System.out.println("Eggs Per Year: " + COUNT_OF_EGGS_PER_MONTH * MONTH);
        return this.COUNT_OF_EGGS_PER_MONTH * MONTH;
    }

    @Override
    String getDescription() {
        System.out.print("My country is Belarus. " + "Belarusian ");
        return super.getDescription();
    }
}
