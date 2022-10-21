package HW9;

import jdk.dynalink.beans.BeansLinker;

import java.util.Random;

public class HW9 {
    public static void main(String[] args) {

        RussianHen russianHen = new RussianHen();
        russianHen.getDescription();
        russianHen.getCountOfEggsPerMonth();
        russianHen.getCountOfEggsPerYear();
        System.out.println();

        UkrainianHen ukrainianHen = new UkrainianHen();
        ukrainianHen.getDescription();
        ukrainianHen.getCountOfEggsPerMonth();
        ukrainianHen.getCountOfEggsPerYear();
        System.out.println();

        MoldovanHen moldovanHen = new MoldovanHen();
        moldovanHen.getDescription();
        moldovanHen.getCountOfEggsPerMonth();
        moldovanHen.getCountOfEggsPerYear();
        System.out.println();

        BelarusianHen belarusianHen = new BelarusianHen();
        belarusianHen.getDescription();
        belarusianHen.getCountOfEggsPerMonth();
        belarusianHen.getCountOfEggsPerYear();
        System.out.println();

        
    }
}
