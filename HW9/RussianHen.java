package HW9;

public class RussianHen extends Hen {
    private final int COUNT_OF_EGGS_PER_MONTH = 3245;
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
        System.out.print("My country is Russia. " + "Russian ");
        return super.getDescription();

    }
}
